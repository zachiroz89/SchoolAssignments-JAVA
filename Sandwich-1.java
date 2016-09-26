//Created by Zach Iroz 9/1/16
//Object Sandwich and it's properties
import java.util.Scanner;

public class Sandwich 
{
	//declare class variables
	String mainIngredient;
	String breadType;
	double price;
	
	public void setPrice(double Price)
	{
		price=Price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setBreadType(String Bread)
	{
		breadType=Bread;
	}
	public String getBreadType()
	{
		return breadType;
	}
	
	public String getMainIngredient()
	{
		return mainIngredient;
		
	}
	public void setMainIngredient(String Ingredient)
	{
		mainIngredient=Ingredient;
	}
	
}

