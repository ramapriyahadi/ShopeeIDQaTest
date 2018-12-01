package method;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import objectPage.homePage;
import objectPage.dashboardPage;

public class dashboardPageMethods {


    private basePage basePage;

    public dashboardPageMethods(basePage basePage){
        this.basePage = basePage;
    }

    @Given("^Iam on dashboard page with title \"([^\"]*)\"$")
    public void iam_on_dashboard_page_with_title(String title) throws Throwable {
        homePage.pageTitle(basePage.driver);
    }

    @Then("^I click on header navigation$")
    public void i_click_on_header_navigation() throws Throwable {
        dashboardPage.headerNavLink(basePage.driver).click();
    }

    @And("^I click New gist$")
    public void i_click_new_gist() throws Throwable {
        dashboardPage.newGist(basePage.driver).click();
    }

    @And("^I click on my profile$")
    public void i_click_on_my_profile() throws Throwable {
        dashboardPage.profileLink(basePage.driver).click();
    }

    @And("^I click my gist$")
    public void i_click_my_gist() throws Throwable {
        dashboardPage.yourGist(basePage.driver).click();
    }
}


