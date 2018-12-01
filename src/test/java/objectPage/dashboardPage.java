package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardPage {

    private static WebElement element = null;


    private static By headerNavLink = By.xpath("//*[@id=\"user-links\"]/li[2]/details/summary");
    private static By newGist       = By.xpath("//*[@id=\"user-links\"]/li[2]/details/details-menu/a[3]");
    private static By profileLink   = By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/img");
    private static By yourGist      = By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[6]/a");

    public static WebElement headerNavLink(WebDriver driver) {

        element = driver.findElement(headerNavLink);
        return element;
    }


    public static WebElement newGist(WebDriver driver) {

        element = driver.findElement(newGist);
        return element;
    }

    public static WebElement profileLink(WebDriver driver) {

        element = driver.findElement(profileLink);
        return element;
    }

    public static WebElement yourGist(WebDriver driver) {

        element = driver.findElement(yourGist);
        return element;
    }

}
