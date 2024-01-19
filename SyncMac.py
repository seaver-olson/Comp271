import os
import subprocess
import shutil

local_folder = "/Users/sjols/OneDrive/Desktop/Projects/Comp271"
github_repo = "https://github.com/seaver-olson/Comp271"

# Update local repository
def sync_with_github():
    os.chdir(local_folder)
    subprocess.run(["git", "pull"])

# Clone the repository if not exists
if not os.path.exists(local_folder):
    subprocess.run(["git", "clone", github_repo, local_folder])

# Schedule the script to run on wake up using cron jobs
# Open terminal and type 'crontab -e' to edit cron jobs, then add the following line:
# @reboot /usr/bin/python3 /path/to/sync_on_wake_mac.py

# Save this script as sync_on_wake_mac.py
