package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{
	int x, y;
	
	public ButtonListener(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int loc = Board.game.getBoard()[x][y];
		if (loc == 0){
			Board.game.changeBoard(x, y);
		}
		
	}

}
