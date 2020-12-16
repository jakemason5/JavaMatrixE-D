/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamatrixe.d;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.util.Random;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
/* Java Matrix Event Driven
 *By: Jacob Mason 
 * Version 1.1.1
 */
public class JavaMatrixED extends Application{
   private  TextField tf = new TextField();
   private GridPane root = new GridPane();
    
      @Override
    public void start(Stage primaryStage)
    {
        //Setting up the Pane information
        int SIZE = 11;
        int length = SIZE;
        int width = SIZE;
        
        //Setting up the Buttons
        Button btZero = new Button("Zero");
        Button btOne = new Button("One");
        Button btRand = new Button("Random");
        Button btExit = new Button("Quit");
       
        
        
        //Changing the color of the text and the background
        btExit.setStyle("-fx-background-color: black;"
        + "-fx-text-fill: green;");
        btRand.setStyle("-fx-background-color: black;"
        + "-fx-text-fill: green;");
        btOne.setStyle("-fx-background-color: black;"
        + "-fx-text-fill: green;");
        btZero.setStyle("-fx-background-color: black;"
        + "-fx-text-fill: green;");
        root.setStyle("-fx-background-color: black;");
       


//Setting up the actions for buttons being pressed
        btRand.setOnAction(e-> RandHandler());
        ExitHandler handler1 = new ExitHandler();
        btOne.setOnAction(e -> OneHandler());
        btExit.setOnAction(handler1);
        btZero.setOnAction(e -> ZeroHandler());
        //For pressing escape
        root.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.ESCAPE)
            {
                System.exit(0);
            }
        });
        
        //Placing the buttons inside of the Stage
        root.add(btZero, 1, 0);
        root.add(btOne, 3, 0);
        root.add(btRand, 5, 0);
        root.add(btExit, 5, 12);
        
        
        //Setting up the numbers inside of the Text Field
        for(int y = 1; y < length; y++)
        {
            for(int x = 1; x < width; x++)
            {
                Random rand = new Random();
                int rand1 = rand.nextInt(2);
                
                
                tf = new TextField();
                tf.setStyle("-fx-text-fill: green;"
                + "-fx-background-color: black;");
                tf.setPrefHeight(50);
                tf.setPrefWidth(50);
                tf.setAlignment(Pos.CENTER);
                tf.setEditable(false);
                tf.setText("" + rand1 + "");
                root.add(tf, x, y);
            }
        }
        
        
        //Creating the stage and showing it
         Scene scene = new Scene(root, 500, 500);
         primaryStage.setTitle("Random Binary Matrix");
         primaryStage.setScene(scene);
         primaryStage.show();
         
         
}
    //Changing the field to zeros
    private void ZeroHandler()
   {
             for(int y = 1; y < 11; y++)
        {
            for(int x = 1; x < 11; x++)
            {
                tf = new TextField();
                tf.setStyle("-fx-text-fill: green;"
                + "-fx-background-color: black;");
                tf.setPrefHeight(50);
                tf.setPrefWidth(50);
                tf.setAlignment(Pos.CENTER);
                tf.setEditable(false);
                tf.setText("" + 0 + "");
                root.add(tf, x, y);
            }
         }
    
    }
    //Changing the field to ones
    private void OneHandler()
    {
        for(int y = 1; y < 11; y++)
        {
            for(int x = 1; x < 11; x++)
            {
                tf = new TextField();
                tf.setStyle("-fx-text-fill: green;"
                + "-fx-background-color: black;");
                tf.setPrefHeight(50);
                tf.setPrefWidth(50);
                tf.setAlignment(Pos.CENTER);
                tf.setEditable(false);
                tf.setText("" + 1 + "");
                root.add(tf, x, y);
            }
         }
    }
    //Randomizing the field
    private void RandHandler()
    {
        for(int y = 1; y < 11; y++)
        {
            for(int x = 1; x < 11; x++)
            {
                Random rand = new Random();
                int rand1 = rand.nextInt(2);
                
                tf = new TextField();
                tf.setStyle("-fx-text-fill: green;"
                + "-fx-background-color: black;");
                tf.setPrefHeight(50);
                tf.setPrefWidth(50);
                tf.setAlignment(Pos.CENTER);
                tf.setEditable(false);
                tf.setText("" + rand1 + "");
                root.add(tf, x, y);
            }
         }
    }
    //Exiting
    class ExitHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent e)
        {
            System.exit(0);
        }
    }
   

public static void main(String[] args) 
{
        Application.launch(args);
}
}
    

