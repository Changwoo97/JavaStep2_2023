package chapter09;

public class Customer {
	// 멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public double bonusPoint;
	protected double bonusRatio;
	
	// 기본생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this();
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	public int calcPrice(int price) {
		bonusPoint += bonusRatio * price;
		return price;
	}
	
	public String showCustomer() {
		var str = String.format("%s님의 등급은 %s이며 보너스 포인트는 %.2f입니다.", 
				customerName, customerGrade, bonusPoint);
		return str; 
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bounsPoint) {
		this.bonusPoint = bounsPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
