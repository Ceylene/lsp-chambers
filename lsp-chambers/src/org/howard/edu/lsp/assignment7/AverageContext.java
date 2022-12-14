package org.howard.edu.lsp.assignment7;

import java.util.List;

import org.howard.edu.lsp.assignment7.AverageStrategy.EmptyListException;

public class AverageContext {
	private AverageStrategy strategy;
	public void setAverageStrategy(AverageStrategy strategy) {
		this.strategy = strategy;
	}
	public int completeAverage(List<Integer> grades) throws EmptyListException {
		return strategy.compute(grades);
	}
	
}
