package helloswing;


	import javax.swing.JFrame;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class c4 {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Image Button Event Handling");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(500, 300);
	        frame.setLayout(new FlowLayout());

	        ImageIcon clockIcon = new ImageIcon("clock.png");
	        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

	        JButton clockBtn = new JButton("Digital Clock", clockIcon);
	        JButton hourglassBtn = new JButton("Hour Glass", hourglassIcon);
	        JLabel displayLabel = new JLabel("Click an image button");

	        clockBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                displayLabel.setText("Digital Clock is pressed");
	            }
	        });

	        hourglassBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                displayLabel.setText("Hour Glass is pressed");
	            }
	        });

	        frame.add(clockBtn);
	        frame.add(hourglassBtn);
	        frame.add(displayLabel);

	        frame.setVisible(true);
	    }
	}

