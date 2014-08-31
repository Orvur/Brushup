import java.util.*;

import javax.swing.*;

public class ControllerAdd
{  //Fields
   private ArrayList<Person> medlem = new ArrayList<Person>();
   private DataAccessFileHandling fh = new DataAccessFileHandling();
   private Scanner scan;
   
   //Informationer der modtages fra NyMedlem
   public void tilføjMedlem(String cprField, String fNameField, String lNameField, String addrField, String tlfField, String emailField, String lifeField, String sportsField, String politicsField, String travelField)throws Exception
   {
      //Ny MedlemmerData oprettes, tilføjes til vores ArrayList og sendes til DataAccessHandling for at gemmes i text dokument
      Person nyMedlem = new Person(cprField,fNameField, lNameField, addrField, tlfField, emailField, lifeField, sportsField, politicsField, travelField);
      medlem.add(nyMedlem);   
      fh.skrivTilFil(medlem); 
   }
   
   public ArrayList<Person> getMembers() throws Exception 
   {
      return fh.readFromFile();
   }
}