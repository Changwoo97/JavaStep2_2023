package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김치", 85);
		map.put("홍길동", 90);
		map.put("박수", 98);
		map.put("동장군", 75);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		
		// 객체 키 모두 받기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println("\t" + key + " " + map.get(key));
		}
		System.out.println();
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		var iter = entrySet.iterator();
		
		while (iter.hasNext()) {
			var entry = iter.next();
			System.out.println("\t" + entry.getKey() + " " + entry.getValue());
		}
		
	}
}
