
# == Note ==
(c) Laxmi Somni 

All tests are build using standard packaging solution: Maven. & could be centrally deployed using standard POM.XML Test are written in Cucumber BDD fashion

#### System Requirements: 
Firefox 80.0 or any latest version
Or Chrome Version 90.0.* {In case of Chrome you'll need to unzip chromedriver located in driverDir folder}
If you're having Chrome 81.0+ then you'll need to replace chromedriver with  chromedriver_81 in driverDir folder.
Latest chromeDriver can be downloaded from:
https://chromedriver.chromium.org/downloads
 
OS: Mac OS X or Win 8

Java 8 SDK

## To Run the Tests

Option1 (preferred)
a) Import Maven Dependencies 

b) Check the BDD Feature files located at:

```> src/test/resources/features```

b) In IntelliJ Go to **src> test> runners> RunCucumberIT** 

c) Right click and Run


Note:

The Test Runner will create Cucumber report at below folder `target/cucumber-html-report`

Also, a interactive Donut report will be created in ${project.build.directory}/donut

## Test Results
<img width="1200" alt="Screen Shot 2021-05-24 at 10 32 29" src="https://user-images.githubusercontent.com/7977484/119327931-6d8eb380-bc7b-11eb-9c05-9f246828deab.png">

## Test Approach & Future enhancements

Enhancements that could be added
a) To enable screen recording of entire run.
b) Adding EventFiring WebDriver
c) Adding Retry listner
d) Adding Stream API
e) Adding parameterisation for any future logged-in users

Please feel free to get back to me on the below email:
`laxmi.somni@gmail.com`

Many Thanks