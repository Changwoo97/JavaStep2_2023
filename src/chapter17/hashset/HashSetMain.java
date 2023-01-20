package chapter17.hashset;

import java.util.HashSet;

public class HashSetMain {
	public static void main(String[] args) {
		// equals와 hashcode가 override된 string type
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("임정희");
		hashSet.add("박현정");
		hashSet.add("홍연희");
		hashSet.add("강감찬");
		
		System.out.println(hashSet);
		
		hashSet.add("강감찬");
		
		System.out.println(hashSet);
		
		
	}
}
