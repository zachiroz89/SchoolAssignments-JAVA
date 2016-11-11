import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.AccessMode.*;
import java.io.*;

//import java.io.IOExceptions;

class FilesStatistics2 {
	public static void main(String[] args) {
		
		Path quote1 = Paths.get("/Users/student/Desktop/quote.txt");
		Path quote2 = Paths.get("/Users/student/Desktop/quote.docx");
				System.out.println("path is "+ quote1.toString());
		
		
		try{
		//	quote1.getFileSystem().provider().checkAccess(quote1);
		//	System.out.println("File can be read and executed");
		BasicFileAttributes attr1 = Files.readAttributes(quote1, BasicFileAttributes.class);
		
		System.out.println("Quote.txt file size: "+ attr1.size()+" Bytes");
		BasicFileAttributes attr2 = Files.readAttributes(quote2, BasicFileAttributes.class);
		
		System.out.println("Quote.docx file size: "+ attr2.size()+" Bytes");
		
		double ratio= (attr2.size())/(attr1.size());
		System.out.println("Their ratio of .txt file to every word file for this quote is " +ratio);
		}
		catch(IOException e){
			System.out.println("IOException");
		}
	}
}