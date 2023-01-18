package chapter12.mutiinterface;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("한명씩 차례로 할당");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음순서 상대방에게 배분합니다.");
	}
	
}
