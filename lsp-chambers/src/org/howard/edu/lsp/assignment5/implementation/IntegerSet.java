package org.howard.edu.lsp.assignment5.implementation;

import java.util.*;

/**
 * IntegerSet
 * @author Ceylene Chambers
 * This class manages a collections of integers
 */
public class IntegerSet {
	/**
	 * Integer Array List for each instance
	 */
	private ArrayList<Integer> set = new ArrayList<Integer>();

	/**
	 *  Default Constructor
	 */
	public IntegerSet() {
	}

	/**
	 *  Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};
	
	/**
	 * the length function returns the size of the integer set
	 * @return Returns the length of the set
	 */
	public int length() {
		return set.size();
	}; 
	
	/** 
	 * Returns true if the 2 sets are equal, false otherwise;
	* Two sets are equal if they contain all of the same values, no matter the order.
	* @param b: Takes in an IntegerSet object
	* @return Returns true if they equal each other
	*/
	public boolean equals(IntegerSet b) {
		if (set.size() != b.set.size()) return false; // return false if sets are not the same size
		
		if (set.size() == 0) return true; //  if first set is 0, return true because they are equal
		
		// loops through the first set and checks if each integer is equal since the sets are sorted
		for(int i = 0; i < set.size(); i++) {
			if(set.get(i) != b.set.get(i)) {
				return false;
			}
		}
		return true;
	} // loops through the first set and checks if each integer is equal since the sets are sorted
	
	
	/**
	 *  Checks if the set contains the given integer
	 * @param value: Integer to check
	 * @return Returns true or false based on whether the value is in the set or not
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};
	
	
	/**
	 *  Retrieves the largest integer in the set
	 * @return Returns largest value in the set
	 * @throws IntegerSetException is thrown if there is an empty set
	 */
	public int largest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("\nCannot get an element from an empty set");
		}

		return set.get(set.size() - 1);
	};
	
	/**
	 *  Retrieves the smallest integer in the set
	 * @return Returns smallest value in the set
	 * @throws IntegerSetException is thrown if there is an empty set 
	 */
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("\nCannot get an element from an empty set");
		}
		
		return set.get(0);
		
	};


	/**
	 *  Adds an item to the set if it isn't already in the set	
	 * @param item: Integer to be added
	 */
 	public void add(int item) {
 		if (!set.contains(item)) {
 			set.add(item); // adds item to the set 
 			
	 		Collections.sort(set); // sorts the set
 		}
 	};
 	
	/**
	 *  Removes an item from the set or throws an exception if it is not present
	 * @param item: Integer to be removed
	 * @throws IntegerSetException Is thrown of the set is empty or if the integer is not in the set
	 */
	public void remove(int item) throws IntegerSetException {
		if (set.isEmpty()) {
			//throws an error if the set is empty
			throw new IntegerSetException("\nCannot remove an element from an already empty set");
		}
		if (set.contains(item)) {
			// attempts to remove the integer, if not present nothing happens
			set.remove(set.indexOf(item));
		} else {
			throw new IntegerSetException("\nThis element is not in the set");
		}
		
	};

	/**
	 *  Set union: Assigns all integers from both sets to the first set
	 * @param intSetb: 2nd set to collect items from
	 */
	public void union(IntegerSet intSetb) {
		for(int b : intSetb.set) {
			// loops through the second set and adds unique integers to the set
			this.add(b);
		}
	}
	
	/**
	 *  Set intersect: Assigns the value of the integers belonging to set1 or set2 to set1
	 * @param intSetb: 2nd set to perform this method with
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> newSet = new ArrayList<Integer>();
		
		for(int i = 0; i < intSetb.set.size(); i++) {
			// loop through the elements in the second set
			if (set.contains(intSetb.set.get(i))) {
				newSet.add(intSetb.set.get(i)); // if they are also in the first set, add them to newSet
			}
		}
		// Add all elements from newSet to set
		set.clear();
		set.addAll(newSet);
	}; 
	
	/**
	 *  Set Difference: Removes integers present in the 2nd set from the first set: A - B
	 * @param intSetb: 2nd set used to perform this method with
	 */
	public void diff(IntegerSet intSetb) {
		// set difference, i.e. s1 - s2
		for(int i = 0; i < intSetb.set.size(); i++) {
			// Loops through the second set
			if (set.contains(intSetb.set.get(i))) {
				// removes the integer from first set if it's found
				set.remove(intSetb.set.get(i));
			}
		}
	}
	
	/**
	 *  Checks if the set is empty
	 * @return Returns true if the set is empty, false otherwise
	 */
	public boolean isEmpty() {
		return set.isEmpty();
	}
	
	/**
	 * @return Returns a string representation of the set
	 */
	public String toString() {
		return set.toString();
	};	// return String representation of your set
	

	/** IntegerSetException:
	 * 
	 * This catches exceptions in this class that are thrown when there's an empty set.
	 * @author Ceylene Chambers
	 */
	public class IntegerSetException extends Exception {
	    IntegerSetException(String s) {
	    	super(s);
	    }
	}
}