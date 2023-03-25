package OOPs_4;

import java.util.Scanner;

public class TicTacToe {
	
	private Player p1,p2;
	private Board board;
	private int playerCount;
	public static void main(String[] args) {
		
		TicTacToe game = new TicTacToe();
		game.start();
		
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		//Creating Player
		p1 = takePlayersInput(++playerCount);
		p2 = takePlayersInput(++playerCount);
		while(p1.getSymbol() == p2.getSymbol()) {
			System.out.println("Please Enter the new symbol for player2");
			char p2Symbol = sc.next().charAt(0);
			p2.setSymbol(p2Symbol);
			
		}
		
		//Creating Board
		board = new Board(p1.getSymbol(), p2.getSymbol());
		
		boolean player1Turn = true;
		int status = Board.INCOMPLETE;
		while(status == Board.INCOMPLETE || status == Board.INVALIDMOVE) {
			if(player1Turn) {
				System.out.println("Player 1-" + p1.getName() + "'s Turns");
				System.out.println("Enter the x: ");
				int x = sc.nextInt();
				System.out.println("Enter the y: ");
				int y = sc.nextInt();
				
				status = board.move(p1.getSymbol(), x,y);
				if(status == Board.INVALIDMOVE) {
					System.out.println("Invalid move!! Please try again");
					continue;
				}
			}else {
				System.out.println("Player 2 -" + p2.getName() + "'s Turns");
				System.out.println("Enter the x: ");
				int x = sc.nextInt();
				System.out.println("Enter the y: ");
				int y = sc.nextInt();
				
				status = board.move(p2.getSymbol(), x,y);
				if(status == Board.INVALIDMOVE) {
					System.out.println("Invalid move!! Please try again");
					continue;
				}
			}
			
			player1Turn = !player1Turn;
			board.print();
		}
		
		if(status == Board.PLAYER1WINS) {
			System.out.println("Player 1 - "+ p1.getName()+ "Wins");
		}else if(status == Board.PLAYER2WINS) {
			System.out.println("Player 2 - "+ p2.getName()+ "Wins");
		}else {
			System.out.println("DRAW!!");
		}
		
		
	}
	
	private Player takePlayersInput(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player"+ num+  "name: ");
		String name = sc.nextLine();
		System.out.println("Enter the Player"+ num + "symbol: ");
		char symbol = sc.next().charAt(0);
		
		Player player = new Player(name,symbol);
		return player;
		
		
		
	}
	

}
