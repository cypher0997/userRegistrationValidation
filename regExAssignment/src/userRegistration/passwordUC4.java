package userRegistration;
import java.util.regex.*;


class passwordUC4  {
  
    public boolean isValidFirstName(String password) {
  
        String regex = "^(?=.*[0-9])"+"(?=.*[@#$%^&+=])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=\\S+$).{8,20}$";

        Pattern p = Pattern.compile(regex);
  
        if (password == null) {
            return false;
        }
   
        Matcher m = p.matcher(password);
  
        return m.matches();
    }
  
}
