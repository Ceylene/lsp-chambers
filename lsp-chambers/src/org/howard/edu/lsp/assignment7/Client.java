package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment7.AverageStrategy.EmptyListException;

/**
 * @author ceyle
 *
 */
public class Client {
	/**
	 * @param args
	 * @throws EmptyListException if grades is an empty list
	 */
	public static void main(String[] args) throws EmptyListException {
		AverageContext ctx = new AverageContext();
		
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(40);
		grades.add(50);
		grades.add(100);
		grades.add(90);
		
		
		ctx.setAverageStrategy(new GradeAverageStrategy());
		System.out.println("The average grade is: " + ctx.completeAverage(grades));
		
		ctx.setAverageStrategy(new GradeWithLowestDroppedAverageStrategy());
		System.out.println("The average grade with the lowest two grades dropped is: " + ctx.completeAverage(grades));

	}
}
