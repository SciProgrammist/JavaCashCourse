/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

// MyFXProject.java
package myfxproject_ed;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author ComputerScientist
 */
public class MyFXProject_ED extends Application { // extiende de la clase Application de JavaFX
    
    @Override
    public void start(Stage primaryStage) { // método para iniciar la aplicacion
          GridPane gridPane = new GridPane(); // panel de JavaFX
       gridPane.setAlignment(Pos.CENTER); // alineacion
       gridPane.setHgap(10); // ancho definido de los espacios entre columnas
       gridPane.setHgap(10); // ancho definido de los espacion entre columnas
       gridPane.setPadding(new Insets(10,10,10,10)); // relleno
       
       Scene scene = new Scene(gridPane, 300, 275); // contenedor de todo el contenido definido con un tamaño estandar.
       Text sceneTitle = new Text("Login"); // Titulo
       sceneTitle.setFont(Font.font("Arial", FontWeight.BLACK,25)); // fuente
       Label username = new Label("Username :"); // etiqueta usuario
       TextField textField = new TextField(); // campo de texto para usuario
       Label password = new Label("Password : "); // etiqueta contraseña
       PasswordField passwordField = new PasswordField(); // campo de texto para contraseña

       gridPane.add(sceneTitle, 0,0,2,1); // columna cero, fila cero
       gridPane.add(username,0,1); // columna cero, fila uno
       gridPane.add(textField,1,1); // columna uno, fila uno
       gridPane.add(password,0,2); // columna cero, fila dos
       gridPane.add(passwordField,1,2); // columna uno, fila dos

       gridPane.setGridLinesVisible(true);  // hacerlo visible, inclusive las líneas de la cuadrícula.
       // puede comentar la línea anterior para hacer visible las líneas del formulario. Lo veŕa al ejecutar el programa.

       Button button = new Button("Log in");
       HBox hBox = new HBox(10);
       hBox.setAlignment(Pos.BOTTOM_RIGHT);
       hBox.getChildren().add(button);
       gridPane.add(hBox,1,4);

       final Text action = new Text();
       gridPane.add(action, 1,6);

       button.setOnAction((event)-> {
           action.setFill(Color.BLUE);
           action.setText("Click!!!");
       });

       primaryStage.setTitle("Formulario");
       primaryStage.setScene(scene);
       primaryStage.show();
        
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
