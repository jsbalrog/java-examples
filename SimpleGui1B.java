import javax.swing.*;
import java.awt.event.*;

/**
 * class SimpleGui1B
 * @author Ted Jenkins
 */
public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main (String [] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        // Registers interest with the button: 'add me to your list of listeners'.
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
}
