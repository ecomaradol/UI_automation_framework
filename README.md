#  UI Automation Framework for 'DJI' website

Click [here](https://www.dji.com/de/products/professional) to take a look at the website!

## Technologies used in the project:

[<img alt="Java" height="70" src="images/logo/Java.svg" width="70"/>](https://www.java.com/)
[<img alt="IDEA" height="70" src="images/logo/Idea.svg" width="70"/>](https://www.jetbrains.com/idea/)
[<img alt="Github" height="70" src="images/logo/GitHub.svg" width="70"/>](https://github.com/)
[<img alt="JUnit 5" height="70" src="images/logo/Junit5.svg" width="70"/>](https://junit.org/junit5/)
[<img alt="Gradle" height="70" src="images/logo/Gradle.svg" width="70"/>](https://gradle.org/)
[<img alt="Selenide" height="70" src="images/logo/Selenide.svg" width="70"/>](https://rest-assured.io/)
[<img alt="Selenoid" height="70" src="images/logo/Selenoid.svg" width="70"/>](https://aerokube.com/selenoid/)
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

✓ Page title has Logo

✓ Page has 'Store' button

✓ Page has left-side menu

✓ Page has footer

✓ Left-side menu has links

✓ Camera stabilizer list is existed

✓ Hover the cursor over the login menu


## Jenkins Job

Jenkins is an automation server which lets us run tests

Click <a target="_blank" href="https://jenkins.autotests.cloud/job/11-Mara_dol-UIAutotests/">here</a> to see the job for "Dji" website

<p align="center">
<img title="Jenkins job" src="images/screenshot/jenkins.PNG">
</p>

It is the job that can run with different parameters as browser, resolution of screen and environment.

<p align="center">
<img title="Jenkins job" src="images/screenshot/jenkinsParams.PNG">
</p>

## Allure report

Allure Report is a flexible, lightweight test reporting tool. It provides clear graphical reports and allows extracting
the maximum of information from the everyday testing process.

Click <a target="_blank" href="https://jenkins.autotests.cloud/job/11-Mara_dol-UIAutotests/7/allure/">here</a> to see the report for "Dji" website


### Test suites

<p align="center">
<img title="Allure Test Suites" src="images/screenshot/allureTestSuites.PNG">
</p>

### Attachments

A screenshot and video are attached for each test.

<p align="center">
<img title="Allure Attachments" src="images/screenshot/allureAttach.PNG">
</p>

### Graphs

<p align="center">
<img title="Allure Graphs" src="images/screenshot/allureGraph.PNG">
</p>


## Allure TestOps

Allure TestOps allows you to manage testing in one place.
Supports the full testing lifecycle for both manual and automated tests.

Click <a target="_blank" href="https://allure.autotests.cloud/project/1348/launches">here</a> to see the lanches for "Dji" website

### Dashboard

<p align="center">
<img title="TestOps Dashboard" src="images/screenshot/testOpsDash.PNG">
</p>

### Test Cases

<p align="center">
<img title="TestOps Test Cases" src="images/screenshot/testOpsTestCases.PNG">
</p>


## Telegram Notification

After the tests are completed, the report comes to Telegram using a bot

<p align="center">
<img title="Telegram Notification" src="images/screenshot/telergam.PNG">
</p>