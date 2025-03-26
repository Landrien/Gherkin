package steps;

import BaseTest.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StepDefinition_PagePanier extends BaseTest {

    WebDriver driver;
    @FindBy(xpath = "//div[@class='cart_item']")
    WebElement produit;
    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public StepDefinition_PagePanier() {
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver, this);
    }


    @Then("Le produit est présent dans le panier")
    public void leProduitEstPrésentDansLePanier() {
        assert (produit.isDisplayed());
    }

    @When("Je clique sur le bouton de checkout")
    public void jeCliqueSurLeBoutonDeCheckout() {
        checkoutButton.click();
    }
}
