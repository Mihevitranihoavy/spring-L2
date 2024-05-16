Mon Framework Java est conçu pour faciliter le développement d'applications web en Java. Il offre une structure claire et une organisation efficace des contrôleurs, facilitant ainsi la gestion des routes et des actions.

## Prérequis

- Java Development Kit (JDK) 8 ou supérieur
- Maven 3.x

## Installation

Pour utiliser Mon Framework Java, suivez les étapes ci-dessous :

1. Clonez le dépôt Git : git clone https://github.com/sprint-code.git cd votrepo/sprint1-ETU
2. Démarrez votre serveur d'application. Par exemple, si vous utilisez Tomcat, démarrez-le via votre IDE ou via la ligne de commande.

## Configuration

### Structure du Projet

Le projet est organisé autour de packages spécifiques. Les contrôleurs sont placés dans le package org.example.frontController.FrontController.

### Annotations

Utilisez l'annotation @AnnotationController pour marquer vos contrôleurs. Cette annotation permet au système de reconnaître automatiquement vos contrôleurs lors de l'exécution.

### FrontController

Le FrontController agit comme point d'entrée unique pour toutes les requêtes HTTP. Il détecte l'URL demandée et appelle le contrôleur approprié.

## Exemples de Code

### Contrôleur Annoté

java package org.example.frontController;

import your.package.name.AnnotationController;

@AnnotationController
public class ExampleController {

@GetMapping("/example")
public String example() {
return "Example Page";
}
github.com
Écrire à Fuji Vanilli
