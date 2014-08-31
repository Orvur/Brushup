
public class Person
{  //Fields
   private String cpr = "";
   private String fName = "";
   private String lName = "";
   private String addresse = "";
   private String tlf = "";
   private String email = "";
   private String life = "";
   private String sports = "";
   private String politics = "";
   private String travel = "";
        
   public Person(String cpr, String fName, String lName, String addresse, String tlf, String email, String life, String sports, String politics, String travel)
   {  //Constructor gemmer JTextField informationer her
      this.cpr = cpr;
      this.fName = fName;
      this.lName = lName;
      this.addresse = addresse;
      this.tlf = tlf;
      this.email = email;
      this.life = life;
      this.sports = sports;
      this.politics = politics;
      this.travel = travel;
   }
   //Metoder til at returnere informationer til DataAccessHandling
   public String getCpr()
   {
      return cpr;
   }
   public String getFirstName()
   {
      return fName;
   }
   public String getLastName()
   {
      return lName;
   }
   public String getAddr()
   {
      return addresse;
   }
   public String getTlf()
   {
      return tlf;
   }
   public String getEmail()
   {
      return email;
   }
   public String getLife()
   {
      return life;
   }
   public String getSports()
   {
      return sports;
   }
   public String getPolitics()
   {
      return politics;
   }
   public String getTravel()
   {
      return travel;
   }
}