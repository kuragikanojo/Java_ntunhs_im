package hw5;

import java.util.Scanner;

public class hw6_1 {
	public static void main(String[] args) {
		char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		
		Scanner scanner = new Scanner(System.in);
		char currentPlayer = 'X';
		boolean gameEnd = false;
		
		while(!gameEnd) {
			drawBoard(board);
			boolean validInput = false;
			while(!validInput) {
				System.out.println("Player" + currentPlayer + ", enter ur move(row & column:)");
				int row = scanner.nextInt();
				int col = scanner.nextInt();
						
				if(row >= 0 &&row < 3 && col >= 0 &&col < 3 && board[row][col] == ' ') {
					board[row][col] = currentPlayer;
					validInput = true;
				}else {
					System.out.println("This move at (" + row + ","+ col + ") is not valid, try again.");
				}
				gameEnd = checkWinner(board, currentPlayer);
				if(!gameEnd) {
					currentPlayer = (currentPlayer == 'X')?'O':'X';
				}
				
			}
		}
		drawBoard(board);
		System.out.println("Player " + currentPlayer + " wins!");
		
	}
	
	
	public static void drawBoard(char[][] board) {
		System.out.println("Board:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
					if(j <2) System.out.print("|");
			}
			System.out.println();
			if(i < 2) System.out.println("-+-+-");
		}
	}

	public static boolean checkWinner(char[][] board, char currentPlayer) {
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer ) {
				System.out.println("row");
				return true;
				
			}
			if(board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer ) {
				System.out.println("col");
				return true;
			}
		}
		if(board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer ) {
			return true;
		}
		if(board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer ) {
			return true;
		}
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				if(board[i][j] == ' ')
					return false;
		System.out.println("It's a tie!");
		System.exit(0);
		return false;
	}
	
}
