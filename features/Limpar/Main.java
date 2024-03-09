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

	private JButton wipeButton;	
	private static final String wipeText = "   Limpar   ";

	public void initAtoms() {	
		original();
		wipeButton = new JButton(wipeText);	
	}

	
	public void initContentPane() {
		original();
		toolPanel.add(wipeButton);	
	}

	public void initListeners() {
		original();		
		wipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.wipe();
			}
		});
	}

}