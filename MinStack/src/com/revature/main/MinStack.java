package com.revature.main;

public class MinStack {
	static class Node {
		public int value;
		public Node next;
		public Node prev;
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node minimum;
	private Node head;
	private Node tail;
	
	public int min() {
		if (head == null) throw new RuntimeException("Min called on empty stack");
		return minimum.value;
	}
	
	public void push(int element) {
		if(head != null) {
			tail.next = new Node(element);
			tail.next.prev = tail;
			tail = tail.next;
			if(minimum == null) {
				minimum = new Node(element);
			} else if (minimum.value >= element) {
				minimum.next = new Node(element);
				minimum.next.prev = minimum;
				minimum = minimum.next;
			}
		} else {
			head = new Node(element);
			tail = head;
			minimum = new Node(element);
		}
	}
	
	public int pop() {
		int value;
		if(head != null && head != tail) {
			value = tail.value;
			tail = tail.prev;
			tail.next = null;
			if (minimum.value == value) {
				minimum = minimum.prev;
				minimum.next = null;
			}
		}else if(head != null) {
			value = head.value;
			head = null;
			tail = null;
			minimum = null;
		}else {
			throw new RuntimeException("Pop called on an empty stack");
		}
		return value;
	}
	
	public int getHead() {
		return head.value;
	}
	
	public int getTail() {
		return tail.value;
	}
	
}
