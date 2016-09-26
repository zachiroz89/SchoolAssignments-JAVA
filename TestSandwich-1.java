package chapter3Assignments;

import java.util.Scanner;

public class TestSandwich 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Main Ingredient: ");
		String mainIngredient = keyboard.nextLine(); 
		Sandwich yourSandwich = new Sandwich();
		yourSandwich.setMainIngredient(mainIngredient);
		yourSandwich.setBreadType("White");
		yourSandwich.setPrice(4.99);
		System.out.println("Users Bread type is " + yourSandwich.getBreadType());
		System.out.println("Users Main Ingredient is " + yourSandwich.getMainIngredient());
		System.out.println("Users Price is $" + yourSandwich.getPrice());
		
	}
}