package chapter23.socket03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread {
	ServerSocket ss;
	ArrayList<CopyClient> list;
	
	public ChatServer() {
		try {
			list = new ArrayList<>();// 리스트 생성
			ss = new ServerSocket(3200);

			// ServerSocket이 생성되었다는 이유만으로
			// 서버의 기능이 완료된 것이다.
			System.out.println("서버 시작!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChatServer().start();
	}

	// 클라이언트가 언제 접속할지 모르므로 상시 대기하고 들어오면 Thread
	@Override
	public void run() {
		while(true) {
			try {
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip);
				
				// 접속자와 서버 정보를 CopyClient에세 전달
				CopyClient cc = new CopyClient(s, this);
			} catch (Exception e) {
				
			}
		}
	}
	
	public void sendMessage(String msg){
		// 접속자들은 CopyClient로 만들어져서 ArrayList에
		// 모두 저장된 상태다.
		try {
			for(CopyClient cc : list){
				cc.out.println(msg);//서버의 접속자들에게 메세지 전달!
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void removeClient(CopyClient cc){
		list.remove(cc);// 인자로 전달된 CopyClient객체를
				// ArrayList에서 삭제!!
		sendMessage("☆★☆★"+cc.ip+"님 퇴장!☆★☆★");
		//위는 남아있는 구성원들에게 퇴장메세지 전달!
	}
}
