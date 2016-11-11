import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.AccessMode.*;
import java.io.*;
import java.io.IOException;

class FindSelectedFiles{
	public static void main(String[] args) {
		Path filePath = Paths.get("/Users/student/Desktop/");
		String file1=filePath+"/autoexec.bat";
		String file2=filePath+"/SameFolder.java";
		String file3=filePath+"/FileStatistics.class";
		String file4=filePath+"/Hello.doc";
		
				
		System.out.println("Search for autoexec.bat, SameFolder.java, FileStatistics.class, and Hello.doc:");
		
			
		try{
			filePath = Paths.get(file1);
			System.out.println(file1);
			filePath.getFileSystem().provider().checkAccess(filePath);
			System.out.println(filePath +" File Exists\n");
		}
		catch (IOException e) {
			System.out.println("File Doesn't Exist\n");		
			
		}
		try{
			filePath = Paths.get(file2);
			System.out.println(file2);
			filePath.getFileSystem().provider().checkAccess(filePath);
			System.out.println(filePath +" File Exists\n");
		}
		catch (IOException e) {
			System.out.println("File Doesn't Exist\n");		
			
		}
		try{
			filePath = Paths.get(file3);
			System.out.println(file3);
			filePath.getFileSystem().provider().checkAccess(filePath);
			System.out.println("File Exists\n");
		}
		catch (IOException e) {
			System.out.println("File Doesn't Exist\n");		
			
		}
		try{
			filePath = Paths.get(file4);
			System.out.println(file4);
			filePath.getFileSystem().provider().checkAccess(filePath);
			System.out.println(filePath +" File Exists\n");
		}
		catch (IOException e) {
			System.out.println("File Doesn't Exist\n");		
			
		}


	}
}