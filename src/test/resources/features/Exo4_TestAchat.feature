Feature: L'achat d'un produit

  Background: Connexion de l'utilisateur
    Given Je rentre l'url "https://www.saucedemo.com/"
    When Je saisie un identifiant valide
    And Je saisie un mot de passe valide
    And Je clique sur le bouton de connexion
    Then L'utilisateur est sur la page de produits

  Scenario Outline: Achat d'un produit
    Given L'utilisateur est sur la page de produits
    When Je clique sur le bouton d'ajout du produit
    Then Le produit est ajouté au panier

    When Je clique sur le bouton du panier
    Then Le produit est présent dans le panier
    When Je clique sur le bouton de checkout
    Then Je suis redirigé vers la page de checkout

    When Je saisie le nom de l'utilisateur "<username>"
    And Je saisie le prénom de l'utilisateur "<prenom>"
    And Je saisie l'adresse de l'utilisateur "<adresse>"
    And je clique sur le bouton de paiement
    Then La commande est validée

    Examples:
      | username | prenom  | adresse                 |
      | John     | Donald  | 123 rue de la paix      |
      | Jane     | Doil    | 456 rue de la joie      |
      | Jack     | Douglas | 789 rue de la tristesse |