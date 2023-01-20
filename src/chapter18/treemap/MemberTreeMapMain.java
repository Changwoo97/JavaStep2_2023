package chapter18.treemap;

import chapter17.treeset.Member3;

public class MemberTreeMapMain {
	public static void main(String[] args) {
		var memberTreeMap = new MemberTreeMap();
		
		// 가방에 넣을 Member 데이터
		var memberLee=new Member3(1003, "이지원");
		var memberSon=new Member3(1005, "손민국");
		var memberPark=new Member3(1004, "박서연");
		var memberHong=new Member3(1002, "홍길동");
		
		// 가방에 넣기
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(new Member3(1001, "이민정"));
		memberTreeMap.addMember(new Member3(1001, "임민정"));
		
		memberTreeMap.showAllMembers();
		
		memberTreeMap.removeMember(1003);
		
		memberTreeMap.showAllMembers();
	}
}
