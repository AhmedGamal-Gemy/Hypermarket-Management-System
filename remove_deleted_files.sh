#!/bin/sh

# Read the repository root path
echo "Enter the repository path :"
read path

# Navigate to the repository root (optional, adjust as needed)
cd ${path}

# Stage all deleted files for removal
git ls-files --deleted -z | xargs -0 git rm

# Commit the changes
git commit -m "Remove deleted files from repository"

# Push to the remote repository
git push origin main

echo "Deleted files have been removed from the repository and changes pushed to the remote."
