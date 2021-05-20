package demo.stepdefinitions;

import demo.pageobjects.GoalPage;
import demo.tasks.Add;
import demo.tasks.Enter;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.webdriver.driverproviders.DriverCapabilities;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoalStepDefinitions {

    private final Logger log = LoggerFactory.getLogger(GoalStepDefinitions.class);
    @Steps
    GoalPage goalPage;
    EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    protected IOSDriver<MobileElement> iosDriver() {
        return (IOSDriver<MobileElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    protected AndroidDriver<MobileElement> androidDriver() {
        return (AndroidDriver<MobileElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }


    @Before(value = "@goal")
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @After(value = "@goal")
    public void drawTheCurtain() {

        OnStage.drawTheCurtain();
    }

    @Given("^(.*) is at the add new goal page$")
    public void maryIsAtTheAddNewGoalPage(String actor) {
        
        
        theActorCalled(actor)
                .should(
                        eventually(seeThat(the(GoalPage.addNewGoalButton), isVisible())));
        theActorInTheSpotlight().attemptsTo(Add.newGoal());
        
       }

    @When("^(?:.*) enter her new goal \"(.*)\"")
    public void maryEnterHerNewGoal(String goal) {
      //  eyes.checkWindow("Enter Goal");
        theActorInTheSpotlight().attemptsTo(Enter.newGoal(goal));
    }

    @Then("^she is able to see the goal \"(.*)\" added$")
    public void sheIsAbleToSeeTheGoalAdded(String goal) {
        // Should be checking the list rendered
        theActorInTheSpotlight()
                .should(
                        eventually(seeThat(the(GoalPage.addNewGoalButton), isVisible())));
   //    eyes.checkWindow("List Of Goals Added");
    }
}
