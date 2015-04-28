package application;
	
import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	
	
	private Stage customerStage;
	private AnchorPane customerAnchor;
	@Override
	public void start(Stage primaryStage){
		this.customerStage = primaryStage;
		this.customerStage.setTitle("Customer");
		showcustomerAnchor();
	}
	
	private void showcustomerAnchor(){
		try{
			FXMLLoader custLoader = new FXMLLoader();
			custLoader.setLocation(Main.class.getResource("customerxml.fxml"));
			customerAnchor = (AnchorPane) custLoader.load();
			
			Scene scene = new Scene(customerAnchor);
			customerStage.setScene(scene);
			customerController custControl = custLoader.getController();
			custControl.setMain(this);
			customerStage.show();
		}
		 catch(IOException e){
				e.printStackTrace();
			}
	}
		
	
	public static void main(String[] args) {
		launch(args);
	}
}