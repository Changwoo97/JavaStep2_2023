package chapter23.socket02;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		System.out.println("메시지 입력 : ");
		Scanner scan = new Scanner(System.in);
		String msg = scan.nextLine();
		
		Socket s = null;
		
		try {
			s = new Socket("172.16.10.12", 3001); // 서버 ip와 포트번호
			
			// 문자열을 서버로 보내기 위해서 스트림 준비
			PrintWriter out = new PrintWriter(s.getOutputStream());
			if (out != null) {
				out.flush();
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

