package chapter17.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		long endTime = System.nanoTime();
		double interval = Math.abs(endTime - startTime) * Math.pow(10, -6);
		System.out.printf("ArrayList 걸린시간 : %.6fms\n", interval);

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		interval = Math.abs(endTime - startTime) * Math.pow(10, -6);
		System.out.printf("LinkedList 걸린시간 : %.6fms\n", interval);
	}
}
