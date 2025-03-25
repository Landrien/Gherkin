Feature : L'achat d'un produit

Scenerio Outline: Achat d'un produit
Given  J'ouvre l'application SauceDemo
And Je suis connecté avec un identifiant et un mot de passe valides
And Je suis sur la page de produits
When Je clique sur le bouton d'ajout du produit
Then Le produit est ajouté au panier

When Je clique sur le bouton du panier
Then Le produit est présent dans le panier

When Je clique sur le bouton de paiement
Then Je suis redirigé vers la page de paiement

When Je saisie le nom de l'utilisateur "<username>"
And Je saisie le prénom de l'utilisateur "<prenom>"
And Je saisie l'adresse de l'utilisateur "<adresse>"
And Je saisie le numéro de téléphone de l'utilisateur "<telephone>"
And je saisie les informations de la carte bancaire "<carte>"
And je clique sur le bouton de paiement
Then La commande est validée

Examples:
| username | prenom | adresse | telephone | carte |
| John | Donald | 123 rue de la paix | 0123456789 | 1234567890123456 |
| Jane | Doil | 456 rue de la joie | 9876543210 | 6543210987654321 |
| Jack | Douglas | 789 rue de la tristesse | 1234567890 | 1234567890123456 |