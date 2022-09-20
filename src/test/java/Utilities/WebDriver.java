package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WebDriver {
    public static org.openqa.selenium.WebDriver driver;

    public static org.openqa.selenium.WebDriver getDriver() {

        if (driver == null) {
            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);      // Testin son aşaması rahat görülsün diye konulan bir bekleme.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
