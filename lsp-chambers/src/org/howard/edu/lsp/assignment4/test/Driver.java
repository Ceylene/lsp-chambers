package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
public class Driver {

	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		System.out.println("Set1 and Set2 contain the following elements:");
		System.out.println("Set1: " + set1.toString());
		System.out.println("Set2: " + set2.toString());
		System.out.println();
		
		System.out.println("Value of Set1 is: " + set1.toString());
		try {
			System.out.println("Smallest value in Set1 is: " + set1.smallest());
		} catch (Exception e) {
			System.out.println("An error occurred: " + e);
		}
		System.out.println();

		try {
			System.out.println("Largest value in Set1 is: " + set1.largest());
		} catch (Exception e) {
			System.out.println("An error occurred: " + e);
		}
		System.out.println();

		
		System.out.println("Value of Set2 is: " + set2.toString());
		try {
			System.out.println("Smallest value in Set2 is: " + set2.smallest());
		} catch (Exception e) {
			System.out.println("An error occurred: " + e);
		}
		System.out.println();

		try {
			System.out.println("Largest value in Set2 is: " + set2.largest());
		} catch (Exception e) {
			System.out.println("An error occurred: " + e);
		}
		System.out.println();
		
		System.out.println("Length of Set1 and Set2: ");
		System.out.println("Set1: "+ set1.toString());
		System.out.println("Length of Set1 is: " + set1.length());
		System.out.println("\n");
		
		System.out.println("Set2: "+ set2.toString());
		System.out.println("Length of Set2 is: " + set2.length());
		System.out.println("\n");
		
		
		System.out.println("Clearing the sets...");
		set1.clear();
		System.out.println("Value of Set1: " + set1.toString());
		
		set2.clear();
		System.out.println("Value of Set2: " + set2.toString());
		System.out.println();
		
		
		System.out.println("Adding to the sets...");
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println("Value of Set1: " + set1.toString());
		System.out.println();
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		System.out.println("Value of Set2: " + set2.toString());
		System.out.println();
		
		
		System.out.println("Trying to add duplicate integers: ");
		System.out.println("Set1: " + set1.toString());
		System.out.println("Set2: " + set2.toString());
		System.out.println();
		
		System.out.println("What is the length of Set1?");
		System.out.println(set1.length());
		System.out.println();
		
		System.out.println("Adding '2' to Set1...");
		set1.add(2);
		System.out.println();

		System.out.println("What is the length of Set1?");
		System.out.println(set1.length());
		System.out.println("Set1: "+ set1.toString());
		System.out.println();
		
		System.out.println("What is the length of Set2?");
		System.out.println(set2.length());
		System.out.println();

		System.out.println("Adding '6' to Set2...");
		set2.add(6);
		System.out.println();

		System.out.println("What is the length of Set2?");
		System.out.println(set2.length());
		System.out.println("Set2: "+ set2.toString());
		System.out.println("\n");
		
		
		
		System.out.println("Does Set1 contain '4'? ");
		System.out.println(set1.contains(4));
		System.out.println("\n");
		System.out.println("Does Set2 contain '3'? ");
		System.out.println(set2.contains(3));
		System.out.println("\n");
		
		
		
		
		System.out.println("Removing '4' from Set2...");
		try {
			set2.remove(4);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e);
		}
		
		System.out.println("Set2: "+ set2.toString());
		System.out.println("Does Set2 contain '4'?");
		System.out.println(set2.contains(4));
		System.out.println("\n");
		
		
		System.out.println("Removing '3' from Set1...");
		try {
			set1.remove(3);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e);
		}
		
		System.out.println("Set1: " + set2.toString());
		System.out.println("Does Set1 contain '3'?");
		System.out.println(set1.contains(3));
		System.out.println("\n");
		
		
		System.out.println("Removing elements not in the set:");
		System.out.println("Removing '4' from Set2 again...");
		try {
			set2.remove(4);
		} catch (Exception e) {
			System.out.println("A problem occurred: " + e);
		}
		System.out.println("Set2: "+ set2.toString());
		System.out.println();
		
		System.out.println("Removing '3' from Set1 again...");
		try {
			set1.remove(3);
		} catch (Exception e) {
			System.out.println("A problem occurred: " + e);
		}
		System.out.println("Set1: "+ set1.toString());
		System.out.println("\n");
		
		
		
		System.out.println("Removing An Integer From An Empty Integer Set: ");
		System.out.println("Clearing Set2...");
		set2.clear();
		System.out.println("Set2: "+ set2.toString());
		System.out.println();
		
		System.out.println("Trying to remove '4' from Set2 again...");
		try {
			set2.remove(4);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e);
		}
		System.out.println();
		
		System.out.println("Clearing Set1...");
		set1.clear();
		System.out.println("Set1: " + set1.toString());
		System.out.println();
		
		System.out.println("Trying to remove '3' from Set1 again...");
		try {
			set1.remove(3);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e);
		}
		System.out.println("\n");
		
		set1.clear();
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);

		set2.clear();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		System.out.println("Set Comparison: ");
		System.out.println("Set1: "+ set1.toString());
		System.out.println("Set2: "+ set2.toString());
		System.out.println();
		
		System.out.println("Are Set1 and Set2 equal? ");
		System.out.println(set1.equals(set2));
		System.out.println();
		
		
		set1.clear();
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println("Set1: "+ set1.toString());
		System.out.println("Set2: "+ set2.toString());
		System.out.println();
		
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		System.out.println("Are Set1 and Set2 equal? ");
		System.out.println(set1.equals(set2));
		System.out.println();
		
		System.out.println("What is the value of Set1 'Union' Set2? ");
		set1.union(set2);
		System.out.println("Set1 'Union' Set2 = " + set1.toString());
		set1.clear();
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println("\n");
		
		System.out.println("What is the value of Set1 'Intersection' Set2?");
		set1.intersect(set2);
		System.out.println("Set1 'Intersection' Set2 = " + set1.toString());
		set1.clear();
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println("\n");
		
		System.out.println("What is the value of Set1 'Difference' Set2? ");
		set1.diff(set2);
		System.out.println("Set1 'Difference' Set2 = " + set1.toString());
		System.out.println();

		System.out.println("Is Set1 empty? ");
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println("Is Set2 empty? ");
		System.out.println(set2.isEmpty());
		System.out.println("\n");		
		
		System.out.println("Clearing Set1...");
		set1.clear();
		System.out.println();
		System.out.println("Is Set1 empty? ");
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println("Clearing Set2...");
		set2.clear();
		System.out.println();
		System.out.println("Is Set2 empty? ");
		System.out.println(set2.isEmpty());
		System.out.println();
		System.out.println("\n");		
	}

}