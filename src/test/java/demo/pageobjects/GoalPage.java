package demo.pageobjects;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoalPage extends PageObject {

    public static final Target addNewGoalButton = Target.the("add new goal button").located(MobileBy.AccessibilityId("btnAddNewGoal"));
    public static final Target inputText = Target.the("course goal textfield").located(MobileBy.AccessibilityId("inputCourseGoal"));
    public static final Target cancelButton = Target.the("cancel button").located(MobileBy.AccessibilityId("btnCancel"));
    public static final Target addButton = Target.the("add button").located(MobileBy.AccessibilityId("btnAdd"));
}
