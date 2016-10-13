import javax.swing.*;
public class Faculty extends CollegeEmployee{
	boolean tenured;
	public Faculty(String firstName, String lastName, String streetAddress, int zipCode, int phoneNumber, 							int ssn, int salary, String department, boolean ten)
	{
		super(firstName, lastName, streetAddress, zipCode, phoneNumber, ssn, salary, department);
		setTenure(ten);
	}
	public void setTenure(boolean ten){
		int selection=JOptionPane.showConfirmDialog(null, "Is the Faculty Tenured?", "Tenur Status", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(selection==0)
			ten=true;
		
			else {
				ten=false;
			}
		tenured=ten;
	}
	public void displayFaculty(){
		System.out.println("First Name: "+ firstName + "\nLast Name: "+ lastName + "\nStreet Address: "+ streetAddress + "\nZip Code: "+zipCode+ "\nPhone Number: "+ phoneNumber+ "\nSocial Security Number: "+ socialSecurityNumber+ "\nAnnual Salary:$ "+ annualSalary + "\nDepartment: "+ departmentName + "Tenured? " + tenured);

	}
}