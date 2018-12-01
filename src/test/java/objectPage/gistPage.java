package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gistPage {

    private static WebElement element = null;
    String contentid;
    private static By gistName                    = By.xpath("//*[@id=\"gists\"]/div[2]/div/div[1]/div[1]/input[2]");
    private static By lineWrap                    = By.id("line-wrap-mode");
    private static By gistContent                 = By.xpath("//*[@id=\"gists\"]/div[2]/div/div[2]/div/div[5]/div[1]");
    private static By createPublicGistButton      = By.xpath("//*[@id=\"new_gist\"]/div/div[2]/button[1]");
    private static By mygist                      = By.linkText("qa-gist.md");
    private static By editGist                    = By.xpath("//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[1]/a");
    private static By updateGist                  = By.xpath("//*[@id=\"edit_gist_93343623\"]/div/div[2]/button");
    //*[@id="edit_gist_93343928"]/div/div[2]/button
    private static By seeAllYourGist              = By.linkText("See all of your gists");
    private static By deleteGist                  = By.xpath("//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[2]/form/button");
    private static By gistID                      = By.xpath("/html/head/meta[41]");

    public static WebElement gistName(WebDriver driver) {

        element = driver.findElement(gistName);
        return element;
    }

    public static WebElement lineWrap(WebDriver driver) {

        element = driver.findElement(lineWrap);
        return element;
    }

    public static WebElement gistContent(WebDriver driver) {

        element = driver.findElement(gistContent);
        return element;
    }

    public static WebElement createPublicGist(WebDriver driver) {

        element = driver.findElement(createPublicGistButton);
        return element;
    }


    public static WebElement findGist(WebDriver driver,String gistname) {
        element = driver.findElement(By.linkText(gistname));
        return element;
    }

    public static WebElement editGist(WebDriver driver) {

        element = driver.findElement(editGist);
        return element;
    }

    public static WebElement updateGist(WebDriver driver,String contentid) {
        element = driver.findElement(By.xpath("//*[@id=\"edit_gist_"+contentid+"\"]/div/div[2]/button"));
        return element;
    }

    public static WebElement seeAllYourGist(WebDriver driver) {

        element = driver.findElement(seeAllYourGist);
        return element;
    }

    public static WebElement deleteGist(WebDriver driver) {

        element = driver.findElement(deleteGist);
        return element;
    }

    public static WebElement getIDGist(WebDriver driver) {
        element = driver.findElement(gistID);
        return element;
    }
}
