package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
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
		
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createNewGame();
			}
		});
		
		this.add(labelP1);
		this.add(labelP2);
		this.add(textP1);
		this.add(textP2);
		this.add(nextButton);
	}
	protected void createNewGame() {
		this.setVisible(false);
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
}
