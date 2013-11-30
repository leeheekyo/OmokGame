package game;

import players.Player;

public class OmokGame {
	public static void main(String [] args){
		Player player1 = new Player("name1");
		Player player2 = new Player("name2");
		Game game = new Game(player1, player2);
	}
}
