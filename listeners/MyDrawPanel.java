import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		GradientPaint gradient = new GradientPaint(70,70,Color.blue, 150,150,Color.orange);
		g2d.setPaint(gradient);
		g.fillOval(70, 70, 100, 100);
	}
}
