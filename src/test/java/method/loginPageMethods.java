package method;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import objectPage.loginPage;

public class loginPageMethods {

    private basePage basePage;


    public loginPageMethods(basePage basePage){
        this.basePage = basePage;
    }


    @And("^I type my username \"([^\"]*)\"$")
    public void i_type_my_username(String username) throws Throwable {
        loginPage.username(basePage.driver).sendKeys(username);

    }

    @And("^I type my password \"([^\"]*)\"$")
    public void i_type_my_password(String password) throws Throwable {
        loginPage.password(basePage.driver).sendKeys(password);

    }

    @And("^I click sign in button$")
    public void i_click_sign_in_button() throws Throwable {
        loginPage.signinButton(basePage.driver).click();

    }
}
