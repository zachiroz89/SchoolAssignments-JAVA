//Created by Zach Iroz 9/15/16
//Program to display the 12 days of Christmas based on the verse Entered by User
import java.util.Scanner;
class TwelveDays {
	public static void main(String[] args) {
		
		//declare variable
		int day;
		
		//declare object for input
		Scanner keyboard = new Scanner(System.in);
		
		//get user input
		System.out.println("Enter Day for 12 Days of Christmas Song and Verse: ");
		day = keyboard.nextInt();
		
		//Display Verse and Day 
		System.out.println("On the "+ day + " day of Christmas my true love gave to me ");
		
		switch(day){
			case 12: System.out.println("Twelve drummers drumming, "); 
			case 11: System.out.println("Eleven pipers piping, "); 
			case 10: System.out.println("Ten lords a leaping, ");
			case 9: System.out.println("Nine ladies dancing, ");
			case 8: System.out.println("Eight maids a milking, ");  
			case 7: System.out.println("Seven swans a swimming, ");
			case 6: System.out.println("Six geese a laying, ");
			case 5: System.out.println("FIVE GOLDEN RINGS!.... ");
			case 4: System.out.println("Four calling birds, ");
			case 3: System.out.println("Three French hens, ");
			case 2: System.out.println("Two turtle doves and a Partridge in a pear tree!");
			break;
			case 1: System.out.println("A Partridge in a pear tree!");
		}
	}
}