package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
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
		Screen2 sc2 = new Screen2();
	}
}
