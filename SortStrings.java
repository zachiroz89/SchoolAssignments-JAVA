//Created by Zach Iroz 10/6/16
/*assignment:Write an application containing an array of 10 String values,
and display them in ascending order.*/
class SortStrings {
	public static void main(String[] args) {
		
		//delcare variables and array
		String stringsArray[]={"x-ray","delta","echo","golf","mike","alpha","foxtrot","whiskey","yankee","hotel"};
		int a, b;
		int highSub= stringsArray.length-1;
		
		//bubble sort array
		
		for (a = 0; a < highSub; ++a){ //begin loop
			for(b = 0; b < highSub; ++b){
				if(stringsArray[b].compareTo(stringsArray[b+1])>0)
				{
				String temp= stringsArray[b];
				stringsArray[b]= stringsArray[b + 1];
				stringsArray[b+1] = temp;
				}
			}
		}//end loop
		
		
		//display array
		for(a=0; a< highSub; ++a) //begin loop
			System.out.println(stringsArray[a]);
			//end loop
	}
}