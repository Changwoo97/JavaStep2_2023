package chapter11;

public class HttpServletMain {
	public static void main(String[] args) {
		method(new LoginService());
		method(new FileDownloadService());
	}
	
	public static void method(HttpServlet http) {
		http.service();
	}
}
