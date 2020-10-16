# fetchRewardsTestFbProject
Fetch Rewards SDET Code Challenge

Setup
Download and Install Appium server
Download and Install Eclipse IDE
Create Java project
Install Android SDK Manager and AVD manager
Add selenium and Appium jar files to the project
Use TestNG framework to execute test scripts i.e use testing annotations to create test cases.

Procedure:
Connect mobile device
Start Appium server
Write java testing script in eclipse:
Initial setup code
a)	Declare Appium driver
b)	Using the apk, find out app package name and activity name 
c)	Add all capabilities required.
d)	In the capabilities section, platform version needs to be passed eg 8.0.0
e)	Start AppiumDriver using the URL to the Appium server launched
Main Code
a)	To locate elements, use Appium Desktop client.
b)	Use these locators and write it in the main code.
c)  Username and password needs to be passed in the code.
Exit code
a)	Use quit() to close the application

Run the code and see the result in emulator or any connected mobile device.

