import javax.swing.*;
public class CollegeEmployee extends Person{
	int socialSecurityNumber, annualSalary;
	String departmentName;
	public CollegeEmployee(String firstName, String lastName, String streetAddress, int zipCode, int phoneNumber, 							int ssn, int salary, String department)
	{
		super(firstName, lastName, streetAddress, zipCode, phoneNumber);
		setSocialSecurityNumber(ssn);
		setAnnualSalary(salary);
		setDepartmentName(department);
	}
	public void setSocialSecurityNumber(int ssn){
		String aSSN=JOptionPane.showInputDialog(null, 
		"Enter Social Security Number: ");
		ssn=Integer.parseInt(aSSN);
		socialSecurityNumber=ssn;
	}
	public void setAnnualSalary(int salary){
		String aSalary=JOptionPane.showInputDialog(null, 
		"Enter Salary:$ ");
		salary=Integer.parseInt(aSalary);
		annualSalary=salary;
	}
	public void setDepartmentName(String department){
		department=JOptionPane.showInputDialog(null, 
		"Enter Department: ");
		departmentName=department;
	}
	public void displayEmployee(){
		System.out.println("First Name: "+ firstName + "\nLast Name: "+ lastName + "\nStreet Address: "+ streetAddress + "\nZip Code: "+zipCode+ "\nPhone Number: "+ phoneNumber+ "\nSocial Security Number: "+ socialSecurityNumber+ "\nAnnual Salary:$ "+ annualSalary + "\nDepartment: "+ departmentName);
	}



	
}