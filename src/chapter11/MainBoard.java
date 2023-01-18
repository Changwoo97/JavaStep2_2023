package chapter11;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		System.out.println();
		
		player.upgrade(new AdvancedLevel());
		player.play(2);
		System.out.println();
		
		player.upgrade(new SuperLevel());
		player.play(3);
		System.out.println();
	}
}
