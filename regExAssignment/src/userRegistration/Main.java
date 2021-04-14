package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {

		  System.out.println("welcome to userRegister");
      Scanner sc = new Scanner(System.in);

      userFirstName FirstName = new userFirstName();
      String firstname = sc.nextLine();
      System.out.println(FirstName + ": "+ FirstName.isValidFirstName(firstname));

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