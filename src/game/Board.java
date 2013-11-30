package game;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Board extends JPanel{
	final int DIMENSION = 20, BUTTON_SIZE = 25;
	JFrame frame;
	public Board(JFrame frame){
		this.frame = frame;
	}
	public void addComp(Container pane){
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,DIMENSION));
		for(int i = 0; i < DIMENSION; i++){
			for(int k = 0; k < DIMENSION; k++){
				JButton button = new JButton();
				button.setPreferredSize(new Dimension(BUTTON_SIZE,BUTTON_SIZE));
				button.setOpaque(false);
				panel.add(button);
			}
		}
		
		JPanel scorepanel = new JPanel();
		scorepanel.setLayout(new GridLayout(0,3));
		scorepanel.add(new JLabel("It is Player 1's turn!"));
		scorepanel.add(new JLabel("Player 1 Score: "));
		scorepanel.add(new JLabel("Player 2 Score: "));
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(0,1));
		
		pane.add(buttonpanel, BorderLayout.NORTH);
		pane.add(panel, BorderLayout.CENTER);
		pane.add(scorepanel, BorderLayout.SOUTH);
	}
}
