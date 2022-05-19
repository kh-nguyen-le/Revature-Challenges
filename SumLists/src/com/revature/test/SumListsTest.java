package com.revature.test;

import com.revature.main.SumLists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.LinkedList;
import java.util.List;

public class SumListsTest {
	@Test
	void testSumListsReversed() {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		List<Integer> expected = new LinkedList<>();
		list1.add(7);
		list1.add(1);
		list1.add(6);
		
		list2.add(5);
		list2.add(9);
		list2.add(2);
		
		expected.add(2);
		expected.add(1);
		expected.add(9);
		
		List<Integer> actual = SumLists.sumOfListsReversed(list1, list2);
		
		Assertions.assertEquals(expected,actual);
	}
	
	@Test
	void testSumListsForward() {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		List<Integer> expected = new LinkedList<>();
		list1.add(6);
		list1.add(1);
		list1.add(7);
		
		list2.add(2);
		list2.add(9);
		list2.add(5);
		
		expected.add(9);
		expected.add(1);
		expected.add(2);
		
		List<Integer> actual = SumLists.sumOfListsForward(list1, list2);
		
		Assertions.assertEquals(expected,actual);
	}
}
