package com.co.qvision.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStep {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setUp(){

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Luis");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^User wants to enter into their account$")
    public void userWantsToEnterIntoTheirAccount() {


    }

    @When("^User fills the form tipying (\\d+), luiscarlos(\\d+)$")
    public void userFillsTheFormTipyingLuiscarlos(int arg1, int arg2) {

    }

    @Then("^User login sucessfully ingresar elemento de validacion$")
    public void userLoginSucessfullyIngresarElementoDeValidacion() {

    }

}
