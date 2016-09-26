//Created by Zach Iroz 9/26/16
//Program demonstrating different string methods and their output based on quote
class DemonstratingStringMethods {
	public static void main(String[] args) {
		//Declare variable
		String quote="You can never cross the ocean until you have the courage to lose sight of the shore. -Christopher Columbus";
		
		//indexof Method shows position of Letter
		
		System.out.println(quote.indexOf('v'));
		//The first instance of 'v' is at position 10
		
		System.out.println(quote.indexOf('x'));
		//The first instance of 'v' is at position -1 because there is no x in the quote
		
		//charAt method shows what character is at that position
		
		System.out.println(quote.charAt(16));
		//in this case it is the 'o' in cross
		
		//endsWith Method compares to string and is case sensitive
		
		System.out.println(quote.endsWith("bus"));
		//in this case due to Columbus, this evaluates true
		
		System.out.println(quote.endsWith("car"));
		//in this case there is no instance of "car" so it is false
		
		//replace method has many uses but will replace one letter for another
		System.out.println(quote.replace('c', 'C'));
		//In this case it capitalized all lower case c's
		
		
	}
}