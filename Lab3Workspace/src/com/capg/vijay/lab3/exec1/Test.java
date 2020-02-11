/**
 * 
 */
package com.capg.vijay.lab3.exec1;
import java.util.Scanner;
/**
 * @author a
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Size of the array");
		Scanner sc = new Scanner(System.in);
		int sizeOfArray = sc.nextInt();
		SecondSmallest obj = new SecondSmallest(sizeOfArray);
		obj.insertElements(sizeOfArray);
		obj.getSecondSmallest(sizeOfArray,3);
		 
	}

}
