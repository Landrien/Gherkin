Feature: Connexion à l'application

Scenerio Outline : Connexion valide à l'application
Given J'ouvre le navigateur Chrome
AND Je rentre l'url "https://www.saucedemo.com/"
When Je saisie un identifiant valide "<username>"
AND Je saisie un mot de passe valide "<password>"
AND Je clique sur le bouton de connexion
Then Je suis connecté à l'application

Examples:
| username | password |
| standard_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce |
| locked_out_user | secret_sauce |