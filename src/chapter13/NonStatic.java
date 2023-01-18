package chapter13;

import javax.swing.JOptionPane;

class Out {
	// 필드
	static int a = 1;
	
	public class In {
		public String Infun() {
			return (a + "번째  Non-Static 내부 실습");
		}
	}
}

public class NonStatic {
	public static void main(String[] args) {
		Out obj1 = new Out();
		Out.In obj2 = obj1.new In();
		String str = obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str + "\n" + "Success");
	}
}
