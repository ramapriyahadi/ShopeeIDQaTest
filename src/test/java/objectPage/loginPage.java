package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    private static WebElement element = null;

    private static By username = By.id("login_field");
    private static By password = By.id("password");
    private static By signinButton = By.xpath("//*[@id=\"login\"]/form/div[3]/input[3]");



    public static WebElement username(WebDriver driver) {

        element = driver.findElement(username);
        return element;
    }


    public static WebElement password(WebDriver driver) {

        element = driver.findElement(password);
        return element;
    }


    public static WebElement signinButton(WebDriver driver) {

        element = driver.findElement(signinButton);
        return element;
    }

}
