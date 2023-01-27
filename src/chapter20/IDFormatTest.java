package chapter20;

public class IDFormatTest {
	private String userID;
	
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) 
			throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		if (userID.length() < 8 || 20 < userID.length()) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		String userId = "1234567";
		
		try {
			test.setUserID(userId);
		} catch (IDFormatException e) { // 개발자가 만든 Exception
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
