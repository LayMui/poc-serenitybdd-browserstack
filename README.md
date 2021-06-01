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
