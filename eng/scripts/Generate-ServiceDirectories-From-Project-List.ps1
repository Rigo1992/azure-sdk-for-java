# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

# Use case:
# Given a project list, set following environment variables in JSON format:
# 1. SparseCheckoutDirectories - This the list of sparse checkout paths that will be used by sparse-checkout.yml
# 2. ServiceDirectories - A list of ServiceDirectories.
#
# The project list should be generated by a call to generate-project-list-and-cache-maven-repository.yml
# prior to calling this script.
param(
  # $(Build.SourcesDirectory) - root of the repository
  [Parameter(Mandatory=$true)][string]$SourcesDirectory,
  # ArtifactsList will be using ('${{ convertToJson(parameters.Artifacts) }}' | ConvertFrom-Json | Select-Object name, groupId)
  [Parameter(Mandatory=$true)][array] $ProjectList
)

$StartTime = $(get-date)
. "${PSScriptRoot}/../common/scripts/common.ps1"
$Path = Resolve-Path ($PSScriptRoot + "/../../")
$script:FoundError = $false

Write-Host "SourcesDirectory=$SourcesDirectory"
Write-Host "ProjectList=$ProjectList"

function Build-Unreleased-List-From-File {
    param([string]$versionFile)
    $unreleasedList = @()
    foreach($line in Get-Content $versionFile) {
        if (!$line -or $line.Trim() -eq '' -or $line.StartsWith("#") -or !$line.StartsWith("unreleased_")) {
            continue
        } else {
            $split = $line.Split(";")
            if ($split.Length -ne 2) {
                LogError("Malformed unreleased_ dependency line in $versionFile. line=$line")
                # If there's a malformed unreleased_ dependency line in version_client.txt then
                # immediately exit. This is the only place we need to immediately exit.
                exit(1)
            }
            $temp = $split[0].Replace("unreleased_","")
            $unreleasedList += $temp
        }
    }
    return ,$unreleasedList
}

$unreleasedList = @()
# version_client is the only version file that will have unreleased_ dependencies as these
# are disallowed for data track libraries.
$unreleasedList = Build-Unreleased-List-From-File $Path\eng\versioning\version_client.txt

$sparseCheckoutDirHash = @{}
$serviceDirHash = @{}
foreach($file in Get-ChildItem -Path $SourcesDirectory -Filter pom*.xml -Recurse -Depth 3 -File) {
    $xmlPomFile = $null
    $xmlPomFile = New-Object xml
    $xmlPomFile.Load($file.FullName)
    $library = $xmlPomFile.project.groupId + ":" + $xmlPomFile.project.artifactId
    $serviceDirectory = (Get-Item $file).Directory.Parent
    # This if check is only necessary because resourcemanager and resourcemanagerhybrid contain the
    # exact same group/artifact ids
    if ($file.FullName.Split([IO.Path]::DirectorySeparatorChar) -notcontains "resourcemanagerhybrid") {
        # The directories for sparse checkout and ServiceDirectories need the $SourcesDirectory
        # stripped off
        $tempDir = $serviceDirectory.FullName.Replace("$SourcesDirectory", "")
        $tempDir = $tempDir.Replace([IO.Path]::DirectorySeparatorChar, '/')
        $sparseCheckoutDirHash.Add($library, $tempDir)
        if ($tempDir.StartsWith("/sdk/")) {
            # Strip off the "/sdk/" to get the service directory. A ServiceDirectory will always have
            # the format of /SDK/<ServiceDirectory>. Whereas sparse checkout can have other directories
            # outside of /SDK, eg. /common
            $tempDir = $tempDir.Replace("/sdk/", "")
            $serviceDirHash.Add($library, $tempDir)
        }
    }
}

$sparseCheckoutDirectories = @()
$serviceDirectories = @()
$sparseCheckoutDirectories += "/sdk/parents"
foreach ($project in $ProjectList) {
    if ($sparseCheckoutDirHash.ContainsKey($project)) {
        $sparseCheckoutDirectories += $sparseCheckoutDirHash[$project]
        $serviceDirectories += $serviceDirHash[$project]
    } else {
        LogError("Did not find $project in any pom files")
        $script:FoundError = $true
    }
}

# This is sad. Because resourcemanager and resourcemanagerhybrid contain the some of the same
# artifacts and we don't know which one is actually needed, if resourcemanager is in the list
# then add resourcemanagerhybrid.
Write-Host "sparseCheckoutDirectories=$sparseCheckoutDirectories"
if ($sparseCheckoutDirectories.Contains("/sdk/resourcemanager")) {
    $sparseCheckoutDirectories += "/sdk/resourcemanagerhybrid"
}

# Unreleased_ libraries are special. They're the only case, outside of FromSource runs where
# libraries from other service directories, outside of the one we're building, need to get built.
# It's easier to just add any unreleased_ dependency service directories to the sparse checkout
# and service directory variables. The alternative requires a lot of specific pom file and
# dependent pom file processing which is messy. The result here is that we may have an extra
# service directory being sunk up when it wasn't necessary. The overall time of that sync
# is a measured in seconds which isn't expensive and far outweighs the alternative mentioned
# above.
foreach ($project in $unreleasedList) {
    if ($sparseCheckoutDirHash.ContainsKey($project)) {
        $sparseCheckoutDirectories += $sparseCheckoutDirHash[$project]
    } else {
        LogError("Did not find unreleased $project in any pom files")
        $script:FoundError = $true
    }
}

if ($script:FoundError) {
    exit 1
}

$temp =  ConvertTo-Json @($sparseCheckoutDirectories | Sort-Object | Get-Unique) -Compress
Write-Host "setting env variable SparseCheckoutDirectories = $temp"
Write-Host "##vso[task.setvariable variable=SparseCheckoutDirectories;]$temp"
$temp =  ConvertTo-Json @($serviceDirectories | Sort-Object | Get-Unique) -Compress
Write-Host "setting env variable ServiceDirectories = $temp"
Write-Host "##vso[task.setvariable variable=ServiceDirectories;]$temp"
$ElapsedTime = $(get-date) - $StartTime
if ($ElapsedTime -lt 0) {
    $ElapsedTime = [datetime]0
}
$TotalRunTime = "{0:HH:mm:ss}" -f ([datetime]$ElapsedTime.Ticks)
Write-Host "Total run time=$($TotalRunTime)"
