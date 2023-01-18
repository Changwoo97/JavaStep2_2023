package chapter13;

import javax.swing.JOptionPane;

class Out2 {
	static int a = 1;
	int b;
	
	static class In {
		String Infun() {		
			return a + "번째 static 내부 클래스";
		}
	}
}

public class EmbedMain {
	public static void main(String[] args) {
		// static은 클래스명으로 직접 적근 가능함
		Out2.In obj = new Out2.In();
		
		String str = obj.Infun();
		
		JOptionPane.showMessageDialog(null, str + "\n" + "Success");
	}
}
