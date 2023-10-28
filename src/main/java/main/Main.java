package main.java.main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
 
public class Main extends Application {
 
    @Override
    public void start(Stage stage) {
      
        Text text = new Text("Hello World!");
        //Text autreText = new Text("Test");
 
        // taille de texte
        text.setFont(new Font(42));
 
        // l'emplacement de texte
        text.setX(60);
        text.setY(160);
        
        //autreText.setX(60);
        //autreText.setY(160);
 
        Group root = new Group();
        //Group autreRoot = new Group();
 
        root.getChildren().add(text);
        //autreRoot.getChildren().add(autreText);
        
        Scene scene = new Scene(root, 600, 300);
        //Scene autreScene = new Scene(autreRoot, 600, 300);
 
        stage.setTitle("SciNote");
 
        stage.setScene(scene);
        //stage.setScene(autreScene);
 
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}