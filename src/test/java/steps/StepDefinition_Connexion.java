package steps;

import BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StepDefinition_Connexion {

   WebDriver driver;  // Injection via composition

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test = 'error']")
    WebElement errorMessage;

    public StepDefinition_Connexion() {
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver, this);
    }

    @Given("Je rentre l'url {string}")
    public void userIsLogged(String url) {
        driver.get(url);
    }

    @When("Je saisie un identifiant valide")
    public void username() {
        username.sendKeys("standard_user");
    }

    @And("Je saisie un mot de passe valide")
    public void password() {
        password.sendKeys("secret_sauce");
    }

    @And("Je clique sur le bouton de connexion")
    public void loginButton() {
        loginButton.click();
    }

    @And("Je saisie un mot de passe  incorrect")
    public void jeSaisieUnMotDePasseIncorrect() {
        password.sendKeys("secret_sauc");
    }

    @Then("Un message d'erreur s'affiche")
    public void unMessageDErreurSAffiche() {
        assert (errorMessage.getText().equals("Epic sadface: Username and password do not match any user in this service"));
    }

    @When("Je saisie un identifiant valide {string}")
    public void jeSaisieUnIdentifiantValide(String arg0) {
        username.sendKeys(arg0);
    }

    @And("Je saisie un mot de passe valide {string}")
    public void jeSaisieUnMotDePasseValide(String arg0) {
        password.sendKeys(arg0);
    }

    @Then("Je suis redirigé vers la page de connexion")
    public void jeSuisRedirigéVersLaPageDeConnexion() {
        assert (loginButton.isDisplayed());
    }
}
