package com.revature.stackimple;

public class StackImple {
	private int array[];
	private int top;
	private int capacity;

	StackImple(int size) {
		array = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x) {

		if (isFull()) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		array[++top] = x;
	}

	public int pop()  {
		if(isEmpty() ) {
			try {
				throw new Exception();	
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return array[top --];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}
}
