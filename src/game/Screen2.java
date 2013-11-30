package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Screen2 extends JPanel {

	JLabel labelP1;
	JLabel labelP2;
	JTextField textP1;
	JTextField textP2;
	JButton continueButton;
	
	public Screen2() {
		setBackground(Color.WHITE);
		setBorder(new LineBorder(new Color(0, 0, 0), 5));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setVisible(true);
		
		labelP1 = new JLabel("P1");
		labelP2 = new JLabel("P2");
		textP1 = new JTextField();
		textP2 = new JTextField();
		
		
		this.add(labelP1);
		this.add(labelP2);
		this.add(textP1);
		this.add(textP2);
	}
}
