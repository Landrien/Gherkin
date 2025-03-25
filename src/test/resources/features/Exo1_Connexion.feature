Feature: Connexion à l'application SauceDemo

    Scenario: valide à l'application
      Given Je rentre l'url "https://www.saucedemo.com/"
      When Je saisie un identifiant valide
      And Je saisie un mot de passe valide
      And Je clique sur le bouton de connexion
      Then Je suis connecté à l'application

    Scenario: Connexion invalide à l'application
      Given Je rentre l'url "https://www.saucedemo.com/"
      When Je saisie un identifiant valide
      And Je saisie un mot de passe  incorrect
      And Je clique sur le bouton de connexion
      Then Un message derreur saffiche