package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {


      Scanner sc = new Scanner(System.in);
		
	  userFirstName FirstName = new userFirstName();
      String firstname = sc.nextLine();
      System.out.println(FirstName + ": "+ FirstName.isValidFirstName(firstname));
	  
      userLastName LastName = new userLastName();
      String lastname = sc.nextLine();
      System.out.println(lastname + ": "+ LastName.isValidLastName(lastname));
	  
	  userEmail Email = new userEmail();
      String email = sc.nextLine();
      System.out.println(email + ": " + Email.isValidEmail(email));
	  
	  userMobileNumber MobileNumber = new userMobileNumber();
      String mobilenumber = sc.nextLine();
      System.out.println(mobilenumber + ": "+ MobileNumber.isValidMobileNumber(mobilenumber));
	  
	  passwordUC4 password = new passwordUC4();
      String Password = sc.nextLine();
      System.out.println(Password + ": "+ password.isValidFirstName(Password));
	  
    }
}