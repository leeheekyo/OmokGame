package game;

import players.Player;

public class Game {
	private Player p1, p2;
	private Player turn;
	private int[][] board;
	
	public Game(Player player1, Player player2, int dimension){
		p1 = player1;
		p2 = player2;
		turn = p1;
		board = new int[dimension][dimension];
		for (int i=0; i<dimension; i++){
			for (int j=0; j<dimension; j++){
				board[i][j] = 0;
			}
		}
	}
	
	public void changeTurn(){
		if (turn == p1){
			turn = p2;
		} else {
			turn = p1;
		}
	}
	
	public void checkWin(BoardButton button){
		int consecutive = 0;
		int x = button.x;
		int y = button.y;
		
		//Horizontal
		int tempX = x;
		for (int left=x; left>=0; left--){
			if (board[tempX][y]==turn.getID()){
				consecutive++;
				tempX--;
			} else {
				break;
			}
		}
		tempX = x;
		for (int right=x; right<board.length; right++){
			if (board[tempX][y]==turn.getID()){
				consecutive++;
				tempX++;
			} else {
				break;
			}
		}
		if (consecutive >= 5){
			endGame();
		}
		//Vertical
		consecutive = 0;
		int tempY = y;
		for (int up=y; up>=0; up--){
			if (board[x][tempY]==turn.getID()){
				consecutive++;
				tempY--;
			} else {
				break;
			}
		}
		tempY = y;
		for (int down=y; down<board.length; down++){
			if (board[x][tempY]==turn.getID()){
				consecutive++;
				tempY++;
			} else {
				break;
			}
		}
		if (consecutive >= 5){
			endGame();
		}
		//Diagonal
		consecutive = 0;
		tempX = x;
		tempY = y;
		for (int left=x; left>=0; left--){
			for (int up=y; up>=0; up--){
				if (board[x][y]==turn.getID()){
					consecutive++;
					tempX--;
					tempY--;
				} else {
					break;
				}
			}
		}
		tempX = x;
		tempY = y;
		for (int right=x; right<board.length; right++){
			for (int down=y; down<board.length; down++){
				if (board[x][y]==turn.getID()){
					consecutive++;
					tempX++;
					tempY++;
				} else {
					break;
				}
			}
		}
		if (consecutive >= 5){
			endGame();
		}
		consecutive = 0;
		tempX = x;
		tempY = y;
		for (int right=x; right<board.length; right++){
			for (int up=y; up>=0; up--){
				if (board[x][y]==turn.getID()){
					consecutive++;
					tempX++;
					tempY--;
				} else {
					break;
				}
			}
		}
		tempX = x;
		tempY = y;
		for (int left=x; left>=0; left--){
			for (int down=y; down<board.length; down++){
				if (board[x][y]==turn.getID()){
					consecutive++;
					tempX--;
					tempY++;
				} else {
					break;
				}
			}
		}
		if (consecutive >= 5){
			endGame();
		}
	}
	
	public void endGame(){
		
	}
}
