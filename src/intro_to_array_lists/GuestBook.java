package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {
	
	ArrayList<String> names;
	JButton addName;
	JButton viewNames;
	JFrame frame;
	
	public void run() throws Exception {
		names = new ArrayList<String>();
		createNames();
		 frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		 addName = new JButton();
		addName.setText("Add Name");
		addName.addActionListener(this);
		 viewNames = new JButton();
		viewNames.setText("View Names");
		viewNames.addActionListener(this);
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		frame.pack();
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		if(buttonClicked == addName) {
			String newName = JOptionPane.showInputDialog("What is the new name?");
			names.add(newName);
		}
		else if(buttonClicked == viewNames) {
			String displayString = "";
			for(int k = 0; k < names.size(); k++) {
				displayString = displayString + names.get(k);
				displayString = displayString + "\n";
			}
			
			JOptionPane.showMessageDialog(frame, displayString);
			
		}
		// TODO Auto-generated method stub
		
	}
	
	private void createNames() {
		
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		
	}
	

	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
