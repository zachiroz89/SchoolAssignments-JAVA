//Created by Zach Iroz 10/6/16
import java.util.*;
import javax.swing.*;
import javax.print.attribute.*;

class Untitled {
	public static void main(String[] args) {
		
		//declare variables and arrays
		//int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
		String[] monthsName = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
		String userMonth , userDay, userYear = "0";
		int month = 0;
		int day = 0;
		int year = 0;
		int[] days= new int[31];
		String userDate;
		String userDateInt;
		Scanner keyboard=new Scanner(System.in);
		
		
		//initialize array
		for(int count=0; count <=30; ++count){
			days[count]= count +1;
		}
		{
		System.out.println("Enter date (month/day/year): ");
		userDate=keyboard.nextLine();
		int len = userDate.length();
		
		
			
		}
		
		
		if(userDate.length()==10){
			if (userDate.startsWith("0")){
			userMonth=userDate.substring(1,2);
			
				
			}
			else{
				userMonth=userDate.substring(0, 2);
							}
			if (userDate.charAt(3)=='0'){
					
				userDay= userDate.substring(4, 5);
				userYear= userDate.substring(6, 10);

			}else {
				userDay= userDate.substring(3, 5);
				userYear=userDate.substring(6, 10);
			}
			
		}
		
		else if(userDate.length()==9){
			if (userDate.startsWith("0")){
			userMonth=userDate.substring(1,2);
			userDay=userDate.substring(3, 4);
			userYear=userDate.substring(5, 9);
			
				
			}else if(userDate.charAt(1)=='0'){
				
				userMonth=userDate.substring(0, 2);
				userDay=userDate.substring(3, 4);
				userYear=userDate.substring(5, 9);
			}else if(userDate.charAt(2)=='0'){
				userMonth=userDate.substring(0, 1);
				userDay=userDate.substring(3, 4);
				userYear=userDate.substring(5, 9);
			}else{
				userMonth=userDate.substring(0,1);
				userDay=userDate.substring(2, 4);
				userYear=userDate.substring(5, 9);
			}//end if
				
			
																	
				
		}else if(userDate.length()==8){
		userMonth=userDate.substring(0, 1);
		userDay=userDate.substring(2, 3);
		userYear=userDate.substring(4, 8);
		
		
		
		}
		else{
			System.out.println("Incorrect date length");
			userMonth="0";
			userDay="0";
			userYear="0";
			
		}
		userDate=userDate.replace("/", "");
		
		System.out.println("Month:"+userMonth);
		System.out.println("Day:"+userDay);
		System.out.println("Year:"+userYear);
		
		month = Integer.parseInt(userMonth);
		day = Integer.parseInt(userDay);
		year = Integer.parseInt(userYear);
		
		System.out.println(month);
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10|| month == 12 && day<=31 && day>=1)
			{
				System.out.println(monthsName[(month-1)]+" "+day+ ","+year);
			}
		else if (month == 4 || month == 6 || month == 9 || month == 11 || day>30 && day<=30 && day>=1 )
				
					System.out.println(monthsName[(month-1)]+" "+day+ ", "+year);
				
				if(day>30){
				System.out.println("This month has only 30 days");
				}
			else if(month == 2 && day<=28 && day >=1)
			
				System.out.println(monthsName[(month-1)]+" "+day+ ", "+year);
				
				else if(month == 2 && day>28)
					System.out.println("This month only has 28 days");
				else {
					System.out.println(monthsName[(month-1)]+" "+day+ ", "+year);
				}
		int dayCount=0;
		switch (month){
			case 12: 
				dayCount=334 + day;
				break;
			case 11:
				dayCount=304 + day;
				break;
			case 10:
				dayCount=273 + day;
				break;
			case 9:
				dayCount=243 + day;
				break;
			case 8:
				dayCount=212 + day;
				break;
			case 7:
				dayCount=181 + day;
				break;
			case 6:
				dayCount=151 + day;
				break;
			case 5:
				dayCount=120 + day;
				break;
			case 4:
				dayCount=90 + day;
				break;
			case 3:
				dayCount=59 + day;
				break;
			case 2:
				dayCount=31 + day;
				break;
			case 1:
				dayCount= day;
				break;
			default:
			dayCount=0;
		}
		System.out.println("This is day "+dayCount+ " of the year");
			
				
			
		}
		
				

		
	
}