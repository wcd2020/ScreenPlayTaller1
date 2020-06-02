package co.com.choucair.certification.tallerscreenplay.stepdefinitions;

import co.com.choucair.certification.tallerscreenplay.model.RegisterPage;
import co.com.choucair.certification.tallerscreenplay.questions.Answer;
import co.com.choucair.certification.tallerscreenplay.tasks.OpenUp;
import co.com.choucair.certification.tallerscreenplay.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomationDemoSiteStepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }
    @Given("^Carlos wants to access the web Automation Demo Site$")
    public void carlosWantsToAccessTheWebAutomationDemoSite()  {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }
    @When("^he performs the registration on the page$")
    public void hePerformsTheRegistrationOnThePage(List<RegisterPage> registerpage) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(registerpage));
    }

    @Then("^he verifies that the screen is loaded with the text (.*)$")
    public void heVerifiesThatTheScreenIsLoadedWithTheTextDoubleClickOnEditIconToEDITTheTableRow(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
