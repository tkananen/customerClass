package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class customerController extends Application {
	
	@FXML
	private TextField firstNameText;
	
	@FXML
	private TextField lastNameText;
	
	@FXML
	private TextField middleInitialText;
	
	@FXML
	private TextField addressText;
	
	@FXML
	private TextField cityText;
	

	
	@FXML
	private TextField zipText;
	
	private customer myCustomer;
	
	@FXML
	private Button male;
	
	@FXML
	private Button female;
	@FXML
	private Stage myStage;
	@FXML
	private Button saveButton;

	Button clearButton = new Button("Clear");
	
	private boolean clearClicked = false;

	
	
	private Main myMain;

	public customerController(){
		
	}
	
	
	public boolean isclearClicked(){
		return clearClicked;
	}
	
	@FXML
	private boolean handleClear(){
		clearClicked = true;
		myStage.close(); 
		
	}
		
	@FXML
	private void handleClearClick(){
		if(handleClear()){

			firstNameText.clear();
			lastNameText.clear();
			middleInitialText.clear();
			addressText.clear();
			cityText.clear();
			zipText.clear();
			}
		}
			
		
	
	
	
	
		
		

		 
		 

		@Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
			
		}
				
		



	
	}

	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FXML
//	private void initialize(){
//		
//	}
//	
//	public void setmyStage (Stage myStage){
//		this.myStage = myStage;
//	}
//	
//	
////	saveButton.setOnAction(new EventHandler<ActionEvent>()){
////		public void handle(final ActionEvent e){
////			
////			
////		}
////		
////		
////	}
//	
//	final ComboBox stateBox = new ComboBox();		
//			
//			
//	
//	public void setmyCustomer(customer myCustomer){
//		this.myCustomer = myCustomer;
//		
//		firstNameText.setText(myCustomer.getfirstName());
//		middleInitialText.setText(myCustomer.getmiddleInitial());
//		lastNameText.setText(myCustomer.getlastName());
//		addressText.setText(myCustomer.getaddress());
//		cityText.setText(myCustomer.getcity());
//		stateText.setText(myCustomer.getstate());
//		zipText.setText(myCustomer.getzip());
//		
//		
//	}
//	
//	public boolean saveClick(){
//		return saveClick;
//	}
//	
//	@FXML
//	
//	private void correctTextFields(){
//	
//		String outputMessage = "You input was incorrect for: ";
//		
//		
//		if (firstNameText.getText() == null || firstNameText.getText().length() == 0 || firstNameText.getText().length() > 50){
//			outputMessage += "First Name\n";
//		}
//		
//		if(middleInitialText.getText() == null || middleInitialText.getText().length() > 1){
//			outputMessage += "Middle Initial\n";
//		}
//		if (lastNameText.getText() == null || lastNameText.getText().length() == 0 || lastNameText.getText().length() > 50){
//			outputMessage += "Last Name\n";
//		}
////		
////		if( female.getOnAction() = null){
////			
////		}
//		if(addressText.getText() == null || addressText.getText().length() == 0 || addressText.getText().length() > 50){
//			outputMessage += "Address\n";
//		}
//		
//		if(cityText.getText() == null||cityText.getText().length()==0||cityText.getText().length() > 25){
//			outputMessage += "City\n";
//		}
//		
//		if(stateBox != null){
//			outputMessage += "State Selection\n";
//		}
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//	public void setMainApp(Main main) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//	public void setMain()
	
}
