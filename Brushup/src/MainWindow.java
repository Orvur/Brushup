

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener
{
	String username;
	JFrame frame = new JFrame("Topics main window");
	JPanel panel = new JPanel();
	JButton logout = new JButton("Logout");
	JButton overview = new JButton("Overview");
	JButton personaloverview = new JButton("Personal overview");
	JButton booking = new JButton("Booking");
	JButton add = new JButton("Add speaker");
	
	public MainWindow(String n) throws Exception {
		username = n;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(900, 650);
	    frame.setLayout(new BorderLayout());
	    frame.setLocationRelativeTo(null);
	    
	    panel.setLayout(new GridLayout(1,6));
	    frame.add(panel, BorderLayout.NORTH);
	    
	    if(username.equals("admin"))
        {
	    	panel.add(booking);
	    	panel.add(overview);
	    	panel.add(add);
	    	panel.add(logout);	
        }
	    else  {
	    	panel.add(personaloverview);
	    	panel.add(logout);
	    }
	    
	    frame.setVisible(true);
	    panel.setVisible(true);
	    
	    booking.addActionListener(this);
	    overview.addActionListener(this);
	    add.addActionListener(this);
	    logout.addActionListener(this);
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == overview)
	      {
	         try {
				new Overview();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	      }
		if (e.getSource() == add)
	      {
	        new Add(); 
	      }
		if (e.getSource() == booking)
	      {
	         
	      }
		if (e.getSource() == personaloverview)
	      {
	         
	      }
		if (e.getSource() == logout)
	      {
	         frame.dispose();
	         new Login(); 
	      }
}
}

