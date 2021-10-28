package starter.steps


import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.ensure.Ensure
import starter.pages.DemoPage

class DemoSteps {
    Actor actor = Actor.named("NgaKim")
    DemoPage demoPage

    @Given("Open this web page")
    public void openThisWebPage() {
        demoPage.open()
    }

    @When("Select the {string} radio button option")
    public void selectTheRadioButtonOption(String option) {
        actor.attemptsTo(Click.on(demoPage.getOptionByName(option)))
    }

    @And("Click the {string} Button")
    public void clickTheButton(String button) {
        actor.attemptsTo(Click.on(demoPage.buttonNext))
    }

    @Then("Assert text {string} exists")
    public void assertTextExists(String text) {
        actor.attemptsTo(
                Ensure.that(demoPage.getMessage.getText()).contains(text))
    }

}
