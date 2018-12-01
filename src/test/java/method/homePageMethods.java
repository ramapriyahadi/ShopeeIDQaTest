package method;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectPage.homePage;

public class homePageMethods {

    private basePage basePage;


    public homePageMethods(basePage basePage){
        this.basePage = basePage;
    }

    @Given("^Iam on Github page with Title \"([^\"]*)\"$")
    public void iam_on_github_page_with_title(String title) throws Throwable {
        homePage.pageTitle(basePage.driver);
    }

    @Then("^I go to login page$")
    public void i_go_to_login_page() throws Throwable {
        homePage.loginButton(basePage.driver).click();
    }
}

