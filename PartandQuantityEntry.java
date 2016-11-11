
import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.*;

class PartandQuantityEntry
{
    static int partNum, quantNum;
    static String userEntry;
	final static int HIGHVALUE = 999;
	final static int LOWVALUE = 0;
    
    static Scanner in = new Scanner(System.in);
    
	public static void main (String[] args) throws DataMessagesException
	{
	    try{
	        System.out.println("Enter part number:# ");
	        userEntry=in.nextLine();
			partNum=Integer.parseInt(userEntry);
	    }
		catch(NumberFormatException error){
	    	System.out.println(DataMessages.getError(0));
	
		}
		if (partNum>HIGHVALUE){
			throw(new DataMessagesException(2));
		}
		if(partNum<LOWVALUE){
			throw(new DataMessagesException(3));
		}
		try{
			System.out.println("Enter Quantity number:# ");
			userEntry=in.nextLine();
			quantNum=Integer.parseInt(userEntry);
			
		}
		catch(NumberFormatException error){
			System.out.println(DataMessages.getError(1));			
		}
		if (quantNum>HIGHVALUE){
			throw(new DataMessagesException(4));
		}
		if(quantNum<LOWVALUE){
			throw(new DataMessagesException(5));
		}
		System.out.println("Valid Entry");
	}
}
