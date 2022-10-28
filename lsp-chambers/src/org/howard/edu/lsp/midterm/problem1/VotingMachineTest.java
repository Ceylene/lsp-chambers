package org.howard.edu.lsp.midterm.problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.howard.edu.lsp.midterm.problem1.VotingMachine.UnknownCandidateException;
import org.junit.jupiter.api.Test;

class VotingMachineTest extends VotingMachine {
	public static void main(String[] args) throws UnknownCandidateException { 
		VotingMachine vm = new VotingMachine();
		int option = 0; 
		HashMap<String, Integer> votes = new LinkedHashMap<>(); 
		do { 
			System.out.println("1. Add Candidate"); 
			System.out.println("2. Cast Vote"); 
			System.out.println("3. Get Votes"); 
			System.out.println("4. Sum"); 
			System.out.println("5. Exit"); 
			System.out.println("Enter your choice");
			option = vm.sc.nextInt(); 
			switch(option) { 
			case 1: vm.sc.nextLine(); 
			vm.addCandidate(votes); 
			break; 
			case 2: vm.castVotes(votes); 
			break; 
			case 3: vm.sc.nextLine(); 
			vm.getVotes(votes); 
			break; 
			case 4: vm.sum(votes);
			break;
			case 5:
			default: System.out.println("Invalid option");
			break; 
			} 
			}while(option != 5); 
		}

	
	@Test
	void testGetVotes() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSum() {
		fail("Not yet implemented");
	}

}
