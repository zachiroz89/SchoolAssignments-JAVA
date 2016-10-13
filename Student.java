import javax.swing.*;
public class Student extends Person{
	String majorofStudy;
	int gradePointAverage;
	public Student(String firstName, String lastName, String streetAddress, int zipCode, int phoneNumber, 							String major, int gpa)
	{
		super(firstName, lastName, streetAddress, zipCode, phoneNumber);
		setMajor(major);
		setGPA(gpa);
	}
	public void setMajor(String major){
		major=JOptionPane.showInputDialog(null, 
		"Enter Street Address: ");
		majorofStudy=major;
	}
	public void setGPA(int gpa){
		String aGPA=JOptionPane.showInputDialog(null, 
		"Enter Salary:$ ");
		gpa=Integer.parseInt(aGPA);
		gradePointAverage=gpa;
	}
	public void displayStudent(){
		System.out.println("First Name: "+ firstName + "\nLast Name: "+ lastName + "\nStreet Address: "+ streetAddress + "\nZip Code: "+zipCode+ "\nPhone Number: "+ phoneNumber + "\nMajor: "+ majorofStudy+"\nGPA: "+gradePointAverage);
	}
}