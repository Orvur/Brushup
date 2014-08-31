import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

public class PersonalOverview {
	

	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea text;
	private Scanner scan;
	   private File f;
	   private ArrayList<Person> list; 
	   private PrintWriter file;
	
	public PersonalOverview() throws Exception {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(900, 650);
	      frame.setLayout(new BorderLayout());
	      frame.setLocationRelativeTo(null);
	      panel.add(text);
	      frame.add(panel, BorderLayout.CENTER);      
	      frame.setVisible(true);
	      text = new JTextArea("list");
	}
	      
	      public ArrayList<Person> readFromFile() throws Exception
	      {   
	         scan = new Scanner(new File("medlem.txt"));
	         list = new ArrayList<Person>();
	         
	         while(scan.hasNext())
	         {
	            list.add(new Person(scan.next(),scan.next(),scan.next(),scan.next(),scan.next(),scan.next(),scan.next(),scan.next(),scan.next(), scan.next()));
	         }     
	         return list;
	      }
	      
	}

