package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver = new ChromeDriver();
    @Given("Je rentre l'url {string}")
    public void userIsLogged(String url) {
        driver.get(url);

    }
    @When("Je saisie un identifiant valide")
    public void username(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }
    @And ("Je saisie un mot de passe valide")
    public void password(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And ("Je clique sur le bouton de connexion")
    public void loginButton(){
        driver.findElement(By.id("login-button")).click();
    }

    @Then ("Je suis connecté à l'application")
    public void verifHomePage(){
        WebElement logo = driver.findElement(By.xpath("//*[@class='app_logo']"));
        assert(logo.getText().equals("Swag Labs"));
    }

    @And("Je saisie un mot de passe  incorrect")
    public void jeSaisieUnMotDePasseIncorrect() {
        driver.findElement(By.id("password")).sendKeys("secret_sauc");
    }

    @Then("Un message derreur saffiche")
    public void unMessageDErreurSAffiche() {
        WebElement error_message = driver.findElement(By.xpath("//h3[@data-test = 'error']"));
        assert(error_message.getText().equals("Epic sadface: Username and password do not match any user in this service"));
    }

    @When("Je saisie un identifiant valide {string}")
    public void jeSaisieUnIdentifiantValide(String arg0) {
        driver.findElement(By.id("user-name")).sendKeys(arg0);
    }

    @And("Je saisie un mot de passe valide {string}")
    public void jeSaisieUnMotDePasseValide(String arg0) {
        driver.findElement(By.id("password")).sendKeys(arg0);
    }

    @Given("L'utilisateur est sur la page de produits")
    public void lUtilisateurEstSurLaPageDeProduits() {
        WebElement logo = driver.findElement(By.xpath("//*[@class='app_logo']"));
        assert(logo.getText().equals("Swag Labs"));
    }

    @When("Je clique sur le bouton d'ajout du produit")
    public void jeCliqueSurLeBoutonDAjoutDuProduit() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("Le produit est ajouté au panier")
    public void leProduitEstAjoutéAuPanier() {
        WebElement nbrProduit = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        assert(nbrProduit.getText().equals("1"));
    }


    @When("Je clique sur le bouton du panier")
    public void jeCliqueSurLeBoutonDuPanier() {
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    }

    @Then("Le produit est présent dans le panier")
    public void leProduitEstPrésentDansLePanier() {
        WebElement produit = driver.findElement(By.xpath("//div[@class='cart_item']"));
        assert(produit.isDisplayed());
    }

    @When("Je clique sur le bouton de checkout")
    public void jeCliqueSurLeBoutonDeCheckout() {
        driver.findElement(By.id("checkout")).click();
    }

    @Then("Je suis redirigé vers la page de checkout")
    public void jeSuisRedirigéVersLaPageDeCheckout() {
        WebElement checkoutPage = driver.findElement(By.id("first-checkout_info_container"));
        assert(checkoutPage.isDisplayed());
    }

    @When("Je saisie le nom de l'utilisateur {string}")
    public void jeSaisieLeNomDeLUtilisateur(String arg0) {
        driver.findElement(By.id("first-name")).sendKeys(arg0);
    }

    @And("Je saisie le prénom de l'utilisateur {string}")
    public void jeSaisieLePrénomDeLUtilisateur(String arg0) {
        driver.findElement(By.id("last-name")).sendKeys(arg0);
    }

    @And("Je saisie l'adresse de l'utilisateur {string}")
    public void jeSaisieLAdresseDeLUtilisateur(String arg0) {
        driver.findElement(By.id("postal-code")).sendKeys(arg0);
    }

    @And("je clique sur le bouton de paiement")
    public void jeCliqueSurLeBoutonDePaiement() {
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }

    @Then("La commande est validée")
    public void laCommandeEstValidée() {
        WebElement validationMessage = driver.findElement(By.xpath("//h2[@class='complete-header']"));
        assert(validationMessage.getText().equals("THANK YOU FOR YOUR ORDER"));
    }

    @When("Je clique sur le bouton de tri par prix croissant")
    public void jeCliqueSurLeBoutonDeTriParPrixCroissant() {
        driver.findElement(By.xpath("//option[@value='lohi']/..")).click();
        driver.findElement(By.xpath("//option[@value='lohi']")).click();
    }

    @Then("Le produit avec le prix le plus bas est affiché en premier")
    public void leProduitAvecLePrixLePlusBasEstAffichéEnPremier() {
        WebElement firstProduct = driver.findElement(By.xpath("//div[1]/div/div/a/div[@class='inventory_item_name ']"));
        assert(firstProduct.getText().equals("Sauce Labs Onesie"));
    }

    @And("Le produit avec le prix le plus élevé est affiché en dernier")
    public void leProduitAvecLePrixLePlusÉlevéEstAffichéEnDernier() {
        WebElement lastProduct = driver.findElement(By.xpath("//div[6]/div/div/a/div[@class='inventory_item_name ']"));
        assert(lastProduct.getText().equals("Sauce Labs Fleece Jacket"));
    }

    @When("Je clique sur le bouton de la sidebar")
    public void jeCliqueSurLeBoutonDeLaSidebar() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    @And("Je clique sur le bouton de deconnexion")
    public void jeCliqueSurLeBoutonDeDeconnexion() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    @Then("Je suis redirigé vers la page de connexion")
    public void jeSuisRedirigéVersLaPageDeConnexion() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        assert(loginButton.isDisplayed());
    }

    @And("L'utilisateur ajoute deux produits au panier")
    public void lUtilisateurAjouteDeuxProduitsAuPanier() {
        
    }

    @Then("Le panier doit contenir {int} produits")
    public void lePanierDoitContenirProduits(int arg0) {
    }
}
