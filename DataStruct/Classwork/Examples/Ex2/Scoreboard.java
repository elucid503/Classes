package Classwork.Examples.Ex2;
public class Scoreboard {

	private int numEntries = 0;
	private GameEntry[] board;

	public Scoreboard(int capacity) {
		board = new GameEntry[capacity];
	}

	public void add(GameEntry e) {

		int newScore = e.getScore();
		if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
			if (numEntries < board.length)
				numEntries++;
			int j = numEntries - 1;
			while (j > 0 && board[j - 1].getScore() < newScore) {
				board[j] = board[j - 1];
				j--;

			}
			board[j] = e;
		}

	}

	public GameEntry remove(int i) {

		GameEntry tmp = board[i];
		for (int j = i; j < numEntries - 1; j++) {
			board[j] = board[j + 1];
		}
		board[numEntries - 1] = null;
		numEntries--;
		return tmp;

	}

	public void display() {
		for (GameEntry g : board) {
			if (g == null)
				break;
			System.out.println(g.toString());
		}
	}

}
