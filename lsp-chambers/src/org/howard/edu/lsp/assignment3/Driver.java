package org.howard.edu.lsp.assignment3;


/**
 * Ceylene Chambers
 * 
 * @author ceyle
 *
 */
public class Driver {

	public static void main(String args[]){
		CalculateCombinations comb = new CalculateCombinations();
		
		int arr1[] = {5, 5, 15, 10};
		int n1 = arr1.length;
		int sum1 = 15;
		System.out.println("Sets:");
		
		comb.printSets(arr1, n1, sum1);
		
		System.out.println("\n");
		
		int arr2[] = {1, 2, 3, 4, 5, 6};
		int n2 = arr2.length;
		int sum2 = 6;
		System.out.println("Sets:");
		
		comb.printSets(arr2, n2, sum2);
		
		System.out.println("\n");
		
		int arr3[] = {};
		int n3 = arr3.length;
		int sum3 = 15;
		System.out.println("Sets:");
		
		comb.printSets(arr3, n3, sum3);
		
		System.out.println("\n");
		
		int arr4[] = {1, 2, 3, 4, 5};
		int n4 = arr4.length;
		int sum4 = 16;
		System.out.println("Sets:");
		
		comb.printSets(arr4, n4, sum4);
		
		System.out.println("\n");
		
		int arr5[] = {2,7,11,15};
		int n5 = arr5.length;
		int sum5 = 20;
		System.out.println("Sets:");
		
		comb.printSets(arr5, n5, sum5);
		
		System.out.println("\n");
		
	}
}
