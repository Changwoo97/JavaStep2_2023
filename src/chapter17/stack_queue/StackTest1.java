package chapter17.stack_queue;

import java.util.Stack;

public class StackTest1 {
	public static void main(String[] args) {
		Object obj;
		// empty 스택생성
		Stack<Object> st = new Stack<>();
		
		// 입력
		if (st.empty()) { // 스택이 비어 있으면
			for (int i = 1; i <= 5; i++) {
				st.push(new String("Hi! " + i));
				System.out.println("입력 " + i + "번째" + st.peek());
			}
		}
		
		// 출력
		st.pop(); // 밖으로 나오는 5출력
		// 현재 위치 4
		System.out.println("현재 Top의 위치(peek) : " + st.peek());
		st.pop(); // 밖으로 나오는 4출력
		// 현재 위치 3
		System.out.println("현재 Top의 위치(peek) : " + st.peek());
		st.push("Happy!!");
		System.out.println(st.peek());
		st.push("Good!!");
		System.out.println(st.peek());
	}
}
