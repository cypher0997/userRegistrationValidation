package userRegistration;
import java.util.regex.*;
import java.util.Scanner;

class userLastName {
  
    public boolean isValidLastName(String LastName) {
          
        String regex = "^[A-Za-z0-9+_-]+[.]@[A-Z a-z]+[.]$";

        Pattern p = Pattern.compile(regex);
  
        if (LastName == null) {
            return false;
        }
   
        Matcher m = p.matcher(LastName);

        return m.matches();
    }
  
}