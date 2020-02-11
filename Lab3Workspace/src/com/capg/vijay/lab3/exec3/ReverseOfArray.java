package com.capg.vijay.lab3.exec3;
import java.util.*;
public class ReverseOfArray {
	
	static int arr[];
	static int revarr[];
	ReverseOfArray(int sizeOfArray){
		if(sizeOfArray >0) {
		arr = new int[sizeOfArray];
		revarr= new int[sizeOfArray];
		insertMethod(sizeOfArray);
		}
		else
		{
			System.out.println("sry buddy arr size is below zero ");
		}
	}
	
	
	
	
	static void insertMethod(int sizeOfArray) {
		for(int elements = 0;elements < sizeOfArray;elements++) {
			Scanner sc =new Scanner(System.in);
			arr[elements] = sc.nextInt();
		}
		System.out.println("successfully elements are inserted inside the array");
		getReverse(sizeOfArray);
		getSort(sizeOfArray);
	}
	
	static void getReverse(int sizeOfArray)  //reverse method 
	{
		
		System.out.println("we are in getReverse method");
		for(int i =0 ; i<sizeOfArray;i++)
		{
			int result =0;
			int tempHolder = arr[i]; 
			while(tempHolder > 0) {
				int a = tempHolder%10;
				result = 10 * result + a;
				tempHolder = tempHolder/10;
			}
			revarr[i]=result;
		}
		for(int j = 0;j<sizeOfArray;j++) {
			System.out.println(revarr[j]);
		}
	}	
	
	static int getSort(int sizeOfArray)
	{
		Arrays.sort(revarr);
		System.out.println("array is sorted");
		for(int i =0;i<sizeOfArray;i++) {
			System.out.println(revarr[i]);
		}
		return 0;
	}
	
	
	
	
}
