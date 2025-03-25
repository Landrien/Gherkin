Feature: Deconnexion de l'application

  Background: Connexion de l'utilisateur
    Given Je rentre l'url "https://www.saucedemo.com/"
    When Je saisie un identifiant valide
    And Je saisie un mot de passe valide
    And Je clique sur le bouton de connexion
    Then Je suis connecté à l'application

    Scenario: Deconnexion de l'application
    Given L'utilisateur est sur la page de produits
    When Je clique sur le bouton de la sidebar
    And Je clique sur le bouton de deconnexion
    Then Je suis redirigé vers la page de connexion
