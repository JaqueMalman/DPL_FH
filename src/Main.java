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

public  class  Main  extends JFrame {
	

	private static final int WIDTH = 800;

	
	private static final int HEIGHT = 600;

	

	protected JPanel toolPanel = new JPanel();

	
	protected Canvas canvas = new Canvas();

	
	private Container contentPane;

	
	
	
	// *** Initialization of atomic elements
	 private void  initAtoms__wrappee__Base  () {
		
	}

	
	
	 private void  initAtoms__wrappee__Linha  () {
		initAtoms__wrappee__Base();
		lineButton = new JButton(lineText);		
	}

	
	
	 private void  initAtoms__wrappee__Retangulo  () {
		initAtoms__wrappee__Linha();
		rectButton = new JButton(rectText);
	
	}

	

	public void initAtoms() {	
		initAtoms__wrappee__Retangulo();
		wipeButton = new JButton(wipeText);	
	}

	

	// Layout components declaration

	/** Initializes layout . No need to change */
	public void initLayout() {
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		toolPanel.setLayout(new BoxLayout(toolPanel, BoxLayout.Y_AXIS));
	}

	

	/** Initializes the content pane */
	 private void  initContentPane__wrappee__Base  () {
		
		contentPane.add(toolPanel, BorderLayout.WEST);
		contentPane.add(canvas, BorderLayout.CENTER);
	}

	
	
	 private void  initContentPane__wrappee__Linha  () {		
		initContentPane__wrappee__Base();
		toolPanel.add(lineButton);
		
	}

	

	 private void  initContentPane__wrappee__Retangulo  () {
		initContentPane__wrappee__Linha();
		toolPanel.add(rectButton);
	}

	

	
	public void initContentPane() {
		initContentPane__wrappee__Retangulo();
		toolPanel.add(wipeButton);	
	}

	

	 private void  initListeners__wrappee__Base  () {
	
	}

	

	 private void  initListeners__wrappee__Linha  () {
		initListeners__wrappee__Base();
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.LINE);
			}
		});
	}

	

	 private void  initListeners__wrappee__Retangulo  () {
		initListeners__wrappee__Linha();
		rectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.RECT);
			}
		});
	}

	

	public void initListeners() {
		initListeners__wrappee__Retangulo();		
		wipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.wipe();
			}
		});
	}

	

	// Initializes entire containment hierarchy
	public void init() {
		initAtoms();
		initLayout();
		initContentPane();
		initListeners();
	}

	

	/* Constructor. No need to modify */
	public Main(String appTitle) {
		super(appTitle);
		init();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		setSize(WIDTH, HEIGHT);
		setResizable(true);
		validate();
	}

	

	/** main method */
	public static void main(String[] args) {
		new Main("Draw Product Line");
	}

	

	private JButton lineButton;

	
	private static final String lineText = "    Linha    ";

	

	private JButton rectButton;

	
	private static final String rectText = "Retângulo";

	

	private JButton wipeButton;

		
	private static final String wipeText = "   Limpar   ";


}
