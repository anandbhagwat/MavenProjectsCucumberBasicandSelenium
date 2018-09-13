package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    @Given("^I Navigate to the url$")
    public void iNavigateToTheUrl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see userform page");

    }

    @And("^I enter username and password as admin$")
    public void iEnterUsernameAndPasswordAsAdmin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I enter username and password");

    }

    @And("^I click on login$")
    public void iClickOnLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click Login");

    }



    @Then("^Login Successful$")
    public void loginSuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login Password");

    }

    @Given("^I Navigate To Google Homepage$")
    public void iNavigateToGoogleHomepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter Something in Search$")
    public void iEnterSomethingInSearch() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I hit Search Button$")
    public void iHitSearchButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should display results$")
    public void iShouldDisplayResults() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterUsernameAndPassword(String usernme, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("\n"+" Username is "+ usernme);
        System.out.println("Password is " +password);

    }
}
