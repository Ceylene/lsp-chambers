package org.howard.edu.lsp.assignment5.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

	@Test
	@DisplayName("Test case for IntegerSet.Clear")
	void testClear() {
		System.out.println("Test case for IntegerSet.Clear");
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("\tSet1: " + set1.toString());
		System.out.println("\tSet2: " + set2.toString());
		
		set1.clear();
		
		assertEquals("[]", set1.toString());
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.Length")
	void testLength() {
		System.out.println("Test Case for IntegerSet.Length");
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("\tset1: " + set1.toString());
		System.out.println("\tset1: " + set2.toString());
		
		assertEquals(3, set1.length());
		assertEquals(0, set2.length());
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.Equals")
	void testEqualsIntegerSet() {
		System.out.println("Test Case for IntegerSet.Equals");
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		IntegerSet set3 = set1;
		
		set4.add(2);
		set4.add(3);
		
		System.out.println("\tset1: " + set1.toString());
		System.out.println("\tset2: " + set2.toString());
		System.out.println("\tset3: " + set3.toString());
		System.out.println("\tset4: " + set4.toString());
		
		assertTrue(set1.equals(set3));
		assertFalse(set1.equals(set4));
		
		// Testing empty set
		assertFalse(set1.equals(set2));
		
		System.out.println();
	}
	
	
	@Test
	@DisplayName("Test Case IntegerSet.Equals with Two Empty Sets")
	void testEqualsTwoNullArrays() {
		System.out.println("Test Case IntegerSet.Equals with Two Empty Sets");
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		System.out.println("\tset1: " + set1.toString());
		System.out.println("\tset2: " + set2.toString());
		
		assertTrue(set1.equals(set2));
		
		System.out.println();
	}
	
	@Test
	@DisplayName("Test Case for IntegerSet.Contains")
	void testContains() {
		System.out.println("Test Case for IntegerSet.Contains");
		

		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.add(0);
		set1.add(1);
		set1.add(2);
		
		System.out.println("\tSet1: " + set1.toString());
		System.out.println("\tSet2: " + set2.toString());
		
		assertTrue(set1.contains(1));
		assertFalse(set1.contains(3));
		
		// Testing Empty Set
		assertFalse(set2.contains(3));
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.Largest")
	void testLargest() throws IntegerSetException {
		System.out.println("Test Case for IntegerSet.Largest");
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("\tset1: " + set1.toString());
		
		assertEquals(3, set1.largest());
		assertNotEquals(1, set1.largest());
		
		set1.add(4);
		assertEquals(4, set1.largest());
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.Largest with an Empty Set")
	void testLargestOnNullArray() {
		System.out.println("Test Case for IntegerSet.Largest with an Empty Set");
		
		IntegerSet set1 = new IntegerSet();
		
		System.out.println("\tset1: " + set1.toString());
		
		try {
			set1.largest();
			fail();
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		
		System.out.println();
	}
	
	@Test
	@DisplayName("Test Case for IntegerSet.Smallest")
	void testSmallest() throws IntegerSetException {
		System.out.println("Test Case for IntegerSet.Smallest");
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("\tset1: " + set1.toString());
		
		assertEquals(1, set1.smallest());
		assertNotEquals(2, set1.smallest());
		
		set1.add(-1);
		assertEquals(-1, set1.smallest());
		
		System.out.println();
	}
	
	@Test
	@DisplayName("Test Case for IntegerSet.Smallest with an Empty Set")
	void testSmallestOnNullArray() {
		System.out.println("Test Case for IntegerSet.Smallest with an Empty Set");
		
		IntegerSet set1 = new IntegerSet();
		
		System.out.println("\tset1: " + set1.toString());
		
		try {
			set1.smallest();
			fail();
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		
		System.out.println();
	}
	

	@Test
	@DisplayName("Test Case for IntegerSet.Add")
	void testAdd() {
		System.out.println("Test Case for IntegerSet.Add");
		
		
		IntegerSet set1 = new IntegerSet();
		
		System.out.println("\tset1: " + set1.toString());
		
		set1.add(1);
		assertEquals(1, set1.length());
		
		// Adding duplicate values
		set1.add(1);
		assertEquals(1, set1.length());
		set1.add(2);
		assertEquals(2, set1.length());
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.Remove")
	void testRemove() throws IntegerSetException{
		System.out.println("Test Case for IntegerSet.Remove");
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("\tset1: " + set1.toString());
		
		set1.remove(1);
		assertEquals(2, set1.length());
		
		// Removing duplicate values
		set1.remove(1);
		assertEquals(2, set1.length());
		set1.remove(2);
		assertEquals(1, set1.length());
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.Remove with an Empty Set")
	void testRemoveOnNullArray() {
		System.out.println("Test Case for IntegerSet.Remove with an Empty Set");
		
		IntegerSet set1 = new IntegerSet();
		
		System.out.println("\tset1: " + set1.toString());
		
		
		System.out.println();
	}
	
	@Test
	@DisplayName("Test Case for IntegerSet.Union")
	void testUnion() {
		System.out.println("Test Case for IntegerSet.Union");
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		System.out.println("\tset1: " + set1.toString());
		System.out.println("\tset2: " + set2.toString());
		System.out.println("\tset3: " + set3.toString());
		
		set1.union(set2);
		
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		
		assertTrue(set1.equals(set3));
		
		// Empty Set
		set3.union(set4);
		assertTrue(set1.equals(set3));
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.Intersect")
	void testIntersect() {
		System.out.println("Test Case for IntegerSet.Intersect");
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set3.add(2);
		set3.add(3);
		
		System.out.println("\tset1: " + set1.toString());
		System.out.println("\tset2: " + set2.toString());
		System.out.println("\tset3: " + set3.toString());
		System.out.println("\tset4: " + set4.toString());
		
		set1.intersect(set2);
		
		assertTrue(set1.equals(set3));
		
		// Empty Set
		set3.intersect(set4);
		assertTrue(set4.equals(set3));
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.Diff")
	void testDiff() {
		System.out.println("Test Case for IntegerSet.Diff");
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(5);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set3.add(1);
		set3.add(5);
		
		System.out.println("\tset1: " + set1.toString());
		System.out.println("\tset2: " + set2.toString());
		System.out.println("\tset3: " + set3.toString());
		System.out.println("\tset4: " + set4.toString());
		
		set1.diff(set2);
		
		assertTrue(set1.equals(set3));
		assertFalse(set1.equals(set2));
		
		// Empty Set
		set1.diff(set4);
		
		assertTrue(set1.equals(set3));
		assertFalse(set1.equals(set4));
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.IsEmpty")
	void testIsEmpty() {
		System.out.println("Test Case for IntegerSet.IsEmpty");
		
		IntegerSet set1 = new IntegerSet();
		
		assertTrue(set1.isEmpty());
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		assertFalse(set1.isEmpty());
		
		System.out.println("\tset1: " + set1.toString());
		
		set1.clear();
		
		assertEquals(0 == set1.length(), set1.isEmpty());
		
		System.out.println();
	}

	@Test
	@DisplayName("Test Case for IntegerSet.ToString")
	void testToString() {
		System.out.println("Test Case for IntegerSet.ToString");
		
		IntegerSet set1 = new IntegerSet();
		set1.add(0);
		set1.add(1);
		set1.add(2);
		IntegerSet set2 = set1;
		
		System.out.println("\tSet1: " + set1.toString());
		System.out.println("\tSet2: " + set2.toString());
		
		assertEquals("[0, 1, 2]", set1.toString());
		assertNotEquals(set2, set1.toString());
		
		System.out.println();
	}

}
