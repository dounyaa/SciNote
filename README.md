# SciNote

![GitHub](https://img.shields.io/github/license/dounyaa/SciNote)
![GitHub tag (with filter)](https://img.shields.io/github/v/tag/dounyaa/SciNote)
![GitHub release (with filter)](https://img.shields.io/github/v/release/dounyaa/SciNotes)

## Auteurs

- Aya Lakehal
- Rayan Awasil
- Dounya Alaoui

## Comment exécuter le projet en local?

Afin de pouvoir lancer le projet en local, il est nécessaire d'installer différentes librairies, et notamment e(fx)clipse.

Note: cette procédure d'installation se concentre d'abord Eclipse IDE

### Pré-requis 

Avant d'installer la librairie, il est nécessaire d'avoir:
- une JDK (le projet a été développé avec java 17)
- une version de Gradle (Gradle 8.2 de préférence)
- l'IDE Eclipse 

### Installation du projet en local

En premier lieu, il faut installer les librairies nécessaires:

- Sur le bandeau de navigation, cliquer sur "Help > Install new software > Add"
- Ajouter dans le champ "Name": e(fx)clipse
- Dans le champ "Location", renseigner: http://download.eclipse.org/efxclipse/updates-released/3.0.0/site
- Cocher les deux packages
- Redémarrer Ecplise IDE une fois les packages installés

Ensuite, il nous faut télécharger la librairie "JavaFX":

- Linux: https://discord.com/channels/@me/1160955090740457512/1167756514073776188
- Windows: https://discord.com/channels/@me/1160955090740457512/1167756514073776188
- MacOS: https://discord.com/channels/@me/1160955090740457512/1167756514073776188

Dans Eclipse, il faut ensuite configurer la librarie:

- Sur le bandeau de navigation, cliquer sur "Window > Préférences > Java > Build Path > User Libraries > New"
- Nommer la librairie "java-fx"
- Puis cliquer sur "Add external JARs...", et sélectionner les huits JARs au sein du folder javafx-sdk-17.0.2/lib
- Enfin, ajouter la librarie JavaFX dans le build path du projet: "Configure Build Path > Libraries > Classpath > Add Library > User Library > JavaFX"

Avant d'exécuter le script:
- Sur le bandeau de navigation: "Run > Run Configurations > Java Application > Arguments > VM Arugments: --module-path "chemin vers folder \lib javafx" --add-modules javafx.controls,javafx.fxml

### Fin du setup d'installation!

A ce stade, il est normalement possible d'exectuer le projet. 