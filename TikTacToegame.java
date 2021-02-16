public class TikTacToegame {
	public static void printboard() {
		char[] gameboard = new char[10];
		for (int i=0; i<10; i++) {
			gameboard[i]=' ';
			System.out.println(gameboard[i]);
		}
	}
	public static void player() {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter a choice x or o");
		char player = user.next().charAt(0);
		char computer = ' ';
		if(player == 'x' || player == 'X') {
			computer = 'o';
		}
		else if (player == 'O' || player == 'o') {
			computer = 'x';
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Player is " + player + "and Computer is " + computer);
	}
	public static void main(String args[]) {
		System.out.println("Welcome to tictactoe game");
		printboard();
		player();
 	}
}
