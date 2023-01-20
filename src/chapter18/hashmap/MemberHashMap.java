package chapter18.hashmap;

import java.util.HashMap;

import chapter17.Member2;

public class MemberHashMap {
	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member2 member) {
		hashMap.put(member.getMemberId(), member.getMemberName());
	}
	
	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		return false;
	}

	public void showAllMembers() {
		var keySet = hashMap.keySet();
		for (var key : keySet) {
			System.out.println(hashMap.get(key));
		}
		System.out.println();
	}
}
