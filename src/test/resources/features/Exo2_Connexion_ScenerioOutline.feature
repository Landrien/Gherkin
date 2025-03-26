Feature: Connexion à l'application

  Scenario Outline: Connexion valide à l'application
    Given Je rentre l'url "https://www.saucedemo.com/"
    When Je saisie un identifiant valide "<username>"
    And Je saisie un mot de passe valide "<password>"
    And Je clique sur le bouton de connexion
    Then L'utilisateur est sur la page de produits

    Examples:
      | username | password |
      | standard_user | secret_sauce |
      | problem_user | secret_sauce |
      | performance_glitch_user | secret_sauce |
