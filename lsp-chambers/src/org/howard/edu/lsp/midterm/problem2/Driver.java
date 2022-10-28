package org.howard.edu.lsp.midterm.problem2;

public class Driver {
	public static void main(String[] args) {
		
		Person p1 = new Person("name1", "111-11-1111", 23);
		
		System.out.println(p1);
		
		Person p2 = new Person("name2", "111-11-1111", 34);

		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("These are the same!");
		}else {
		System.out.println("Not the same!");
		}
		}
}
