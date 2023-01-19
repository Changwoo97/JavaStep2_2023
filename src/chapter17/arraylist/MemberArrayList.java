package chapter17.arraylist;

import java.util.ArrayList;

import chapter17.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) {
		for (var iter = arrayList.iterator(); iter.hasNext();) {
			var member = iter.next();

			if (member.getMemberId() == memberId) {
				return arrayList.remove(member);
			}
		}

		return false;
	}

	public void showAllMembers() {
		for (var member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
