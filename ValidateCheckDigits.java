import java.nio.file.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class ValidateCheckDigits {
	public static void main(String[] args) {
		Path file = Paths.get("/Users/student/Desktop/acctNum.txt");
		InputStream input = null;
		Path newFile = Paths.get("/Users/student/Desktop/goodAcctNum.txt");
				try{
			input = Files.newInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			String s; 
			int[] digitArray = new int[6];
			int num = 0;
			double solution;
			OutputStream output = null;
			
			for(int x=0;x<10;++x){
				s=reader.readLine();
				for(int y=0;y<6;++y){
					char z=s.charAt(y);
					String dgt=""+z;
					digitArray[y]=Integer.parseInt(dgt);
					System.out.println(dgt);
				}
			solution=(digitArray[0]+digitArray[1]+digitArray[2]+digitArray[3]+digitArray[4])%10;
			System.out.println("Solution:"+solution);
			if(digitArray[5]==solution)
			{
				System.out.println("Valid account number");
				output = new BufferedOutputStream(Files.newOutputStream(newFile));
				byte[] data = s.getBytes();

				output.write(data);
				output.flush();
				output.close();
			}
			else{
				System.out.println("Invalid account number");
			}
				
			}
			System.out.println("\n");
			input.close();
			
		}
		catch (IOException e){
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e){
			
		}
	}
}