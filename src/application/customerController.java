package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class customerController extends Main{
	
	 @FXML
	 private TextField firstName;
	 
	 @FXML 
	 private TextField middleInitial;
	 
	 @FXML
	 private TextField lastName;
	 
	 @FXML
	 private RadioButton male;
	 
	 
	 @FXML
	 private RadioButton female;
	 
	 @FXML
	 private TextField address;
	 
	 @FXML
	 private TextField city;
	 
	 @FXML
	 private ComboBox<String> states;
	 
	 @FXML
	 private TextField zip;
	 
	 @FXML
	 private Button saveButton;
	 
	 @FXML
	 private Button clearButton;
	 
	 @FXML
	 private Alert checkAlert = new Alert(AlertType.ERROR);	
	 
	 @FXML
	 private ToggleGroup genderButton = new ToggleGroup();
	 
	 @FXML
	 private Alert confirmationAlert = new Alert(AlertType.CONFIRMATION);
	 
	
	 
	 
	 
	 private Main main;
	 
	 customer myCustomer = new customer();
	 

	 
	 
	 
	 
	 @FXML
	 private void handleClearButton(){
		firstName.clear();
		middleInitial.clear();
		lastName.clear();
		male.setSelected(false);
		female.setSelected(false);
		address.clear();
		city.clear();
		states.setValue(null);
		zip.clear();
		 
		 
	 }
	 
	 @FXML
	 private void handlesaveButton(){
		 if (checkInput()){
			 myCustomer.setFirstName(firstName.getText().toString());
			 myCustomer.setMiddleInitial(middleInitial.getText().toString());
			 myCustomer.setLastName(lastName.getText().toString());
			 myCustomer.setAddress(address.getText().toString());
			 myCustomer.setCity(city.getText().toString());
			 myCustomer.setState(states.getValue().toString());
			 myCustomer.setZip(zip.getText().toString());
		
			 	if(female.isPressed()){
			 			myCustomer.setGender("Female");
			 			}
			 	if(male.isPressed()){
			 			myCustomer.setGender("Male");
			 			}
			 	confirmationAlert.setContentText("Congraluations, everything was correct!");
		 }
		 
		 
		 
	 }
			 
		
		 
		
		 
		 	
		
	 
	 @FXML
	 private boolean checkInput(){		 
		 
		 if ( firstName.getText().length() == 0 || firstName.getText().length() > 50){
				checkAlert.setContentText("Your first name was incorrect.");
				checkAlert.showAndWait();
			}
			
			if(middleInitial.getText().length() == 0 || middleInitial.getText().length() > 1){
				checkAlert.setContentText("Your middle initial was incorrect.");
				checkAlert.showAndWait();
				
			
			}
			if (lastName.getText().length() == 0 || lastName.getText().length() > 50){
				checkAlert.setContentText("Your last name was incorrect.");
				checkAlert.showAndWait();
			}
		
			if( female.isPressed() && male.isPressed()){
				checkAlert.setContentText("Please only select one gender");
				checkAlert.showAndWait();
					
			}		
					
			
			if(zip.getText().length() == 0 || zip.getLength() != 5 || zip.getLength() != 9){
				checkAlert.setContentText("Your zip code was incorrect");
				checkAlert.showAndWait();
			}
			
			if(address.getText().length() == 0 || address.getText().length() > 50){
				checkAlert.setContentText("Your address was incorrect.");
				checkAlert.showAndWait();
			}
			
			if(city.getText().length()==0||city.getText().length() > 25){
				checkAlert.setContentText("Your city was incorrect.");
				checkAlert.showAndWait();
				
			}
			
			if(states.getValue().toString().equals(null)){
				checkAlert.setContentText("Please select a state.");
				checkAlert.showAndWait();
				
			}
			return true;
			
	 }
	 
	
	 
	 
	 @FXML
	 private void initialize(){
		 
		 male.setToggleGroup(genderButton);
		 female.setToggleGroup(genderButton);
		 
		
		 
		 states.getItems().addAll(
				  ("Alabama"),
				    ("Montana"),
				    ("Alaska"),
				    ("Nebraska"),
				    ("Arizona"),
				    ("Nevada"),
				    ("Arkansas"),
				    ("New Hampshire"),
				    ("California"),
				    ("New Jersey"),
				    ("Colorado"),
				    ("New Mexico"),
				    ("Connecticut"),
				    ("New York"),
				    ("Delaware"),
				    ("North Carolina"),
				    ("Florida"),
				    ("North Dakota"),
				    ("Georgia"),
				    ("Ohio"),
				    ("Hawaii"),
				    ("Oklahoma"),
				    ("Idaho"),
				    ("Oregon"),
				    ("Illinois"),
				    ("Pennsylvania"),
				    ("Indiana"),
				    ("Rhode Island"),
				    ("Iowa"),
				    ("South Carolina"),
				    ("Kansas"),
				    ("South Dakota"),
				    ("Kentucky"),
				    ("Tennessee"),
				    ("Louisiana"),
				    ("Texas"),
				    ("Maine"),
				    ("Utah"),
				    ("Maryland"),
				    ("Vermont"),
				    ("Massachusetts"),
				    ("Virginia"),
				    ("Michigan"),
				    ("Washington"),
				    ("Minnesota"),
				    ("West Virginia"),
				    ("Mississippi"),
				    ("Wisconsin"),
				    ("Missouri"),
				    ("Wyoming"));
		 
		 
	 }
	 
	 
	 public void setMain(Main main){
		 this.main = main;
				 
	 }
		



	


	
	}


