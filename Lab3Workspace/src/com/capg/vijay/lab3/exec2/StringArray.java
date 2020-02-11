/**
 * 
 */
package com.capg.vijay.lab3.exec2;
import java.util.*;
/**
 * @author a
 *
 */
public class StringArray {

	//static String arr[];
	/*StringArray(int sizeOfArray)
	{
		if(sizeOfArray>0) {
		arr = new String[sizeOfArray];
		}
		else {
			System.out.println("sry buddy array size is below 0");
		} 
	}
	*/
	
	static String acceptStringArrayMethod(String name)
	{
		char arr[]=new char [name.length()];   //vijaya ===> V I J A Y A;
		//System.out.println("Enter ");
		for(int loop =0;loop<name.length();loop++) 
		{
			arr[loop] = name.charAt(0);
		}
		Arrays.sort(arr);
		
		for(int index=0;index<name.length();index++) {
			System.out.println(arr[index]);
		}
		return "hello";
	}

}
