# HelpU

[![Coverage Status](https://coveralls.io/repos/github/davidmeimoun/HelpU/badge.svg?branch=dev)](https://coveralls.io/github/davidmeimoun/HelpU?branch=dev)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Build Status](https://travis-ci.com/davidmeimoun/HelpU.svg?token=XLtVmB2EA7Y5yi1Ke6zy&branch=master)](https://travis-ci.com/davidmeimoun/HelpU)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/04ee8982e2d84168b884aa05fb800abf)](https://www.codacy.com/app/davidmeimoun/HelpU?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=davidmeimoun/HelpU&amp;utm_campaign=Badge_Grade)
[![GitHub version](https://badge.fury.io/gh/davidmeimoun%2Fhelpu.svg)](https://badge.fury.io/gh/davidmeimoun%2Fhelpu)

HelpU est une application d'**entraide entre étudiants**.

Elle permet aux étudiants d'aider ou bien de se faire aider en leur donnant la possibilité de :
* recevoir des **cours individuels**, 
* récupérer des **fiches de cours**, 
 le tout venant d'étudiants plus compétents dans la/les  matière(s) en question.


## Cas d'utilisation
![](https://github.com/davidmeimoun/HelpU/blob/master/UseCase/HelpU%20UseCase.png)


## Systeme de Build
* [Gradle](https://gradle.org/)

## Version 1.0.0-beta
* Supprimer toutes les informations dans la base de donnée lorsqu'un utilisateur supprime son compte
* Notification si un utilsateur souhaite aider plusieurs fois dans le même cours
* Suppression du boutton Logout dans Profile Activity
* Amélioration de la messagerie 

## Version 1.0.0-alpha.1
* Application Fonctionnel 
* Ajout d'une partie profil
* Ajout de la partie Recherche d'un Helper
* Insertion de la base de donnée des matières de Nanterre Université

## Version 0.2.0 
* ajout de la première version de la messagerie 
* ajout de test unitaire graphique 

## Téléchargement 

L'application peut être téléchargée sur le site : https://jmedjid.github.io/helpu.github.io/

ou directement [**ici**] (https://github.com/Jmedjid/helpu.github.io/blob/gh-pages/downloads/HelpU-v1.0.0-alpha.apk)

HelpU utilise android sdk version 25.0.2. Gradle télécharge automatiquement le sdk si vous avez déjà accepté les licences avec le SDK manager et que soit : 

  - votre variable d'environnement ANDROID_HOME est présente 
  - un fichier local.properties est présent avec le chemin vers votre sdk local.

Sinon vous pouvez télécharger le sdk grâce au sdk manager disponible https://developer.android.com/studio/index.html et configurer une variable ANDROID_HOME


## Contributors

* Mamadou Baba Makadji
* David Meimoun
* Joan Medjid

