This is a test framework which uses Selenium for browser automation:

TestNG - used for testing framework
Selenium webdriver
webdriver manager
Maven
Java
eclipse IDE
Allure report

Setup for framework - uses Page Object Model for Design Pattern:
1.Creted Maven project.
2.Created Baseclass for browser intialization and teardown.
3.Each page for the application has its class (pages package)
4.TestNG framework is used for running tests
5.webdrivermanager dependencies is used to avoid browser version errors.
6.Allure dependencies is used for generating reports.

