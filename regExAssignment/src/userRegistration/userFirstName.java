package userRegistration;
import java.util.regex.*;
import java.util.Scanner;

class userFirstName {
  
    public boolean isValidFirstName(String FirstName) {
          
        String regex = "^[A-Za-z0-9+_-]+[.]@[A-Z a-z]+[.]$";

        Pattern p = Pattern.compile(regex);
  
        if (FirstName == null) {
            return false;
        }
   
        Matcher m = p.matcher(FirstName);

        return m.matches();
    }
  
}