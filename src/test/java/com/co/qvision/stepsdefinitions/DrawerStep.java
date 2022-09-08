package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.DrawerQuestion;
import com.co.qvision.questions.RegisterQuestion;
import com.co.qvision.tasks.DrawerTask;
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

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DrawerStep {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setUp() {

        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^User wants to see the drawer menu$")
    public void userWantsToSeeTheDrawerMenu() {
        theActorCalled("user").attemptsTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("^User clicks on Icon in order to see the Drawer Menu$")
    public void userClicksOnIconInOrderToSeeTheDraweMenu() {
        theActorCalled("user").attemptsTo(DrawerTask.drawerView());
    }

    @Then("^Drawer Menu Showed Succesfully (.+)$")
    public void drawerMenuShowedSuccesfullyCerrarSesión(String validText) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(DrawerQuestion.drawervalidtext(validText)));
    }

}