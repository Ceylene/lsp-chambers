package org.howard.edu.lsp.assignment7;

import java.util.List;

/**
 * @author ceyle
 *
 */
public class GradeAverageStrategy implements AverageStrategy{
	
	/**
	 * computes the average of the list of grades
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.isEmpty()){
			throw new EmptyListException(grades);
		}
		else {
			int sum = 0;
			int av = 0;
			for (Integer grade:grades) {
				sum += grade;
			}
			
			av = sum / grades.size();
			return av;
		}
		
	}

}
