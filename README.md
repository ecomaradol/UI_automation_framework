#  UI Automation Framework for 'DJI' website

Click [here](https://www.dji.com/products/professional) to take a look at the website!

## Technologies used in the project:

[<img alt="Java" height="70" src="images/logo/Java.svg" width="70"/>](https://www.java.com/)
[<img alt="IDEA" height="70" src="images/logo/Idea.svg" width="70"/>](https://www.jetbrains.com/idea/)
[<img alt="Github" height="70" src="images/logo/GitHub.svg" width="70"/>](https://github.com/)
[<img alt="JUnit 5" height="70" src="images/logo/Junit5.svg" width="70"/>](https://junit.org/junit5/)
[<img alt="Gradle" height="70" src="images/logo/Gradle.svg" width="70"/>](https://gradle.org/)
[<img alt="Rest-assured" height="70" src="images/logo/Selenide.svg" width="70"/>](https://rest-assured.io/)
[<img alt="Rest-assured" height="70" src="images/logo/Selenoid.svg" width="70"/>](https://aerokube.com/selenoid/)
[<img alt="Allure" height="70" src="images/logo/Allure.svg" width="70"/>](https://github.com/allure-framework/allure2)
[<img alt="Jenkins" height="70" src="images/logo/Jenkins.svg" width="70"/>](https://www.jenkins.io/)
[<img alt="Allure_EE" height="70" src="images/logo/Allure_EE.svg" width="70"/>](https://qameta.io/)


## What is special about this project:

✓ PageObjects

✓ Parameterized build

✓ Owner.config

✓ Telegram notifications


## To run tests locally use:

```
gradle clean test 
```


## Test cases

✓ Add a new pet to the store

✓ Find pet by ID

✓ Find pet by status

✓ Delete a pet

✓ Find non-existing pet by ID


## Jenkins Job

Jenkins is an automation server which lets us run tests

Click <a target="_blank" href="https://jenkins.autotests.cloud/job/11-Mara_dol-api/">here</a> to see the job for "Dji" website

<p align="center">
<img title="Jenkins job" src="images/screenshot/jenkinsApi.PNG">
</p>

## Allure report

Allure Report is a flexible, lightweight test reporting tool. It provides clear graphical reports and allows extracting
the maximum of information from the everyday testing process.

Click <a target="_blank" href="https://jenkins.autotests.cloud/job/11-Mara_dol-api/2/allure/">here</a> to see the report for "Dji" website


### Test suites

<p align="center">
<img title="Allure Test Suites" src="images/screenshot/allureTestSuites.PNG">
</p>


### Graphs

<p align="center">
<img title="Allure Graphs" src="images/screenshot/allureGraphs.PNG">
</p>


## Allure TestOps

Allure TestOps allows you to manage testing in one place.
Supports the full testing lifecycle for both manual and automated tests.

Click <a target="_blank" href="https://allure.autotests.cloud/project/1335/launches">here</a> to see the lanches for "Dji" website

### Dashboard
<p align="center">
<img title="TestOps Dashboard" src="images/screenshot/testOpsDashboard.PNG">
</p>

### Test Cases
<p align="center">
<img title="TestOps Test Cases" src="images/screenshot/testOpsTestCases.PNG">
</p>


## Telegram Notification

After the tests are completed, the report comes to Telegram using a bot

<p align="center">
<img title="Telegram Notification" src="images/screenshot/telegramNotification.PNG">
</p>

# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/%s">allure.autotests.cloud/project/%s</a> (ask admin@qa.guru for access)

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/%s">jenkins.autotests.cloud/job/%s</a>


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
