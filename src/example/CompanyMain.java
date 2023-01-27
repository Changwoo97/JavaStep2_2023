package example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// Scanner기능을 사용하기 위해 객체 생성
		try (var scan = new Scanner(System.in)) {
			// CompanyService 클래스를 사용하기 위해 객체 생성
			var cs = new CompanyService();
			
			// while문 탈출용도로 사용할 boolean 선언
			boolean run = true;

			// 직원관리 프로그램을 종료전까지 반복동작 시키기 위해 while문 사용
			while (run) {
				System.out.println("1. 등록"); // save()
				System.out.println("2. 검색"); // search()
				System.out.println("3. 종료");
				System.out.print(">>> ");

				try {
					// switch-case문을 사용하기 위해 key값 입력받기
					// InputMismatchException
					int key = Integer.parseInt(scan.nextLine());

					// 원하는 case문을 사용하기 위해 입력받은 key값 넣어주기
					switch (key) {
					case 1:
						System.out.print("등록할 직원의 이름을 입력하세요 : ");
						var name = scan.nextLine();
						
						System.out.print("등록할 직원의 부서를 입력하세요 : ");
						var part = scan.nextLine();
						
						System.out.print("등록할 직원의 주소를 입력하세요 : ");
						var addr = scan.nextLine();
						
						System.out.print("등록할 직원의 생일을 입력하세요 : ");
						var birthDay = scan.nextLine();
						
						cs.save(name, part, addr, birthDay);
						break;
						
					case 2:
						if (cs.isEmpty()) {
							System.out.println("저장되있는 직원 정보가 없습니다.");
							break;
						}
						
						System.out.print("찾으려는 직원의 이름을 입력하세요 : ");
						var search = scan.nextLine();
						
						var data = cs.search(search);
						
						if (data.isEmpty()) {
							System.out.println("찾으려는 직원의 이름을 없습니다.");
							break;
						}
						
						data.stream().forEach(cb -> System.out.println(cb));
						break;
						
					case 3:
						run = false;
						break;
						
					default:
						throw new InputMismatchException();
					}
				} catch (NumberFormatException | InputMismatchException e) {
					System.out.println("잘못 입력하셨습니다.");
				}
				
				System.out.println();
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
