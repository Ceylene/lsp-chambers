package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;

/**
 * @author ceyle
 *
 */
public class GradeWithLowestDroppedAverageStrategy implements AverageStrategy {

	/**
	 *computes the average of the list of grades with the two lowest grades dropped.
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.isEmpty()){
			throw new EmptyListException(grades);
		}
		else {
			int sum = 0;
			int av = 0;
			Collections.sort(grades);
			for (int i = 2; i < grades.size(); i++) {
				sum += grades.get(i);

			}

			int len = grades.size() - 2;
			av = sum / len;

			return av;
		}
		
	}


}
