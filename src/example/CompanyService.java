package example;

import java.util.LinkedList;

public class CompanyService {
	private LinkedList<CompanyBasics> data;
	
	public CompanyService() {
		data = new LinkedList<>();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public void save(CompanyBasics cb) {
		data.add(cb);
	}
	
	public void save(String name, String part, String addr, String birthDay) {
		var cb = new CompanyBasics();
		
		cb.setName(name);
		cb.setPart(part);
		cb.setAddr(addr);
		cb.setBirthDay(birthDay);
		
		save(cb);
	}
	
	public LinkedList<CompanyBasics> search(String name) {
		var data = new LinkedList<CompanyBasics>();
		
		this.data.stream().filter(cb -> name.equals(cb.getName())).forEach(cb -> data.add(cb));

		return data;
	}
}
