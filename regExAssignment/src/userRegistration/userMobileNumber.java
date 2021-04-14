package userRegistration;
import java.util.regex.*;


class userMobileNumber {
  
    public boolean isValidMobileNumber(String MobileNumber) {

        String regex = "^\\+[0-9]+\\s[0-9]{10,15}$";

        Pattern p = Pattern.compile(regex);
  
        if (MobileNumber == null) {
            return false;
        }
   
        Matcher m = p.matcher(MobileNumber);
          
        return m.matches();
    }
  
}