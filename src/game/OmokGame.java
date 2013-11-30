package game;

import javax.swing.JFrame;

import players.Player;

public class OmokGame {
	
	public static void main(String [] args){
		JFrame frame = new JFrame("OMOK");
		Screen1 screen1 = new Screen1(frame);
		screen1.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(screen1);
		frame.pack();
		frame.setBounds(0,0,654,600);
		frame.setVisible(true);
	}
}
