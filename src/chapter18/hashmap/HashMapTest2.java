package chapter18.hashmap;

import java.util.HashMap;

public class HashMapTest2 {
	public static void main(String[] args) {
		// Map<String, Integer> 생성 
		var map = new HashMap<>();
		
		// 팀원 데이터(성함, 학번) 저장
		map.put("김창우", 1001);
		map.put("정세나", 1002);
		map.put("김우태", 1003);
		map.put("박수연", 1004);
		map.put("백유기", 1005);
		map.put("박범준", 1006);
		
		// 팀원의 인원
		System.out.println("팀원의 인원 : " + map.size());
		
		// 팀장의 학번을 알아내자
		System.out.println("팀장의 학번 : " + map.get("김창우"));
		
		// 팀원 모두의 학번 출력
		var entrySet = map.entrySet();
		for (var iter = entrySet.iterator(); iter.hasNext();) {
			var entry = iter.next();
			var key = entry.getKey();
			var value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
}
