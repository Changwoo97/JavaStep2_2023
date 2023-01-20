package chapter17.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member3> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<>(new Member3());
		// Comparator로 정렬시 반드시 생성자 명시함
	}
	
	public void addMember(Member3 member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId){
		
		Iterator<Member3> iter = treeSet.iterator();
		
		while(iter.hasNext()){
			Member3 member = iter.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		for (Member3 member : treeSet) {
			System.out.println(member.getMemberId() + ", " + member.getMemberName());
		}
		System.out.println();
	}
}
