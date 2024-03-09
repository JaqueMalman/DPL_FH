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

	private JButton lineButton;
	private static final String lineText = "    Linha    ";
	
	public void initAtoms() {
		original();
		lineButton = new JButton(lineText);		
	}
	
	public void initContentPane() {		
		original();
		toolPanel.add(lineButton);
		
	}

	public void initListeners() {
		original();
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.LINE);
			}
		});
	}
}