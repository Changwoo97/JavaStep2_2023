package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {
	public static void main(String[] args) {
		var memberArrayList = new MemberArrayList();
		
		memberArrayList.addMember(new Member(1001, "김창우"));
		memberArrayList.addMember(new Member(1002, "백유기"));
		memberArrayList.addMember(new Member(1003, "김우태"));
		memberArrayList.addMember(new Member(1004, "정세나"));
		memberArrayList.addMember(new Member(1005, "박수연"));
		memberArrayList.addMember(new Member(1006, "박범준"));
		
		memberArrayList.showAllMembers();
		
	}
}
