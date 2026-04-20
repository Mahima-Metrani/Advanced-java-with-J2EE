package CountryListDemo;

	import javax.swing.JFrame;
	import javax.swing.JList;
	import javax.swing.JScrollPane;
	import javax.swing.event.ListSelectionEvent;
	import javax.swing.event.ListSelectionListener;
	import java.awt.FlowLayout;
	public class a5 {
	
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country List Selection");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 300);
	        frame.setLayout(new FlowLayout());

	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark", 
	            "France", "Great Britain", "Japan", "Africa", 
	            "Greenland", "Singapore"
	        };

	        JList<String> countryList = new JList<>(countries);

	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    String selectedCountry = countryList.getSelectedValue();
	                    System.out.println("Selected: " + selectedCountry);
	                }
	            }
	        });

	        frame.add(new JScrollPane(countryList));

	        frame.setVisible(true);
	    }
	}

