package userRegistration;
import java.util.regex.*;
import java.util.Scanner;

class checkValid_And_InvalidEmails {
  
    public boolean isValidFirstName(String FirstName) {
          
        String regex = "^[a-z0-9]{3,}(.[0-9a-z]+)*@[a-z]{2,}.(com|edu)(co.in)*$";

        Pattern p = Pattern.compile(regex);
  
        if (FirstName == null) {
            return false;
        }
   
        Matcher m = p.matcher(FirstName);

        return m.matches();
    }
  
}