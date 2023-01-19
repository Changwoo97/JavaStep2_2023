package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("list.size() : " + list.size());
		
		list.add(100);
		list.add(20);
		System.out.println("list.size() : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		// 인덱스로 접근하는 구조는 깊이가 있으면 있을수록 속도가 느려짐
		// 그 문제점을 해결하기 위해 Iterator
		
		// 1) List구조의 자원을 반복자로 변환
		for (var iter = list.iterator(); iter.hasNext();) {
			var v = iter.next();
			System.out.println(v);
		}	
	}
}
