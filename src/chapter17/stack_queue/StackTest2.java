package chapter17.stack_queue;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		if (arrayStack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		int index = arrayStack.size() - 1;
		return arrayStack.remove(index);
	}
	
	public String peek() {
		if (arrayStack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		int index = arrayStack.size() - 1;
		return arrayStack.get(index);
	}
}

public class StackTest2 {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
