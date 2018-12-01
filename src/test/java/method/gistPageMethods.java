package method;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import objectPage.dashboardPage;
import objectPage.gistPage;
import org.openqa.selenium.Keys;

public class gistPageMethods {

    String contentid;
    private basePage basePage;

    public gistPageMethods(basePage basePage){
        this.basePage = basePage;
    }

    @And("^I type \"([^\"]*)\" on my gist name$")
    public void i_type_on_my_gist_name(String name) throws Throwable {
        gistPage.gistName(basePage.driver).click();
        gistPage.gistName(basePage.driver).sendKeys(name);
        gistPage.lineWrap(basePage.driver).sendKeys(Keys.TAB);

    }

    @And("^I type \"([^\"]*)\" on my gist content$")
    public void i_type_on_my_gist_content(String content) throws Throwable {
        gistPage.lineWrap(basePage.driver).sendKeys(Keys.TAB,content);
       // gistPage.lineWrap(basePage.driver).sendKeys(content);

    }

    @And("^I click Create public gist$")
    public void i_click_create_public_gist() throws Throwable {
        gistPage.createPublicGist(basePage.driver).click();

    }

    @And("^I click gist with name \"([^\"]*)\"$")
    public void i_click_gist_with_name(String gistname) throws Throwable {
        gistPage.findGist(basePage.driver, gistname).click();

    }

    @And("^I click edit gist$")
    public void i_click_edit_gist() throws Throwable {
        gistPage.editGist(basePage.driver).click();

    }

    @And("^I click update public gist$")
    public void i_click_update_public_gist() throws Throwable {
        contentid = gistPage.getIDGist(basePage.driver).getAttribute("content");
        gistPage.updateGist(basePage.driver, contentid).click();

    }

    @And("^I click see all your gist$")
    public void i_click_see_all_your_gist() throws Throwable {
        gistPage.seeAllYourGist(basePage.driver).click();

    }

    @And("^I click delete gist$")
    public void i_click_delete_gist() throws Throwable {
        gistPage.deleteGist(basePage.driver).click();
        basePage.driver.switchTo().alert().accept();

    }

}
