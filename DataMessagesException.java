import java.util.*;
import java.lang.*;
import java.io.*;

class DataMessagesException extends Exception
{
	public DataMessagesException(int i) 
	{
        super(DataMessages.getError(i));
		
		
	}
}
