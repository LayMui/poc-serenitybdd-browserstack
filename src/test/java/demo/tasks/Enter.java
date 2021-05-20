package demo.tasks;

import demo.pageobjects.GoalPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class Enter {
    public static Performable newGoal(String goal) {
        return Task.where(
                "{0} attempts to enter #goal",
                theValue(goal).into(GoalPage.inputText),
                Click.on(GoalPage.addButton))
                .with("goal")
                .of(goal);

    }
}
