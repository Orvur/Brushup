
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Login extends JFrame {
   MainWindow test;
   private String name = "";
   private String pass = "";
   //Fields
   JButton loginbtn = new JButton("Login");
   JPanel panel = new JPanel();
   JTextField brugernavn = new JTextField(15);
   JPasswordField brugerpass = new JPasswordField(15);
   JLabel brugerlabel = new JLabel("Brugernavn:");
   JLabel kodelabel = new JLabel("Kodeord:");
   JLabel hint = new JLabel("Hint: admin, admin - formand, formand - kasser, kasser - træner, træner");
   //Constructor
   Login(){
      super("Login Autentification");
      setSize(300,200);
      setLocation(500,280);
      panel.setLayout(new FlowLayout()); 
      //Panels
      panel.add(brugerlabel);
      panel.add(brugernavn);
      panel.add(kodelabel);
      panel.add(brugerpass);
      panel.add(loginbtn);
      //panel.add(hint);
      hint.setVisible(false);
      getContentPane().add(panel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
      actionlogin();
   }
   //Login method
   public void actionlogin(){
      loginbtn.addActionListener(
            new ActionListener() {
               public void actionPerformed(ActionEvent ae) {
                  String brugernavntxt = brugernavn.getText();
                  char[] passInput = brugerpass.getPassword();
                  //Ser om brugernavn og kodeord passer. Kodeord checkes i en metode. Om de passer åbnes tilhørende klasse
                  if(brugernavntxt.equals("formand") && isPasswordCorrectFormand(passInput)) {
                     name = brugernavntxt;
                     String pass = new String(brugerpass.getPassword());
                     getStarted();
                     dispose();
                  } 
                  else if(brugernavntxt.equals("kasser") && isPasswordCorrectKasser(passInput)) {
                     name = brugernavntxt;
                     String pass = new String(brugerpass.getPassword());
                     getStarted();
                     dispose();
                  }
                  else if(brugernavntxt.equals("træner") && isPasswordCorrectTræner(passInput)) {
                     name = brugernavntxt;
                     String pass = new String(brugerpass.getPassword());
                     getStarted();
                     dispose();
                  }
                  else if(brugernavntxt.equals("admin") && isPasswordCorrectAdmin(passInput)) {
                     name = brugernavntxt;
                     String pass = new String(brugerpass.getPassword());
                     getStarted();
                     dispose();
                  }
                  //Forkerte oplysninger popup, JTextFields nulstilles og focus flyttes 
                  else {
                     JOptionPane.showMessageDialog(null,"Forkert kodeord / brugernavn");
                     brugernavn.setText("");
                     brugerpass.setText("");
                     brugernavn.requestFocus();
                     panel.add(hint);
                     hint.setVisible(true); 
                     pack();               
                  }              
               }
            });
   }
   //Kodeord metoder der har kodeord som et Array
   private static boolean isPasswordCorrectFormand(char[] passInput) {
      boolean isCorrect = true;
      char[] correctPassword = { 'f', 'o', 'r', 'm', 'a', 'n', 'd' };
      //Sammenligner input længde mod kodeord længde
      if (passInput.length != correctPassword.length) {
         isCorrect = false;
      } 
      //Checker om input matcher Array
      else {
         isCorrect = Arrays.equals (passInput, correctPassword);
      }
      Arrays.fill(correctPassword,'0');
      return isCorrect;
   }
   private static boolean isPasswordCorrectKasser(char[] passInput) {
      boolean isCorrect = true;
      char[] correctPassword = { 'k', 'a', 's', 's', 'e', 'r'};
      if (passInput.length != correctPassword.length) {
         isCorrect = false;
      } 
      else {
         isCorrect = Arrays.equals (passInput, correctPassword);
      }
      Arrays.fill(correctPassword,'0');
      return isCorrect;
   }
   private static boolean isPasswordCorrectTræner(char[] passInput) {
      boolean isCorrect = true;
      char[] correctPassword = { 't', 'r', 'æ', 'n', 'e', 'r'};
      if (passInput.length != correctPassword.length) {
         isCorrect = false;
      } 
      else {
         isCorrect = Arrays.equals (passInput, correctPassword);
      }
      Arrays.fill(correctPassword,'0');
      return isCorrect;
   }
   private static boolean isPasswordCorrectAdmin(char[] passInput) {
      boolean isCorrect = true;
      char[] correctPassword = { 'a', 'd', 'm', 'i', 'n' };
      if (passInput.length != correctPassword.length) {
         isCorrect = false;
      } 
      else {
         isCorrect = Arrays.equals (passInput, correctPassword);
      }
      Arrays.fill(correctPassword,'0');
      return isCorrect;
   }
   public String getStarted()
   {
      try{
         test = new MainWindow(name);
      }
      catch(Exception ea)
      {}
      return name;
   }
}