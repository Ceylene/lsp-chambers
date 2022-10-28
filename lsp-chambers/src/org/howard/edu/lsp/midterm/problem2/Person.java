package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;

		public Person(String name,  String socialSecurityNumber, int age) {
			this.name = name;
			this.socialSecurityNumber = socialSecurityNumber;
			this.age = age;
			
		}
		
		public String toString() {

			return "Person's name: " + name + "\nPerson's ssn: " + socialSecurityNumber + "\nPerson's age: " + age +  "\n";
			}

		public boolean equals(Object o)
			{

			Person p = (Person)o;

			if(this.socialSecurityNumber == p.socialSecurityNumber) {
				return true;
			} else {
					return false;
					}
				}
			}
			
