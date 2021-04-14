package userRegistration;
import java.util.regex.*;


class userEmail {
  
    public boolean isValidEmail(String email) {
        
        String regex = "^[A-Za-z0-9+_-]+[.]@[A-Z a-z]+[.]$";

        Pattern p = Pattern.compile(regex);
  
        if (email == null) {
            return false;
        }
   
        Matcher m = p.matcher(email);
  
        return m.matches();
    }
  
}