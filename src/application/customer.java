package application;

public class customer {
	
	private final String firstName;
	private final String middleInitial;
	private final String lastName;
	private final String address;
	private final String city;
	private final String state;
	private final String zip;
	
	
	
	
	public customer(String firstName, String middleInitial, String lastName, String address, String city, String state, String zip){
		this.firstName = new String(firstName);
		this.middleInitial = new String(middleInitial);
		this.lastName = new String(middleInitial);
		this.address = new String(address);
		this.city = new String(city);
		this.state = new String(state);
		this.zip = new String(zip);
	}

	public String getfirstName() {
		return firstName;
	}

	public String getmiddleInitial() {
		return middleInitial;
	}

	public String getlastName() {
		return lastName;
	}

	public String getaddress() {
		return address;
	}

	public String getcity() {
		return city;
	}

	public String getstate() {
		return state;
	}

	public String getzip() {
		return zip;
	}
	

	
	
}
