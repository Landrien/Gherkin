Feature : Ajout d'un produit au panier

Scenerio : Ajout d'un produit au panier
Given J'ouvre l'application SauceDemo
And Je suis connecté avec un identifiant et un mot de passe valides
And Je suis sur la page de produits
When Je clique sur le bouton d'ajout du produit
Then Le produit est ajouté au panier

When Je clique sur le bouton du panier
Then Le produit est présent dans le panier