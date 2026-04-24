# Jeu de Devinette 

Ce projet Java est une application console simple qui consiste à deviner un nombre aléatoire généré par le programme.
Il a été réalisé dans le cadre d’un exercice pratique de programmation.

## Objectif

Le but du jeu est de deviner un nombre aléatoire compris entre **1 et 100** en un maximum de **10 tentatives**.

## Fonctionnalités

* Génération d’un nombre aléatoire entre 1 et 100
* Saisie utilisateur via la console
* Indication si le nombre proposé est :

    * trop grand
    * trop petit
* Limitation à 10 essais
* Message de victoire ou de défaite

## Règles du jeu

1. Le programme génère un nombre secret entre 1 et 100
2. L’utilisateur entre un nombre
3. Le programme indique si la réponse est :

    * trop grande
    * trop petite
4. Le jeu continue jusqu’à :

    * ce que l’utilisateur trouve le bon nombre ✅
    * ou qu’il atteigne les 10 essais ❌

## Structure du projet

* `Main.java` : point d’entrée du programme contenant toute la logique du jeu

## Version de Java

Ce projet a été développé avec **Java 21**.

## Installation et exécution

### 1. Cloner le dépôt

```bash
git clone https://github.com/YankeyNwolle/jeu-de-devinette.git
```

### 2. Accéder au dossier du projet

```bash
cd jeu-de-devinette
```

### 3. Ouvrir le projet

Ouvrez le projet avec IntelliJ IDEA ou tout autre IDE Java.

### 4. Exécuter le programme

Lancez le fichier `Main.java`.

## Exemple d’exécution

```text
Devinez un nombre entre 1 et 100 :
> 50
Trop petit !
> 75
Trop grand !
> 63
Bravo ! Vous avez trouvé le nombre.
```

## Auteur

Yankey N'wollé Ange Christian
