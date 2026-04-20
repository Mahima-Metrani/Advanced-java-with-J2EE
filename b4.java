package helloswing;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class b4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Event Handling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton srilankaBtn = new JButton("Srilanka");
        JButton indiaBtn = new JButton("India");
        JLabel displayLabel = new JLabel("Click a button");

        srilankaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("Srilanka is pressed");
            }
        });

        indiaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLabel.setText("India is pressed");
            }
        });

        frame.add(srilankaBtn);
        frame.add(indiaBtn);
        frame.add(displayLabel);

        frame.setVisible(true);
    }
}

