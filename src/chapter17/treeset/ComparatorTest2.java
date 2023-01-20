package chapter17.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return -(s1.compareTo(s2));
	}
	
}

public class ComparatorTest2 {
	public static void main(String[] args) {
		// default로 오버라이딩 되어 있는 String / Integer
		Set<String> set = new TreeSet<>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		set.add("hhh");
		set.add("bch");

		System.out.println(set);
	}
}
