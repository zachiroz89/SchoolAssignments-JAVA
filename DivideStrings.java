//Created by Zach Iroz 10/4/16
/*Program to accept up to 20 Strings and divide them into two lists.
One containing all strings 5 characters or fewer and the other all others
then displays them in reverse order or displays error if no string in array*/
import java.util.*;
import javax.swing.*;
class DivideStrings {
	public static void main(String[] args) {
		
		
		String[] arraySmall = new String[20];
		String[] arrayLarge = new String[20];
		String input = "";
		int count;
		int stringLength;
		int largeSmall=0;
		int count2=0;
		int count3=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		//get user input
		System.out.println("Enter a String (Enter ZZZ to end input): ");
		input=keyboard.nextLine();

		//begin loop of 20 strings or less
			for(count=0; count<20; ++count)	{
				if(!(input.equalsIgnoreCase("zzz"))){
			
					stringLength=input.length();
					if (stringLength<=5){
					
					
						arraySmall[count2]=input;
						++count2;
					}
					else {
					
						arrayLarge[count3]=input;
						++count3;
					}
					System.out.println("Enter a String (Enter ZZZ to end input): ");
					input=keyboard.nextLine();
				}
				else {
				count=20;
				}
			}//end loop
			
		//get user input	
		System.out.println("Would you like to display the set of (1)large or (2)small strings? ");
		largeSmall=keyboard.nextInt();
		
		count=0;
		
		//Display Array
		if(largeSmall==1){
			if(arrayLarge[0]==null){
				System.out.println("This array is empty");
			}
			else{
			 	while(count < arrayLarge.length){
					if (arrayLarge[count]!=null){
						System.out.println(arrayLarge[count]);
						++count;
					}
					else {
						count=arrayLarge.length;
					}
				}
			}		
		}else{
			if(arraySmall[0]==null){
			System.out.println("This array is empty");
			}
			else{
				while (count<arraySmall.length){
					if (arraySmall[count]!=null){
						System.out.println(arraySmall[count]);
						++count;
					}
					else {
					count=arraySmall.length;
					}
				}
			}
		}										
	}
}			
