package userRegistration;
import java.util.regex.*;
import java.util.Scanner;

class userLastName {
  
    public boolean isValidLastName(String LastName) {
          
        String regex = "[A-Z]{1}[a-z]{2,10}$";

        Pattern p = Pattern.compile(regex);
  
        if (LastName == null) {
            return false;
        }
   
        Matcher m = p.matcher(LastName);

        return m.matches();
    }
  
}
