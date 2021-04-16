package userRegistration;
import java.util.regex.*;
import java.util.Scanner;

class userFirstName {
  
    public boolean isValidFirstName(String FirstName) {
          
        String regex = "[A-Z]{1}[a-z]{2,10}$";

        Pattern p = Pattern.compile(regex);
  
        if (FirstName == null) {
            return false;
        }
   
        Matcher m = p.matcher(FirstName);

        return m.matches();
    }
  
}
