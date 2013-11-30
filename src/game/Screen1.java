package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Screen1 extends JPanel {
	JButton newButton;
	JButton loadButton;
	JButton exitButton;
	
	public Screen1() {
		setBackground(Color.WHITE);
		setBorder(new LineBorder(new Color(0, 0, 0), 5));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setVisible(true);
		
		newButton = new JButton("New");
		loadButton = new JButton("Load");
		exitButton = new JButton("Exit");
		
		newButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createNewGame();
			}
		});
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO once we have the database
			}
		});
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		this.add(newButton);
		this.add(loadButton);
		this.add(exitButton);
	}

	protected void createNewGame() {
		this.setVisible(false);
		JFrame frame = new JFrame("OMOK");
		Screen2 screen2 = new Screen2();
		screen2.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(screen2);
		frame.pack();
		frame.setBounds(0,0,654,600);
		frame.setVisible(true);
	}
}
