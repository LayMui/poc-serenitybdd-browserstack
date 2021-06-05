## Instructions
```
# To run the test
./serenity.sh iOS

# Env vars setting
export BROWSERSTACK_USERNAME=xxxxx
export BROWSERSTACK_ACCESS_KEY=xxxxx
export BROWSERSTACK_APP_ID=bs://xxxxx


## Reference:
https://www.browserstack.com/docs/automate/selenium/getting-started/java/serenity/local-testing

# How to upload the ipa via curl command
curl -u "laymuitoh1:xxxxx" \
-X POST "https://api-cloud.browserstack.com/app-automate/upload" \
-F "file=@/User/laymui/dev/rn-first-app.ipa” \
-F "custom_id=rnfirstapp”


# Issues:
ERROR] demo.CucumberTestSuite  Time elapsed: 6.694 s  <<< ERROR!
com.browserstack.local.LocalException: Either another browserstack local client is running on your machine or some server is listening on port 45691

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   CucumberTestSuite>BrowserStackSerenityTest.setUp:41 » Local Either another bro...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 


# Useful command
# ps aux | grep BrowserStackLocal | awk ‘{print $2}’ | xargs kill -9 
ps -ef | grep BrowserStackLocal

# Issue #2
[ERROR]   Error Domain=com.facebook.WebDriverAgent Code=1 "The on-screen keyboard must be present to send keys" UserInfo={NSLocalizedDescription=The on-screen keyboard must be present to send keys} (WARNING: The server did not provide any stacktrace information)
Command duration or timeout: 0 milliseconds
B

Need to set appium version to 1.18.0
bstack_browserstack.appium_version=1.18.0