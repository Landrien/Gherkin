Feature: Tri des produits

  Background: Connexion de l'utilisateur
    Given Je rentre l'url "https://www.saucedemo.com/"
    When Je saisie un identifiant valide
    And Je saisie un mot de passe valide
    And Je clique sur le bouton de connexion
    Then Je suis connecté à l'application

  Scenario: Tri des produits par prix croissant
    Given L'utilisateur est sur la page de produits
    When Je clique sur le bouton de tri par prix croissant
    Then Le produit avec le prix le plus bas est affiché en premier
    And Le produit avec le prix le plus élevé est affiché en dernier