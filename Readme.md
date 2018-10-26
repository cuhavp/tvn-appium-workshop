# TVNClub Offline 10/2018 - Appium Workshop

## Require install software
1. Java jdk
2. Android sdk
3. JetBrain Intellij
4. Ruby
5. ios-inspector
6. Appium desktop
7. Appium studio
8. Katalon Studio

## Sample Code
1. Chrome Android sample code [here](/src/test/java/web/ChromeAndroid.java)
2. Safari IOS sample code [here](/src/test/java/web/SafariIphone.java)
3. Android Calculator sample code [here](/src/test/java/app/AndroidNativeApp.java)
4. IOS Photo sample code [here](/src/test/java/app/IOSNativeApp.java)
5. Machine Learning and Appium sample [here](/src/test/java/ai/IOSPhotoApp.java)
6. Find Element by Image sample [](/src/test/java/image/FindByImage.java)

## Running Multiple Appium Tests in Parallel
Step 1: Start Appium 
```bash
$ appium -p 10000
```
```bash
$ appium -p 10001
```
Step 2: Perform test
1. on android devices
```bash
mvn clean test -Dtest.suite=android-parallel-test.xml
```
2. on IOS devices
```bash
mvn clean test -Dtest.suite=ios-parallel-test.xml
```


