package chapter17.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		//ArrayList<ArrayList<Integer>> board = new ArrayList<>();
		int[][] board = new int[5][5];
		
		Random random = new Random();
		while (set.size() < 25) {
			set.add(random.nextInt(50) + 1);
		}
		
		Iterator<Integer> iter = set.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = iter.next();
				System.out.printf("%2d ", board[i][j]);
			}
			System.out.println();
		}
	}
}
