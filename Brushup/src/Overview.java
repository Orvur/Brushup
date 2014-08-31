import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.swing.table.*;



public class Overview {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTable table = new JTable();
	
	public Overview() throws Exception {
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      frame.setSize(900, 650);
	      frame.setLayout(new BorderLayout());
	      frame.setLocationRelativeTo(null);
	      frame.add(panel, BorderLayout.CENTER);      
	      frame.setVisible(true);
	      
	      String line;
	      String m = "id1";
	      int n = 1;
	      //Textdokument hentes. dtm sættes til at have 0 rows der vokser ved input, imens kolonner er fastsat til 10.
	      FileInputStream fis = new FileInputStream("src/files/medlem.txt");
	      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	      DefaultTableModel dtm = new DefaultTableModel(0,10);  
	      //Textdokument læses linje for linje. Kollone skift sker da læseren læser et komma.
	      if(m.equals("id" + n)) {
	      while ((line = br.readLine()) != null) 
	      {
	         dtm.addRow(line.split(",")); 
	      }
	      }
	      //JTable kolonner, sort funktion, JScrollPane og størrelse
	      dtm.setColumnIdentifiers(new Object[] { "Cpr nr", "First name", "Last name", "Addresse","Tlf nr","Email","Life exp","Sports exp", "Politics exp", "Travel exp" });
	      final JTable table = new JTable(dtm);
	      table.setAutoCreateRowSorter(true);
	      final JScrollPane jsp = new JScrollPane(table);
	      jsp.setPreferredSize(new Dimension(750,330));
	      panel.add(jsp);
	      br.close();
	}

}
