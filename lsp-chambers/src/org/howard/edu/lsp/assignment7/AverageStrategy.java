package org.howard.edu.lsp.assignment7;

import java.util.List;

/**
 * @author ceyle
 *
 */
public interface AverageStrategy {
	/**
	 * @param grades is an integer list
	 * @return average of list of grades
	 * @throws EmptyListException when grades is an empty list
	 */
	public int compute(List<Integer> grades) throws EmptyListException;
	
	/**
	 * @author ceyle
	 *
	 */
	public class EmptyListException extends Exception {
		/**
		 * custom exception to be thrown if an empty list is passed.
		 */
		private static final long serialVersionUID = 2674166215598134293L;

		/**
		 * @param grades
		 */
		EmptyListException(List<Integer> grades) {
	    	super("Empty List");
	    }
	}
}

//
//average
//average-drop2lowest
