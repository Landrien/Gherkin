package steps;

import BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepDefinition_SideBar extends BaseTest {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @FindBy(id = "react-burger-menu-btn")
    WebElement sideBarButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;

    public StepDefinition_SideBar() {
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver, this);
    }
    @When("Je clique sur le bouton de la sidebar")
    public void jeCliqueSurLeBoutonDeLaSidebar() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(sideBarButton));
        element.click();
    }

    @And("Je clique sur le bouton de deconnexion")
    public void jeCliqueSurLeBoutonDeDeconnexion() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();

    }
}
