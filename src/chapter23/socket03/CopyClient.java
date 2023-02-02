package chapter23.socket03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;
	
	public CopyClient(Socket s, ChatServer server) {
		// 생성자를 통해서 원본 Client의 
		// Socket정보와 Server의 정보를 받는다.
		
		this.s = s;
		this.server = server;
		
		try {
			out = new PrintWriter(s.getOutputStream(), true);
			in = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
			
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				// 나가기
				if (msg.equals("~X")) {
					out.print("~X");
					server.removeClient(this);
					break;
				}
				//채팅중
				server.sendMessage(ip + " : " + msg);
			} catch (Exception e) {
				
			}
		}
	}
}
