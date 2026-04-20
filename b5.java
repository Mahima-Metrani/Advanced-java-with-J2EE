package CountryListDemo;

	import javax.swing.JFrame;
	import javax.swing.JTabbedPane;
	import javax.swing.JPanel;
	import java.awt.Color;

	public class b5 {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Tabbed Pane Color Demo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 400);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);
	        tabbedPane.addTab("RED", redPanel);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);
	        tabbedPane.addTab("BLUE", bluePanel);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);
	        tabbedPane.addTab("GREEN", greenPanel);

	        frame.add(tabbedPane);
	        frame.setVisible(true);
	    }
	}

