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

public class StepDefinition_PageProduit extends BaseTest {

    WebDriver driver;
    @FindBy(xpath= "//*[@class='app_logo']")
    WebElement logo;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addBackpack;
    @FindBy (xpath = "//span[@class='shopping_cart_badge']")
    WebElement nbrProduit;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement panier;
    @FindBy(xpath = "//option[@value='lohi']/..")
    WebElement Filter;
    @FindBy(xpath = "//option[@value='lohi']")
    WebElement FilterCroissant;
    @FindBy (xpath = "//div[1]/div/div/a/div[@class='inventory_item_name ']")
    WebElement produit1;
    @FindBy (xpath = "//div[6]/div/div/a/div[@class='inventory_item_name ']")
    WebElement produit2;



    public StepDefinition_PageProduit (){
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver, this);
    }

    @Given("L'utilisateur est sur la page de produits")
    public void lUtilisateurEstSurLaPageDeProduits() {
        assert(logo.getText().equals("Swag Labs"));
    }

    @When("Je clique sur le bouton d'ajout du produit")
    public void jeCliqueSurLeBoutonDAjoutDuProduit() {
        addBackpack.click();
    }

    @Then("Le produit est ajouté au panier")
    public void leProduitEstAjoutéAuPanier() {
        assert(nbrProduit.getText().equals("1"));
    }


    @When("Je clique sur le bouton du panier")
    public void jeCliqueSurLeBoutonDuPanier() {
        panier.click();
    }
    @When("Je clique sur le bouton de tri par prix croissant")
    public void jeCliqueSurLeBoutonDeTriParPrixCroissant() {
        Filter.click();
        FilterCroissant.click();
    }

    @Then("Le produit avec le prix le plus bas est affiché en premier")
    public void leProduitAvecLePrixLePlusBasEstAffichéEnPremier() {

        assert(produit1.getText().equals("Sauce Labs Onesie"));
    }

    @And("Le produit avec le prix le plus élevé est affiché en dernier")
    public void leProduitAvecLePrixLePlusÉlevéEstAffichéEnDernier() {
        assert(produit2.getText().equals("Sauce Labs Fleece Jacket"));
    }

}
