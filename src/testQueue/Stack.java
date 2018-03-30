package testQueue;

import java.util.LinkedList;

public class Stack {
	public static void main(String[] args){
		java.util.Stack<Integer> stack = new java.util.Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		stack.pop();
		System.out.println("pop()方法");
		System.out.println(stack);
		Integer i = stack.peek();
		System.out.println("peek()方法");
		System.out.println(i);
	}
}
