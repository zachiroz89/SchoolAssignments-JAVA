//Created by Zach Iroz 10/6/16
/*Assignment: Create a class named Majors that includes an enumeration for the six majors
offered by a college as follows: ACC, CHEM, CIS, ENG, HIS, PHYS. Display the enumeration 
values for the user, then prompt the user to enter a major. Display the college division 
in which the major falls. ACC and CIS are in the Business Division, CHEM and PHYS in the 
Science Division, and ENG and HIS in the Humanities Division.*/
import java.util.*;


class Majors1 {
			
		public static void main(String[] args) {
			
		String userMajor;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Major: ");
		
		//display enumeration
			for (majors maj: majors.values())
			{
			System.out.println(maj);		
			}
			//get user input
			userMajor=input.nextLine();
			
			//Display division
			switch (userMajor){
			case "ACC":
			case "CIS":
			System.out.println("This major falls under the Business division");
			break;
			case"CHEM":
			case"PHYS":
			System.out.println("This major falls under the Science division");
			break;
			case"ENG":
			case"HIS":
			System.out.println("This major falls under the Humanities division");
			break;
			default:
			System.out.println("This is not a major");
			}
	}
}
enum majors{ACC, CHEM, CIS, ENG, HIS, PHYS}
