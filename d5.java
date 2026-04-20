package CountryListDemo;



	import javax.swing.JFrame;
	import javax.swing.JTabbedPane;
	import javax.swing.JPanel;
	import java.awt.Color;

	public class d5 {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("CMY Color Tabs");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 400);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);
	        tabbedPane.addTab("Cyan", cyanPanel);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);
	        tabbedPane.addTab("Magenta", magentaPanel);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        frame.add(tabbedPane);
	        frame.setVisible(true);
	    }
	}
