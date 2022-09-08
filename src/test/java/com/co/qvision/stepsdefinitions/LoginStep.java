package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.LoginQuestion;
import com.co.qvision.tasks.LoginTask;
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

public class LoginStep {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^User wants to enter into their account$")
    public void userWantsToEnterIntoTheirAccount() {
        theActorCalled("user").attemptsTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));
    }

    @When("^User fills the form tipying (.+),(.+)$")
    public void userFillsTheFormTipying(String idNumber, String password) {
        theActorCalled("user").attemptsTo(LoginTask.login(idNumber, password));
    }

    @Then("^User login sucessfully (.+)$")
    public void userLoginSucessfullyIngresarElementoDeValidacion(String validTest) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginQuestion.loginvalidtest(validTest)));
    }
}
