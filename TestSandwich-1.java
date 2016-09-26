//Created by Zach Iroz 9/1/16
//TestSandwich is an instantiation of object (class) sandwich
import java.util.Scanner;

public class TestSandwich 
{
	public static void main(String[] args) 
	{
		//get user input and initialize variable
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Main Ingredient: ");
		String mainIngredient = keyboard.nextLine(); 
		
		//create instantiation
		Sandwich yourSandwich = new Sandwich();
		yourSandwich.setMainIngredient(mainIngredient);
		
		//initialize uninitialized variables
		yourSandwich.setBreadType("White");
		
		yourSandwich.setPrice(4.99);
		
		//Check to see that input is correct
		System.out.println("Users Bread type is " + yourSandwich.getBreadType());
		System.out.println("Users Main Ingredient is " + yourSandwich.getMainIngredient());
		System.out.println("Users Price is $" + yourSandwich.getPrice());
		
	}
}
