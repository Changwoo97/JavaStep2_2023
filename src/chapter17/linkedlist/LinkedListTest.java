package chapter17.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		// 특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞뒤 링크로 연결
		//빈번한 객체 삭제 삽입이 일어나는 곳에서 ArrayList보다 성능이 좋다.
		
		List<String> myList = new LinkedList<>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		myList.add(1, "D");
		
		System.out.println(myList);
		
		myList.add(0, "O");
		System.out.println(myList);
		
		myList.add(myList.size(), "G");
		
	}
}
