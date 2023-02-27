package application;

public class Contact {
	
	// Variables for Contact class
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	//
	public Contact (String contactId, String firstName, String lastName, String phone, String address ) {	
		// Checks id against requirements
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		// Checks first name against requirements
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		// Checks last name against requirements
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		// Checks phone against requirements
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		// Checks address against requirements
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		// handling if no exceptions
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	// getter methods	
	}
	public String getContactId(){
		return contactId;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getPhone(){
		return phone;
	}
	public String getAddress(){
		return address;
	}
	
	// setter methods, used by ContactService class
	// no set method for contactId because it should not be updated
	public void setFirstName(String fName) {
		if (fName == null || fName.length() > 10) {
				throw new IllegalArgumentException("Ivalid First Name");
		}
			this.firstName = fName;
	}
	public void setLastName(String lName) {
		if (lName == null || lName.length() > 10) {
				throw new IllegalArgumentException("Invalid Last Name");
		}
			this.lastName = lName;
	}
	public void setPhone(String newPhone) {
		if (newPhone == null || newPhone.length() != 10) {
				throw new IllegalArgumentException("Inavlid Phone Number");
		}
			this.phone = newPhone;
	}
	public void setAddress(String newAddress) {
			if (newAddress == null || newAddress.length() > 30) {
				throw new IllegalArgumentException("Invalid Address");
	}
			this.address = newAddress;
		}
	
}
