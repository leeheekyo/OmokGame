package game;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BoardButton extends JButton {

	int x, y;
	
	final int width = 0;	// FIX THIS
	final int height = 0;	// FIX THIS
	
	boolean isOccupied;
	boolean isClickable;
	Color color;
	
	public BoardButton(int x, int y) {
		this(x, y, null);
	}
	
	public BoardButton(int x, int y, Color color) {
		isOccupied = false;
		isClickable = true;
		
		this.x = x;
		this.y = y;
		this.color = color;
	}
	

}
