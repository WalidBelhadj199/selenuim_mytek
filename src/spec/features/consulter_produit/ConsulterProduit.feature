@consulter
Feature: Consulter PC Mac
  Je souhaite consulter la gamme des PC Mac et ajouter au pannier
  
  @consulterajoutersupprimer
  Scenario: Je souhaite consulter la gamme des PC Mac et ajouter au pannier 
    Given Je me connecte sur Mytek
    When Je mets la souris sur le champs Tous nos rayons
    When je clique sur informatique
    When je clique sur Mac
    Then Je me redirige vers page resultat de recherche et "Mac" s affiche
    When je clique sur APPLE MacBook Air M1 8Go 256Go SSD - Gris
    When je clique sur Ajouter au pannier
    When Je consulte le pannier
    When je clique sur Afficher et  modifer le panier
    When je Modifié la qté par "2"
    When je clique sur mettre a jour le pannier
    When Je consulte le pannier
    When Je clique sur supprimer
    When Je clique sur ok
    Then un message "Vous n'avez aucun article dans votre panier" s affiche 
     
    