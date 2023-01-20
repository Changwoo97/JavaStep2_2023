package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {
	public static void main(String[] args) {
		var memberLinkedList = new MemberLinkedList();
		
		var memberLee = new Member(1001, "이지원");
		var memberSon = new Member(1002, "손민국");
		var memberPark = new Member(1003, "박시환");
		var memberHong = new Member(1004, "홍길동");
		
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberHong);
		
		memberLinkedList.showAllMembers();
	}
}
