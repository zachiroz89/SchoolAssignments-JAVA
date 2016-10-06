// Created by Zach Iroz 10/6/16
/*Assignment: a. Radio station JAVA wants a class to keep track of recordings it plays.
Create a class named Recording that contains fields to hold methods for setting and 
getting a Recording’s title, artist, and playing time in seconds. 
Save the file as Recording.java.

b. Write an application that instantiates five Recording objects and prompts the user 
for values for the data fields. Then prompt the user to enter which field the Recordings 
should be sorted by—song title, artist, or playing time. Perform the requested sort procedure,
and display the Recording objects. Save the file as RecordingSort.java.
*/
public class Recording {
	private  String[][] recordingsArray= new String[0][0];
	
	public void setArray(String[][] array){
		recordingsArray=array;
	}
	
	public String[][] getArray(){
		return recordingsArray;
	}
}