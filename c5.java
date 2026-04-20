package CountryListDemo;


	import javax.swing.JFrame;
	import javax.swing.JList;
	import javax.swing.JScrollPane;
	import javax.swing.event.ListSelectionEvent;
	import javax.swing.event.ListSelectionListener;
	import java.awt.FlowLayout;

	public class c5 {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country-Capital Selector");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(350, 300);
	        frame.setLayout(new FlowLayout());

	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark", 
	            "France", "Great Britain", "Japan", "Africa", 
	            "Greenland", "Singapore"
	        };

	        JList<String> countryList = new JList<>(countries);

	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                // Ensure the event only triggers once per selection
	                if (!e.getValueIsAdjusting()) {
	                    String selected = countryList.getSelectedValue();
	                    displayCapital(selected);
	                }
	            }
	        });

	        frame.add(new JScrollPane(countryList));
	        frame.setVisible(true);
	    }

	    private static void displayCapital(String country) {
	        String capital;
	        switch (country) {
	            case "USA": capital = "Washington, D.C."; break;
	            case "India": capital = "New Delhi"; break;
	            case "Vietnam": capital = "Hanoi"; break;
	            case "Canada": capital = "Ottawa"; break;
	            case "Denmark": capital = "Copenhagen"; break;
	            case "France": capital = "Paris"; break;
	            case "Great Britain": capital = "London"; break;
	            case "Japan": capital = "Tokyo"; break;
	            case "Africa": capital = "N/A (Africa is a Continent)"; break;
	            case "Greenland": capital = "Nuuk"; break;
	            case "Singapore": capital = "Singapore"; break;
	            default: capital = "Unknown";
	        }
	        System.out.println("Country: " + country + " | Capital: " + capital);
	    }
	}

