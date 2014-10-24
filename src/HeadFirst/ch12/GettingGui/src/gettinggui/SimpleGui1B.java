package gettinggui;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author jenkinset
 */
public class SimpleGui1B implements ActionListener {
	JButton button;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();

    }

	public void go() {
		// Make a frame and a button
        JFrame frame = new JFrame();
		button = new JButton("click me");

		// Register as a listener with the button
		button.addActionListener(this);

		// Make the program quit as soon as the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the button to the frame's content pane
		frame.getContentPane().add(button);

		// Give the frame a size
		frame.setSize(300, 300);

		// Make it visible
		frame.setVisible(true);
	}

	/**
	 * This method is called by the event source
	 * (the JButton in this case).
	 * @param ae
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		button.setText("I've been clicked");
	}

}
