# Getting Started



## Github

1. To take advantage of the project template Dev Central Station has provided,
   you will need Git. Git can be found [here](https://git-scm.com/downloads).
2. In your Github repo, locate the project you just created:
   1. Click the green button in the upper right corner that says "Clone or
      Download".
   2. Copy the link provided, it should look something like
      `git@github.ford.com:RepoOrgName/Generated project name.git`. For help
      setting up your authentication to GitHub for the first time, please follow
      the directions found
      [here](https://github.ford.com/DevEnablement/pcfdev-guides/blob/master/git/GitConfiguration.md)
3. On your computer, open a terminal window and type `git clone` and the paste
   the link you copied above all in one line - this will clone your repo locally
4. Open your favorite IDE and navigate to the Github folder you just downloaded
   and open it. For help pushing your code to your Github repo or to PCF, scroll
   to the "Commit and push your code" section below

## Proxy Setup with Intellij

1. While using Intellij, go to preferences
2. Navigate to "system settings"->Http proxy
3. Select the "Manual proxy configuration" radio button and then the "HTTP"
   radio button
4. Under "Host name" type `internet.ford.com` and select port `83`
5. Under the "no proxy for" heading, use `*.ford.com, localhost, 127.0.0.1`

## Proxy Setup with Intellij Terminal (Mac)

1. Check to see if any proxy settings are already present by clicking on
   "Terminal" at the bottom
2. Type `env | grep -i proxy` to see if environment variables are set
3. You will want to add the proxy config by typing the following commands:
   ```bash
   export http_proxy=http://internet.ford.com:83
   export https_proxy=http://internet.ford.com:83
   export no_proxy="ford.com,localhost,127.0.0.1"
   export HTTP_PROXY=http://internet.ford.com:83
   export HTTPS_PROXY=http://internet.ford.com:83
   export NO_PROXY="ford.com,localhost,127.0.0.1"
   ```

## Proxy Setup with Intellij Terminal (Windows)

1. Check to see if any proxy settings are already present by clicking on
   "Terminal" at the bottom
2. Type `SET | findstr proxy` to see if any proxy environment variables are set
3. You will want to add the proxy config by typing the following commands:
   ```bat
   set http_proxy=http://internet.ford.com:83
   set https_proxy=http://internet.ford.com:83
   set no_proxy="ford.com,localhost,127.0.0.1"
   set HTTP_PROXY=http://internet.ford.com:83
   set HTTPS_PROXY=http://internet.ford.com:83
   set NO_PROXY="*.ford.com,localhost,127.0.0.1"
   ```

## Build your project locally

To build your project `./gradlew build` command in the terminal of your IDE

### Run your project

To run your project use `./gradlew bootRun` command in the terminal of your IDE.

Your local running app is served on http://localhost:8080/....
### Stop your app

Press `^C` (control-C) to stop your app.

## Commit and push your code with Jenkins

In order to push your code to PCF, Open the terminal in your IDE and use the Git
commands. If you do not have git installed, you can find it
[here](https://git-scm.com/downloads).

1. Type `git add -p` to review changes and accept or reject each. Alternatively,
   you could choose to use `git add .` to add all changes without review.
2. Once your changes have been reviewed, type `git commit -m "Some message about
   what code you changed"`
3. Type `git pull` to grab the latest code from your Github repository
4. Type `git push` to deploy your code to PCF
5. To check the status or progress of your build, navigate to the DCS Shared
   pipeline by going
   [here](https://dcs-jenkins-sandbox.apps.pd01.edc.caas.ford.com/job/sandbox/)
   and locating your team folder.
6. To check your app on PCF, log in to
   https://login.sys.pp01.edc1.cf.ford.com/login, select the space and look for
   the app you deployed. The route(URL) will be will be listed in the last
   column next to your app name.

# Contact Us

Need to notify us of a bug, have issues, new feature request or simply want to
brag? Join the /d/c/s Community Channels!

* [Dev/Central/Station Slack](https://app.slack.com/client/T5V3ZFCD6/C9L83E6DQ)
* [Dev/Central/Station Webex Teams](https://www.webexteams.ford.com/space?r=fz8y)
