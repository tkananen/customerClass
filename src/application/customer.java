package application;

public class customer {
	
	private String firstName;
	private  String middleInitial;
	private  String lastName;
	private  String address;
	private  String city;
	private  String state;
	private  String  zip;
	private String gender;
	
	
	
	
	
	public customer(){
		
	}
	

	public customer(String firstName, String middleInitial, String lastName, String address, String city, String state, String zip, String gender){
		this.firstName = new String(firstName);
		this.middleInitial = new String(middleInitial);
		this.lastName = new String(middleInitial);
		this.address = new String(address);
		this.city = new String(city);
		this.state = new String(state);
		this.zip = new String(zip);
		this.gender = new String(gender);
	
	}
	
	
	public String getGender(){
		return gender;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}


	public String getMiddleInitial() {
		return middleInitial;
	}


	public String getLastName() {
		return lastName;
	}


	public String getAddress() {
		return address;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public String getZip() {
		return zip;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	
	
	

	
	
}
