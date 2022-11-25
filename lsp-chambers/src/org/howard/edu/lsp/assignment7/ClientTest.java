package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment7.AverageStrategy.EmptyListException;
import org.junit.jupiter.api.Test;

class ClientTest {
	AverageContext ctx = new AverageContext();
	
	List<Integer> grades = new ArrayList<Integer>();
	
	
	@Test
	void testAverage() throws EmptyListException {
		System.out.println("Test Case for GradeAverageStrategy");
		grades.add(40);
		grades.add(50);
		grades.add(100);
		grades.add(90);
		System.out.println("grades: " + grades);
		
		ctx.setAverageStrategy(new GradeAverageStrategy());
		assertNotEquals(40, ctx.completeAverage(grades));
		assertEquals(70, ctx.completeAverage(grades));
		System.out.println("The average grade is: " + ctx.completeAverage(grades));
		
		System.out.println();
		}
	
	@Test
	void testAverageWithLowestDropped() throws EmptyListException {
		System.out.println("Test Case for GradeWithLowestDroppedAverageStrategy");
		grades.add(40);
		grades.add(50);
		grades.add(100);
		grades.add(90);
		System.out.println("grades: " + grades);
		
		ctx.setAverageStrategy(new GradeWithLowestDroppedAverageStrategy());
		assertEquals(95, ctx.completeAverage(grades));
		assertNotEquals(35, ctx.completeAverage(grades));
		System.out.println("The average grade with the lowest two grades dropped is: " + ctx.completeAverage(grades));
		System.out.println();
	}
}
