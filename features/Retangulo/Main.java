/**
 * DPL Main.java
 * @author Roberto E. Lopez-Herrejon
 * Main class of Draw Product Line
 * SEP SPL Course July 2010
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Main extends JFrame {

	private JButton rectButton;
	private static final String rectText = "Retângulo";
	
	public void initAtoms() {
		original();
		rectButton = new JButton(rectText);
	
	}

	public void initContentPane() {
		original();
		toolPanel.add(rectButton);
	}

	public void initListeners() {
		original();
		rectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.RECT);
			}
		});
	}
}
