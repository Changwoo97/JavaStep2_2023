package chapter18.hashmap;

import chapter17.Member2;

public class MemberHashMapMain {
	public static void main(String[] args) {
		var memberHashMap = new MemberHashMap();
		
		// 가방에 넣을 Member 데이터
		var memberLee=new Member2(1003, "이지원");
		var memberSon=new Member2(1005, "손민국");
		var memberPark=new Member2(1004, "박서연");
		var memberHong=new Member2(1002, "홍길동");
		
		// 가방에 넣기
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(new Member2(1001, "이민정"));
		memberHashMap.addMember(new Member2(1001, "임민정"));
		
		memberHashMap.showAllMembers();
		
		memberHashMap.removeMember(1003);
		
		memberHashMap.showAllMembers();
	}
}
