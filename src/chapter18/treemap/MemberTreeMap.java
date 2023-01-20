package chapter18.treemap;

import java.util.TreeMap;

import chapter17.treeset.Member3;

public class MemberTreeMap {
	private TreeMap<Integer, String> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<>();
	}
	
	public void addMember(Member3 member) {
		treeMap.put(member.getMemberId(), member.getMemberName());
	}
	
	public boolean removeMember(int memberId) {
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		return false;
	}

	public void showAllMembers() {
		var keySet = treeMap.keySet();
		for (var key : keySet) {
			System.out.println(treeMap.get(key));
		}
		System.out.println();
	}
}
