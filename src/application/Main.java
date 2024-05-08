package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane panel1 = new Pane();
	        panel1.setStyle("-fx-background-color: #FFFFFF");
	        panel1.setPrefSize(300, 250);
	        
	        Pane panel2 = new Pane();
	        panel2.setStyle("-fx-border-color: black ; -fx-border-width: 2px;-fx-background-color: #F5F5F5");
	        panel2.setLayoutX(10);
	        panel2.setLayoutY(10);
	        panel2.setPrefSize(220, 330);
	        
	        ScrollBar scrollbar = new ScrollBar(); 
	        scrollbar.setOrientation(javafx.geometry.Orientation.VERTICAL);// Ponerlo de forma vertical
	        scrollbar.setStyle("-fx-background-color:  #E6E6FA"); // color
	        scrollbar.setPrefSize(10, 330);
            panel2.getChildren().add(scrollbar); // Agregar el scrollbar al panel2
	        
	        Label label1 = new Label("Nombre y Apellidos "); // Texto
	        label1.setStyle("-fx-border-color: black ; -fx-border-width: 1px; -fx-background-color: white");
	        label1.setPrefSize(180, 30);
	        label1.setLayoutX(20);
	        label1.setLayoutY(20);

	        Label label2 = new Label("Nombres y Apellidos");
	        label2.setStyle("-fx-border-color: black ; -fx-border-width: 1px; -fx-background-color: white");
	        label2.setPrefSize(180, 30);
	        label2.setLayoutX(20);
	        label2.setLayoutY(80);
	        
	        Label label3 = new Label("Nombre y Apellidos");
	        label3.setStyle("-fx-border-color: black ; -fx-border-width: 1px; -fx-background-color: white");
	        label3.setPrefSize(180, 30);
	        label3.setLayoutX(20);
	        label3.setLayoutY(140);
	        
	        Label label4 = new Label("Nombre y Apellidos");
	        label4.setPrefSize(180, 30);
	        label4.setStyle("-fx-border-color: black ; -fx-border-width: 1px ; -fx-background-color: white");
	        label4.setLayoutX(20);
	        label4.setLayoutY(200);
	        
	        Label label5 = new Label("Nombre y Apellidos");
	        label5.setStyle("-fx-border-color: black ; -fx-border-width: 1px; -fx-background-color: white");
	        label5.setPrefSize(180, 30);
	        label5.setLayoutX(20);
	        label5.setLayoutY(260);
	        
	        Image image = new Image (getClass().getResourceAsStream("/image/imagen1.jpg")); // Agregar imagen
	        ImageView imageview = new ImageView (image);
	        imageview.setStyle("-fx-border-color: black ; -fx-border-width: 1px"); 
	        imageview.setFitWidth(40);
	        imageview.setFitHeight(40); 
	        
	        ImageView imageview1 = new ImageView (image);
	        imageview1.setStyle("-fx-border-color: black ; -fx-border-width: 1px");
	        imageview1.setFitWidth(40); 
	        imageview1.setFitHeight(40); 
	        
	        ImageView imageview2 = new ImageView (image);
	        imageview2.setStyle("-fx-border-color: black ; -fx-border-width: 1px");
	        imageview2.setFitWidth(40); 
	        imageview2.setFitHeight(40); 
	        
	        ImageView imageview3 = new ImageView (image);
	        imageview3.setStyle("-fx-border-color: black ; -fx-border-width: 1px");
	        imageview3.setFitWidth(40);
	        imageview3.setFitHeight(40); 
	        
	        ImageView imageview4 = new ImageView (image);
	        imageview4.setStyle("-fx-border-color: black ; -fx-border-width: 1px");
	        imageview4.setFitWidth(40); 
	        imageview4.setFitHeight(40); 
	        
	        label1.setGraphic(imageview);
	        label2.setGraphic(imageview1);
	        label3.setGraphic(imageview2);
	        label4.setGraphic(imageview3);
	        label5.setGraphic(imageview4);


	        
	        panel2.getChildren().addAll(label1, label2,label3,label4,label5);
	        
	        Pane panel4 = new Pane ();
	        panel4.setPrefSize(220, 80);
	        panel4.setStyle("-fx-border-color: black ; -fx-border-width: 2px ;-fx-background-color: #F5F5F5");
	        panel4.setLayoutX(250);
	        panel4.setLayoutY(250);
	        
	        TextField textField = new TextField();
	        textField.setStyle("-fx-border-color: black ; -fx-border-width: 1px");
	        textField.setPromptText(" ");
	        textField.setPrefWidth(180);
	        textField.setLayoutX(25);
	        textField.setLayoutY(25);

	        panel4.getChildren().add(textField);
	        
            ObservableList<String> items = FXCollections.observableArrayList();// Agregar ListView
            items.addAll("Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10" );

            ListView<String> listView = new ListView<>(items); // crear
            listView.setLayoutX(250);
            listView.setLayoutY(10);
            listView.setPrefWidth(220);
            listView.setPrefHeight(220);
            listView.setStyle("-fx-border-color: black ; -fx-border-width: 2px"); //Borde de la list

            panel1.getChildren().add(listView);

	        panel1.getChildren().addAll(panel2, panel4); //Agregar panel2 y panel 4 al panel principal(panel1)
	       
			Scene scene = new Scene(panel1,490,350); //presenta la pantalla "Es fundamental"
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
