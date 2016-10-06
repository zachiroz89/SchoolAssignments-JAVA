import java.util.*;
import javax.swing.*;
import javax.xml.transform.*;

class RecordingSort {
	public static void main(String[] args) {
		int sortOption = 0;
		Scanner input = new Scanner(System.in);
		//String [][] array=new String[5][3];
		String [][] array={{"j", "e", "2:08"},
							{"d", "i", "5:40"},
							{"m", "c", "1:24"},
							{"l", "g", "4:16"},
							{"f", "a", "3:51"}};
		Recording sort = new Recording();
		/*
		for(int a=0; a<array.length; ++a){
		
			System.out.println("Enter Song: ");
			array[a][0]= input.nextLine();
			
			System.out.println("Enter Artist: ");
			array[a][1]= input.nextLine();
			
			System.out.println("Enter Play Time: ");
			array[a][2]= input.nextLine();
		}
		*/
			do{
				System.out.print("How would you like to sort?\n(1)Song\n(2)Artist\n(3)Play Time (0 to exit))");
				sortOption=input.nextInt();
			for(int i= 0; i<4; ++i){	
				for(int a=0; a<4-i; ++a){
					if(array[a][sortOption-1].compareToIgnoreCase(array[a+1][sortOption-1])>0){
						String temp="";
						
System.out.println("Goes from " + a + " to " + (a+1) + "  Switching " + array[a][sortOption-1] + " and " + array[a+1][sortOption-1]);
						for(int b=0; b<3; ++b){
							temp = array[a][b];
							array[a][b]= array[a+1][b];
							array[a+1][b] = temp;
						}
					}
				}	
			}
			for (int a=0; a<array.length; ++a){
				for(int b=0; b<array[a].length; ++b){
					System.out.print(array[a][b]+ " ");
				}
				
				System.out.println("\n");
			}
			
			}while(sortOption!=0);
	}
}