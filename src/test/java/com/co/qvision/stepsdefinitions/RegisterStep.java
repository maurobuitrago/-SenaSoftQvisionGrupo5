package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.RegisterQuestion;
import com.co.qvision.tasks.RegisterTask;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStep {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setUp() {

        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^User wants to register a BonBonite Account$")
    public void userWantsToRegisterABonBoniteAccount() {
        theActorCalled("user").attemptsTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));

    }


    @When("^User fills the form tipying (.+),(.+),(.+)$")
    public void userFillsTheFormTipyingMailMailCom(String idNumber, String email, String password) {
        theActorCalled("user").attemptsTo(RegisterTask.registroUsuario(idNumber,email, password));

    }

    @Then("^Account created sucessfully (.+)$")
    public void accountCreatedSucessfullyIngresarElementoDeValidacion(String validTest) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegisterQuestion.registervalidtest(validTest)));

    }

}