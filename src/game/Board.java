package game;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame{
	final int DIMENSION = 20, BUTTON_SIZE = 30;
	public Board(String name){
		super(name);
		setResizable(false);
	}
	public void addComp(Container pane){
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,DIMENSION));
		for(int i = 0; i < DIMENSION; i++){
			for(int k = 0; k < DIMENSION; k++){
				JButton button = new JButton();
				button.setPreferredSize(new Dimension(BUTTON_SIZE,BUTTON_SIZE));
				panel.add(button);
			}
		}
		pane.add(panel, BorderLayout.CENTER);
	}
	public static void showBoard(){
		//Create and set up the window.
        Board frame = new Board("GridLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComp(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
	public static void main(String [] args){
		showBoard();
	}
}
