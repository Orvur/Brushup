import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Add extends JPanel 
{
   ControllerAdd ca = new ControllerAdd();
   private ActionListener handling;
   
   public Add() 
   {    
      //Den nye frame der laves og tildeles opførsel
      final JFrame medlemFrame = new JFrame("Add new speaker");
      medlemFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
      medlemFrame.setSize(300, 400);
      medlemFrame.setLocationRelativeTo(null);
      
      //Panel, labels samt fields laves her
      JPanel medlemPanel = new JPanel();
      medlemPanel.setLayout(new GridLayout (12,2));
      JLabel cprLabel = new JLabel("Cpr nr:");
      JLabel fNameLabel = new JLabel("First name:");
      JLabel lNameLabel = new JLabel("Last name:");
      JLabel addrLabel = new JLabel("Address:");
      JLabel tlfLabel = new JLabel("Telefon nr:");
      JLabel emailLabel = new JLabel("Email:");
      JLabel lifeLabel = new JLabel("Life exp: 1-5");
      JLabel sportsLabel = new JLabel("Sports exp: 1-5");
      JLabel politicsLabel = new JLabel("Politics exp: 1-5");
      JLabel travelLabel = new JLabel("Travel exp: 1-5");
      final JTextField cprField = new JTextField(10);
      final JTextField fNameField = new JTextField(20);
      final JTextField lNameField = new JTextField(20);
      final JTextField addrField = new JTextField(20);
      final JTextField tlfField = new JTextField(12);
      final JTextField emailField = new JTextField(20);
      final JTextField lifeField = new JTextField(2);
      final JTextField sportsField = new JTextField(10);
      final JTextField politicsField = new JTextField(15);
      final JTextField travelField = new JTextField(15);
      final JButton save = new JButton("Save");
      
      //Tilføjer de forskellige objekter til medlemPanelet
      medlemPanel.add(cprLabel);
      medlemPanel.add(cprField);
      medlemPanel.add(fNameLabel);
      medlemPanel.add(fNameField);
      medlemPanel.add(lNameLabel);
      medlemPanel.add(lNameField);
      medlemPanel.add(addrLabel);
      medlemPanel.add(addrField);
      medlemPanel.add(tlfLabel);
      medlemPanel.add(tlfField);
      medlemPanel.add(emailLabel);
      medlemPanel.add(emailField);
      medlemPanel.add(lifeLabel);
      medlemPanel.add(lifeField);
      medlemPanel.add(sportsLabel);
      medlemPanel.add(sportsField);
      medlemPanel.add(politicsLabel);
      medlemPanel.add(politicsField);
      medlemPanel.add(travelLabel);
      medlemPanel.add(travelField);
      medlemPanel.add(save);
        
      //Frame tilføjelser
      medlemFrame.add(medlemPanel);
      medlemFrame.setVisible(true);
      medlemFrame.pack();
      
      //ActionListener
      handling = 
         new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               if (event.getSource() == save)
               {
                  try
                  {
                     ca.tilføjMedlem(cprField.getText(),fNameField.getText(),lNameField.getText(), addrField.getText(),tlfField.getText(), emailField.getText(), lifeField.getText(), sportsField.getText(),politicsField.getText(), travelField.getText());
                     JOptionPane.showMessageDialog(null, "Speaker has been added");
                  }
                  catch(Exception e)
                  {
                  }
                  medlemFrame.dispose();
               }
               
            }
         };
         
      save.addActionListener(handling);
   }
}