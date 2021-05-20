package demo.tasks;

import demo.pageobjects.GoalPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Add {
    public static Performable newGoal() {
        return Task.where(
                "{0} attempts to add new goal",
                Click.on(GoalPage.addNewGoalButton));

    }
}
