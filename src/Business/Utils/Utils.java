/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Transport;

/**
 *
 * @author ninos
 */
public class Utils {

    public boolean notNullOrEmpty(String value) {
        return (value != null && !value.isEmpty());
    }

    public boolean isAlphaNumericFieldValid(String alphaNumericField) {
        String regex = "^[a-zA-Z0-9]+$";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(alphaNumericField);
        return m.matches();
    }

    public boolean isAlphabetFieldValid(String alphaNumericField) {
        String regex = "^[a-zA-Z]+$";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(alphaNumericField);
        return m.matches();
    }
    
    public boolean isWordFieldValid(String sentence) {
      String regex = "^[A-Z][a-z]*\\s+[A-Z][a-z]+$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(sentence);
      return m.matches();
    }   
    
    public boolean isEmaildIdvalid(String sentence) {
      return true;
    }
    
      public boolean isPasswordValid(String sentence) {
      return true;
    }
    
    public boolean isValidName(String name) {
      return true;
    }
     
     public boolean isValidCampaign(String campaign){
         return true;
     }
     
     public void sendEmail(String emailID, String campaignName, String campaignDate, String city){
         
         final String recipient = emailID;
         
         String sender = "taskplannermernproject@gmail.com"; 
         String host = "smtp.gmail.com";
         String userEmail = "taskplannermernproject@gmail.com";
         String pswd = "taskplannermernproject@123";
         Properties prop = System.getProperties();  
         prop.setProperty("mail.smtp.host", host); 
         prop.put("mail.smtp.starttls.required", "true");
         prop.put("mail.smtp.starttls.enable", "true");
         prop.put("mail.smtp.host",host);  
         prop.put("mail.smtp.port", "587");  
         prop.put("mail.smtp.auth", "true"); 
         
         java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
         
         Session session;
         session = Session.getDefaultInstance(prop, null);
         //session.setDebug(sessionDebug);
         try{
            MimeMessage msg = new MimeMessage(session);  
            msg.setFrom(new InternetAddress(sender));  
            msg.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));  
            InternetAddress address;
            address = new InternetAddress(recipient);
            msg.setSubject("Campaign Event Awarness");  
            msg.setText("Kindly visit the campaign awarness event: " + campaignName + 
                    "on " + campaignDate + "in " + city +
                    " to know the importance of Organ Donation in today's world.");  
            Transport transport = session.getTransport("smtp");
            transport.connect(host, userEmail, pswd);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error encountered while sending email!");
            }
    }
}
