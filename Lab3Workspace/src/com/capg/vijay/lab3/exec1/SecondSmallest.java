/**
 * 
 */
package com.capg.vijay.lab3.exec1;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author a
 *
 */
public class SecondSmallest {
	static int arr[];
	SecondSmallest(int sizeOfArray)  //class constructor to  check valid size of array
	{
		if(sizeOfArray>0) {
		arr =new int[sizeOfArray];
	  }
		else {
			System.out.println("You entered the size is below zero"+ sizeOfArray);
		}
		//insertElements(sizeOfArray);
	}
	void insertElements(int sizeOfArray )  //insert method to insert the values
	{
		System.out.println("Enter the elements in array");
		for(int element=0; element<sizeOfArray;element++)
		{
			Scanner sc = new Scanner(System.in);
			arr[element]= sc.nextInt();
		}
		System.out.println("Elements are successfully inserted before sorted ");
		//display(sizeOfArray);
	}
	
	int getSecondSmallest(int sizeOfArray,int userRequiredNumber)  //display method 
	{
		System.out.println("Elements are successfully inserted After sorted ");
		for(int elementPrint =0;elementPrint <sizeOfArray;elementPrint++) 
		{
			Arrays.sort(arr);
			System.out.println(arr[elementPrint]);
		}
		System.out.println("Element at userRequirement is ="+arr[userRequiredNumber]);
		return 0;
	}
	
}