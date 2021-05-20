package demo;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import demo.browserstack.BrowserStackSerenityTest;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"classpath:features"},
        glue = { "classpath:demo.stepdefinitions"},
        strict = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuite extends BrowserStackSerenityTest  {
   
}
