package chapter09;

public class ParentExam {
	private long money = 2_000_000_000L; // 부모님의 재산
	private String str = "종로3가 코아빌딩";
	
	public long getMoney() {
		return money;
	}
	
	public void setMoney(long money) {
		this.money = money; // 부모님의 재산
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str; // 부모님의 부동산
	}
}
