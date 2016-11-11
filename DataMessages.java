
import java.util.*;
import javax.swing.*;



class DataMessages
{
	 static String[] errorMessageArray = {"Part # not Numeric","Quantity # not Numeric", "Part # too High", "Part # too Low", "Quantity # too High", "Quantity # too Low"};
	public static String getError(int i){
		return errorMessageArray[i];
		
	}
}
