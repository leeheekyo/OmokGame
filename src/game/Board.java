package game;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import players.Player;

public class Board extends JFrame{
	public static Game game;
	final int DIMENSION = 20, BUTTON_SIZE = 30;
	JFrame frame;
	public Board(String name, Player p1, Player p2){
		super(name);
		setResizable(false);
		game = new Game(p1, p2, DIMENSION);
	}
	
	public Board(JFrame frame){
		this.frame = frame;
	}
	
	public void addComp(Container pane){
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,DIMENSION));
		for(int i = 0; i < DIMENSION; i++){
			for(int k = 0; k < DIMENSION; k++){
				BoardButton button = new BoardButton(i, k);
				button.addActionListener(new ButtonListener(i, k));
				button.setPreferredSize(new Dimension(BUTTON_SIZE,BUTTON_SIZE));
				button.setOpaque(false);
				panel.add(button);
			}
		}
		
		JPanel scorepanel = new JPanel();
		scorepanel.setLayout(new GridLayout(0,3));
		scorepanel.add(new JLabel("It is Player 1's turn!"));
		scorepanel.add(new JLabel("Player 1's Score: "));
		scorepanel.add(new JLabel("Player 2's Score: "));
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(0,1));
		
		pane.add(buttonpanel, BorderLayout.NORTH);
		pane.add(panel, BorderLayout.CENTER);
		pane.add(scorepanel, BorderLayout.SOUTH);
	}
//	public static void showBoard(){
//		//Create and set up the window.
//        Board frame = new Board("OMOK");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //Set up the content pane.
//        frame.addComp(frame.getContentPane());
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//	}
}
