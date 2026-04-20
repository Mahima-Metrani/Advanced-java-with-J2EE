package helloswing;



	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;
	import java.awt.Color;
	import java.awt.Font;

	public class a4 {

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Hello Swing");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800, 300);

	        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", SwingConstants.CENTER);
	        
	        label.setFont(new Font("Serif", Font.PLAIN, 32));
	        label.setForeground(Color.BLUE);

	        frame.add(label);
	        frame.setVisible(true);
	    }
	}