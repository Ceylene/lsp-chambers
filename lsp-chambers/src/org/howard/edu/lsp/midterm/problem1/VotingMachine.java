package org.howard.edu.lsp.midterm.problem1;

import java.util.*;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet.IntegerSetException; 
/**
 * VotingMachine
 * @author Ceylene Chambers
 * This class manages the behaviors of a VotingMachine
 */
public class VotingMachine { 
	
	static Scanner sc = new Scanner(System.in); 
	/**
	 *  Adds a candidate to the HashMap if it isn't already there	
	 * @param item: Name to be added
	 */
		public void addCandidate(HashMap<String, Integer> votes) {
			
			System.out.println("Enter the name of the candidate");
			String name = sc.nextLine(); 
			votes.put(name, 0); 
			} 
	/**
	 *  Adds a vote to the chosen candidate	
	 * @param item: Name of candidate voted for
	 */
		public void castVotes(HashMap<String, Integer> votes) { 
			
			System.out.println("Current Candidates:"); 
			for(String n : votes.keySet()) { 
				System.out.println(n); 
			} 
			System.out.println("Enter candidate name to cast vote:");
			sc.nextLine(); 
			String cName = sc.nextLine(); 
			if(votes.containsKey(cName)) { 
				int vote = votes.get(cName); 
				vote++; votes.put(cName, vote); 
			} 
			else { 
				System.out.println("Enter valid candidate name."); 
			} 
			} 
		/**
		 *  Returns current number of votes for a specified candidate	
		 * @param item: Name of candidate to display vote count for
		 * @return Returns current number of votes for a specified candidate
		 * @throws UnknownCandidateException Is thrown if the candidate is not in the HashMap
		 */
		public int getVotes(HashMap<String, Integer> votes)  throws UnknownCandidateException {
			System.out.println("Enter the name of the candidate");
			int sum = 0;
			String name = sc.nextLine(); 
			if (votes.get(name) == null) {
				throw new UnknownCandidateException("\nUnknown Candidate");
			} else {
				for (Map.Entry<String,Integer> entry : votes.entrySet()) { 
					if(votes.containsKey(name)) {
						String key = entry.getKey(); 
						int value = entry.getValue(); 
						System.out.println(key + " has "+ value + " votes.");
						sum =  value;
					}

					}
				}
			return sum; 
		}
		/**
		 *  Returns total number of votes for all candidates	
		 * @param item: Hashmap with candidates and votes
		 * @return Returns total number of votes for all candidates	
		 */

		public int sum(HashMap<String, Integer> votes) { 
			System.out.println("Below are the votes each candidates got: ");
			if(votes.size() == 0) { 
				
				System.out.println("Roster is empty.");
				} 
			
			for (Map.Entry<String,Integer> entry : votes.entrySet()) { 
				
				String key = entry.getKey(); 
				int value = entry.getValue(); 
				System.out.println(key + " got "+ value + " votes.");
				
				}
			return 0;
			} 
		
		/** UnknownCandidateException:
		 * 
		 * This catches exceptions in this class when a user inputs a candidate not on the roster.
		 * @author Ceylene Chambers
		 */
		public class UnknownCandidateException extends Exception {
			UnknownCandidateException (String s) {
		    	super(s);
		    }
		}
		} 
