package com.revature.main;

import java.util.LinkedList;
import java.util.List;

public class SumLists {
	
	public static List<Integer> sumOfListsReversed(LinkedList<Integer> a, LinkedList<Integer> b) {
		LinkedList<Integer> list1 = (LinkedList<Integer>) a.clone();
		LinkedList<Integer> list2 = (LinkedList<Integer>) b.clone();
		List<Integer> output = new LinkedList<>();
		int n = Math.max(a.size(), b.size());
		int carry = 0;
		for (int i = 0; i < n; i++) {
			int el1 = 0;
			int el2 = 0;
			if (list1.peek() != null) el1 = list1.poll();
			if (list2.peek() != null) el2 = list2.poll();
			int sum = el1 + el2 + carry;
			output.add(sum % 10);
			carry = sum > 9 ? 1 : 0;
		}
		return output;
	}
	
	public static List<Integer> sumOfListsForward(LinkedList<Integer> a, LinkedList<Integer> b) {
		LinkedList<Integer> list1 = (LinkedList<Integer>) a.clone();
		LinkedList<Integer> list2 = (LinkedList<Integer>) b.clone();
		List<Integer> output = new LinkedList<>();
		int n = Math.max(a.size(), b.size());
		int carry = 0;
		for (int i = 0; i < n; i++) {
			int el1 = 0;
			int el2 = 0;
			if (list1.peekLast() != null) el1 = list1.removeLast();
			if (list2.peekLast() != null) el2 = list2.removeLast();
			int sum = el1 + el2 + carry;
			output.add(0,sum % 10);
			carry = sum > 9 ? 1 : 0;
		}
		return output;
	}
	
}
