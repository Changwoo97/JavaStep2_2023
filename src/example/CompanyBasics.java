package example;

public class CompanyBasics {
	private String name;
	private String part;
	private String addr;
	private String birthDay;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPart() {
		return part;
	}
	
	public void setPart(String part) {
		this.part = part;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		var sb = new StringBuilder();
		
		sb.append(String.format("이름 : %s\n", name));
		sb.append(String.format(" 부서 : %s\n", part));
		sb.append(String.format(" 주소 : %s\n", addr));
		sb.append(String.format(" 생일 : %s", birthDay));
		
		return sb.toString();
	}
}
