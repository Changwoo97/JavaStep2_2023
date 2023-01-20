package chapter17.hashset;

import java.util.ArrayList;
import java.util.HashSet;

import chapter17.Member;
import chapter17.Member2;

public class MemberHashSet {
	private HashSet<Member2> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<>();
	}

	public void addMember(Member2 member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) {
		for (var iter = hashSet.iterator(); iter.hasNext();) {
			var member = iter.next();

			if (member.getMemberId() == memberId) {
				return hashSet.remove(member);
			}
		}

		return false;
	}

	public void showAllMembers() {
		for (var member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
