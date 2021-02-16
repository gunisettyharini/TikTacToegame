public class TikTacToegame {
	public static void main(String[] args) {
		char[] board = createboard();
	}
	private static char[] createboard() {
		char[] board = new char[10];
		for(int i=0; i < board.length ; i++) {
			board[i] = ' ';
		}
		return board;
	}
}
