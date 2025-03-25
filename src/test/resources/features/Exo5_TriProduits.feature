Feature: Tri des produits

Scenerio : Tri des produits par prix croissant
Given J'ouvre l'application SauceDemo
When Je clique sur le bouton de tri par prix croissant
Then Les produits sont triés par prix croissant
And Le produit avec le prix le plus bas est affiché en premier
And Le produit avec le prix le plus élevé est affiché en dernier