package chapter17.treeset;

import java.util.Comparator;

public class Member3 implements Comparator<Member3> {
	private int memberId;
	private String memberName;
	
	public Member3() {
		
	}
	
	public Member3(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member3) {
			Member3 member = (Member3) obj;
			return memberId == member.getMemberId();
		}
		
		return false;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int compare(Member3 member1, Member3 member2) {
		return -(member1.getMemberId() - member2.getMemberId()); 
	}
}
