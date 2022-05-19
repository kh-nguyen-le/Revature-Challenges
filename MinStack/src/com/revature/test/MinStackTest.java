package com.revature.test;

import com.revature.main.MinStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinStackTest {
	
	private MinStack stack;
	
	@BeforeEach
	void setupStack() {
		stack = new MinStack();
	}
	
	@Test
	void testMinStack_push() {
		stack.push(1);
		Assertions.assertEquals(1, stack.getHead());
		Assertions.assertEquals(1, stack.getTail());
		Assertions.assertEquals(1, stack.min());
		stack.push(10);
		Assertions.assertEquals(1, stack.getHead());
		Assertions.assertEquals(10, stack.getTail());
		Assertions.assertEquals(1, stack.min());
		stack.push(0);
		Assertions.assertEquals(1, stack.getHead());
		Assertions.assertEquals(0, stack.getTail());
		Assertions.assertEquals(0, stack.min());
	}
	
	@Test
	void testMinStack_pop() {
		stack.push(5);
		stack.push(10);
		stack.push(1);
		Assertions.assertEquals(1, stack.pop());
		Assertions.assertEquals(5, stack.min());
		Assertions.assertEquals(5, stack.getHead());
		Assertions.assertEquals(10, stack.getTail());
	}
}
