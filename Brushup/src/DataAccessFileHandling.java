import java.util.*;
import java.io.*;
import java.io.FileWriter;

public class DataAccessFileHandling
{
   //Fields
   private Scanner scan;
   private ArrayList<Person> list; 
   private PrintWriter file;
   
   public void skrivTilFil(ArrayList<Person> list) throws Exception
   {
      try
      {  //Overskriver ikke medlem.txt da vi har true til append stående.
         FileWriter fw = new FileWriter(new File("src/files/medlem.txt"),true);
         BufferedWriter bw = new BufferedWriter(fw);
         file = new PrintWriter(bw);
         
         //Kalder på MedlemmerData for at få medlem at gemme
         for(Person m : list){
            file.print(m.getCpr()+ ",");
            file.print(m.getFirstName()+ ",");
            file.print(m.getLastName()+ ",");
            file.print(m.getAddr()+ ",");
            file.print(m.getTlf()+ ",");
            file.print(m.getEmail()+ ",");
            file.print(m.getLife()+ ",");
            file.print(m.getSports()+ ",");
            file.print(m.getPolitics()+ ",");
            file.println(m.getTravel());
            file.flush();
            file.close();
         }
      }
      catch(IOException e)
      {
            
      }   
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
