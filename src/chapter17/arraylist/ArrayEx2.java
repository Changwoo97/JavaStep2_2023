package chapter17.arraylist;

import java.util.ArrayList;

public class ArrayEx2 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("강감찬");
		list.add("을지문덕");
		list.add("김유신");
		
		var iter = list.iterator();
		while (iter.hasNext()) {
			var element = iter.next();
			System.out.println(element);
		}
	}
}
