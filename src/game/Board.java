package game;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Board extends JFrame{
	final int DIMENSION = 20, BUTTON_SIZE = 25;
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
	public static void showBoard(){
		//Create and set up the window.
        Board frame = new Board("OMOK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComp(frame.getContentPane());
        System.out.println(frame.getHeight());
        //Display the window.
        frame.pack();
        frame.setVisible(true);

        System.out.println(frame.getHeight());
        System.out.println(frame.getWidth());
	} 
	/*
	@Override
   	public void paint(Graphics g) {
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("board.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        g.drawImage(myPicture, 0, 0, null);
    }*/
	/*
	public static void main(String [] args){
		showBoard();
	}*/
}
