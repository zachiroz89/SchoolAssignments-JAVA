import javax.swing.*;
public class Person {
	String firstName, lastName, streetAddress;
	int zipCode, phoneNumber;
	public Person(String fname, String lname, String address, int zip, int phone){
		
		setFirstName(fname);
		setLastName(lname);
		setStreetAddress(address);
		setZipCode(zip);
		setPhoneNumber(phone);
		
		
	}
	public void setFirstName(String fname){
		fname=JOptionPane.showInputDialog(null, 
		"Enter First Name: ");
		firstName=fname;
	}
	public void setLastName(String lName){
		lName=JOptionPane.showInputDialog(null, 
		"Enter Last Name: ");
		lastName=lName;
	}
	public void setStreetAddress(String address){
		address=JOptionPane.showInputDialog(null, 
		"Enter Street Address: ");
		streetAddress=address;
	}
	public void setZipCode(int zip){
		String zipC=JOptionPane.showInputDialog(null, 
		"Enter Zip Code: ");
		zip=Integer.parseInt(zipC);
		zipCode=zip;
	}
	public void setPhoneNumber(int phone){
		String phoneN=JOptionPane.showInputDialog(null, 
		"Enter Phone Number: "); 
		phone=Integer.parseInt(phoneN);
		phoneNumber=phone;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getStreetAddress(){
		return streetAddress;
	}
	public int getZipCode(){
		return zipCode;
	}
	public int getPhoneNumber(){
		return phoneNumber;
	}
	public void displayPerson(){
		System.out.println("First Name: "+ firstName + "\nLast Name: "+ lastName + "\nStreet Address: "+ streetAddress + "\nZip Code: "+zipCode+ "\nPhone Number: "+ phoneNumber);
	}
}
/*JOptionPane.showInputDialog(null, 
"Enter city for phone book");*/