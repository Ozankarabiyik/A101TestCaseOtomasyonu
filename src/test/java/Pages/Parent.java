package Pages;

import Utilities.WebDriver;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        element.click();
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebDriver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

}
