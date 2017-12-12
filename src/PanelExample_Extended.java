import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelExample_Extended {

	public JPanel createContentPane() {

		// We create a bottom JPanel to place everything on.
		JPanel totalGUI = new JPanel();

		// We set the Layout Manager to null so we can manually place
		// the Panels.
		totalGUI.setLayout(null);

		// Now we create a new panel, size it, shape it,color it red.
		// then add it to the bottom JPanel.
		
		JPanel redPanel = new JPanel();
		redPanel.setLayout(null);
		redPanel.setBackground(Color.RED);
		redPanel.setLocation(10, 35);
		redPanel.setSize(100, 100);
		totalGUI.add(redPanel);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setLocation(460, 35);
		bluePanel.setSize(100, 100);
		totalGUI.add(bluePanel);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setLocation(120, 35);
		greenPanel.setSize(330, 100);
		totalGUI.add(greenPanel);
		
		JButton startButton = new JButton("Start");  
		bluePanel.add(startButton);
		
		JButton stopButton = new JButton("Stop");
		stopButton.setBounds(15,40,70,20);
		redPanel.add(stopButton);

		// Finally we return the JPanel.
		totalGUI.setOpaque(true);
		totalGUI.setBackground(Color.YELLOW);
		return totalGUI;
	}
}
