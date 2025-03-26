package steps;

import BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepDefinition_Checkout extends BaseTest {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @FindBy(xpath = "//span[@class = 'title']")
    WebElement checkoutPage;
    @FindBy(id = "first-name")
    WebElement firstName;
    @FindBy(id = "last-name")
    WebElement lastName;
    @FindBy(id = "postal-code")
    WebElement postalCode;
    @FindBy(id = "continue")
    WebElement continueButton;
    @FindBy(id = "finish")
    WebElement finishButton;
    @FindBy (xpath = "//button[@class = 'btn btn_primary btn_small']")
    WebElement BackHomeButton;

    public StepDefinition_Checkout() {
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver, this);
    }


    @Then("Je suis redirigé vers la page de checkout")
    public void jeSuisRedirigéVersLaPageDeCheckout() {
        assert(wait.until(ExpectedConditions.elementToBeClickable(checkoutPage)).isDisplayed());
    }

    @When("Je saisie le nom de l'utilisateur {string}")
    public void jeSaisieLeNomDeLUtilisateur(String arg0) {
        firstName.sendKeys(arg0);
    }

    @And("Je saisie le prénom de l'utilisateur {string}")
    public void jeSaisieLePrénomDeLUtilisateur(String arg0) {
        lastName.sendKeys(arg0);
    }

    @And("Je saisie l'adresse de l'utilisateur {string}")
    public void jeSaisieLAdresseDeLUtilisateur(String arg0) {
        postalCode.sendKeys(arg0);
    }

    @And("je clique sur le bouton de paiement")
    public void jeCliqueSurLeBoutonDePaiement() {
        continueButton.click();
        finishButton.click();
    }

    @Then("La commande est validée")
    public void laCommandeEstValidée() {

        assert(wait.until(ExpectedConditions.elementToBeClickable(BackHomeButton)).isDisplayed());
    }

}



