package chapter17.arraylist;

public class UserInfo {
	private String id;
	private int pw;
	
	public UserInfo(String id, int pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	
//	public void setId(String id) {
//		this.id = id;
//	}
	
	public int getPw() {
		return pw;
	}
	
	public void setPw(int pw) {
		this.pw = pw;
	}
}
