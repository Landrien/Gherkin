package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public static WebDriver driver;

    public static void initializeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");//permet de lancer le navigateur sans vision
        options.addArguments("--incognito");// ouvre le navigateur en mode privé
        driver = new ChromeDriver(options);
        //driver.manage().window().maximize();
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
