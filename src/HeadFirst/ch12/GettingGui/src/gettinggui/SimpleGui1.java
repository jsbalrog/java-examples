package gettinggui;

import javax.swing.*;

/**
 *
 * @author jenkinset
 */
public class SimpleGui1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// Make a frame and a button
        JFrame frame = new JFrame();
		JButton button = new JButton("click me");

		// Make the program quit as soon as the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add the button to the frame's content pane
		frame.getContentPane().add(button);

		// Give the frame a size
		frame.setSize(300, 300);

		// Make it visible
		frame.setVisible(true);

    }

}
