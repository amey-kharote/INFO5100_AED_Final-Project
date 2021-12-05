/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
}
