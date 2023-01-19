package chapter17.stack_queue;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<>();
	
	public void enqueue(String data) {
		arrayQueue.add(data);
	}
	
	public String dequeue() {
		if (arrayQueue.isEmpty()) {
			return null;
		}
	
		return arrayQueue.remove(0);
	}
}

public class QueueTest1 {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
