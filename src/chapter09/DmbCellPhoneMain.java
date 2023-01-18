package chapter09;

public class DmbCellPhoneMain {
	public static void main(String[] args) {
		var dmbCellPhone = new DmbCellPhone("Java", "검정", 10);
		
		// CellPhone으로부터 상속받은 필드
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		// DmbCellPhone의 필드
		System.out.println(dmbCellPhone.channel);
		System.out.println();
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.recvVoice("여보세요!");
		dmbCellPhone.sendVoice("안녕하세요");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.ChangeChannelDmb(2);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
	}
}
