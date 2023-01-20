package chapter17.linkedlist;

import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {
	private LinkedList<Member> linkedList;

	public MemberLinkedList() {
		linkedList = new LinkedList<>();
	}

	public boolean addMember(Member member) {
		return linkedList.add(member);
	}

	public Member removeMember(int index) 
			throws IndexOutOfBoundsException {
		return linkedList.remove(index);
	}

	public void showAllMembers() {
		for (Member member : linkedList) {
			System.out.println(member.getMemberId() + ", " + member.getMemberName());
		}

		System.out.println();
	}
}
