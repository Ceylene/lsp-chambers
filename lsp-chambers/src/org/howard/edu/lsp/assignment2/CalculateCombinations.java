package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;


/**
 * Ceylene Chambers
 * 
 * @author ceyle
 *
 */
public class CalculateCombinations {
	static boolean[][] ispossible;

	static void display(ArrayList<Integer> vec){
		System.out.println(vec);
	}

	static void compute(int arr[], int i, int sum, ArrayList<Integer> current){
		
		if (i == 0 && sum != 0 && ispossible[0][sum]){
			current.add(i);
			display(current);
			current.clear();
			return;
			}
	
		if (i == 0 && sum == 0){
			display(current);
			current.clear();
			return;
			}
		
		if (ispossible[i-1][sum]){
			ArrayList<Integer> path = new ArrayList<>();
			path.addAll(current);
			compute(arr, i-1, sum, path);
			}
	
		if (sum >= arr[i] && ispossible[i-1][sum-arr[i]]){
			current.add(i);
			compute(arr, i-1, sum-arr[i], current);
			}
	}

	static void printSets(int arr[], int n, int sum){
		if (n == 0 || sum < 0){
			return;
		}
		ispossible = new boolean[n][sum + 1];
		for (int i = 0; i < n; i++){
			ispossible[i][0] = true;
		}
	
		if (arr[0] <= sum) {
			ispossible[0][arr[0]] = true;
		}
		for (int i = 1; i < n; i++){
			for (int j = 0; j < sum + 1; j++) {
				ispossible[i][j] = (arr[i] <= j) ? (ispossible[i-1][j] ||
						ispossible[i-1][j-arr[i]])
			: ispossible[i - 1][j];
			}
		}
		if (ispossible[n-1][sum] == false){
			System.out.println("No subsets exist with sum " + sum);
			return;
		}
		
		ArrayList<Integer> current = new ArrayList<>();
		compute(arr, n-1, sum, current);
		}
	}

