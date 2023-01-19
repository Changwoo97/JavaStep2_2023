package chapter17;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
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
		try {
			var member = (Member) obj;
			
			if (memberId == member.memberId) {
				return true;
			}
		} catch (Exception e) {
		}
		
		return false;
		
//		if (obj instanceof Member) {
//			Member member = (Member) obj;
//			if (memberId == member.memberId) {
//				return true;
//			}
//		}
//		
//		return false;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
}
