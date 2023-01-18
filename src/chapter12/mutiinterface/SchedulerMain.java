package chapter12.mutiinterface;

import java.util.Scanner;

public class SchedulerMain {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			RoundRobin r = new RoundRobin();
			LeastJob l = new LeastJob();
			Priority p = new Priority();

			WHILE: while (true) {
				System.out.println("R or r : 한명씩 차례로 할당");
				System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
				System.out.println("P or p : 업무 Skill 값이 높은 상담원에게 할당");
				System.out.println("S or s : 종료");
				System.out.print("전화상담 방식을 선택하세요 : ");
				char selection;

				try {
					selection = scan.nextLine().charAt(0);
				} catch (IndexOutOfBoundsException e) {
					System.out.println(e);
					System.out.println();
					continue;
				}

				Scheduler scheduler;

				switch (selection) {
				case 'R': case 'r':
					scheduler = r;
					break;
				case 'L': case 'l':
					scheduler = l;
					break;
				case 'P': case 'p':
					scheduler = p;
					break;
				case 'S': case 's':
					break WHILE;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.println();
					continue;
				}

				scheduler.getNextCall();
				scheduler.sendCallToAgent();
				System.out.println();
			}
			
			System.out.println("업무를 종료합니다.");
		} catch (Exception e) {
			System.out.println();
			System.out.println(e);
			System.out.println("프로그램이 비정상 종료되었습니다.");
		}
	}
}
