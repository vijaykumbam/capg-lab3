/**
 * 
 */
package com.capg.vijay.lab3.exec4;
import java.util.*;
/**
 * @author a
 *
 */
public class CharacterArray {
	char arr[];
	CharacterArray(int sizeOfArray)
	{
		if(sizeOfArray >0)
		{
			arr = new char[sizeOfArray];
			insertMethod(sizeOfArray);
		}
		else
		{
			System.out.println("sry buddy array size is below zero");
		}
	}
	
	void insertMethod(int sizeOfArray)
	{
		System.out.println("Enter the characters in array");
		Scanner sc = new Scanner(System.in);
		for(int loop = 0; loop<sizeOfArray;loop++)
		{
			arr[loop] = sc.next().charAt(0);
		}
		System.out.println("characters are successfully inserted in array");
		getElements(sizeOfArray);
	}
	
	void getElements(int sizeOfArray)
	{
		for(int indexChar= 0 ;indexChar<sizeOfArray;indexChar++)
		{
			 int freqCount =0;
			char hold = arr[indexChar];     //apple  hold = a
			for(int nextChar =0; nextChar<sizeOfArray;nextChar++)
			{
				if(arr[indexChar]==arr[nextChar])
				{
					freqCount = freqCount+1;
				}
			}
			System.out.println("The "+hold+"is repeating this many times "+freqCount);
			//System.out.println(arr[loop1]);
		}
		System.out.println("out of IndexChar");
		
	}
	
}
