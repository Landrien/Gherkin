Feature: Ajout d'un produit au panier

  Background: Connexion de l'utilisateur
    Given Je rentre l'url "https://www.saucedemo.com/"
    When Je saisie un identifiant valide
    And Je saisie un mot de passe valide
    And Je clique sur le bouton de connexion
    Then L'utilisateur est sur la page de produits

  Scenario: Ajout d'un produit au panier
    Given L'utilisateur est sur la page de produits
    When Je clique sur le bouton d'ajout du produit
    Then Le produit est ajouté au panier

    When Je clique sur le bouton du panier
    Then Le produit est présent dans le panier


  #Scenario: Ajout d'un produit au panier
   # And L'utilisateur ajoute deux produits au panier
    #  | produit  | Prix |
     # | produit1 | 10€  |
      #| produit2 | 20€  |
    #Then Le panier doit contenir 2 produits
