package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class homePage {

    private static WebElement element = null;
    private static WebDriverWait wait = null;

    private static By PageTitle = By.xpath("/html/head/title");
    private static By loginButton = By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]");



    public static WebElement pageTitle(WebDriver driver) {
       // wait = new WebDriverWait(driver, 10);
      //  wait.until(visibilityOfElementLocated(homePageTitle));
        element = driver.findElement(PageTitle);
        return element;
    }

    public static WebElement loginButton(WebDriver driver) {

        element = driver.findElement(loginButton);
        return element;
    }




}
