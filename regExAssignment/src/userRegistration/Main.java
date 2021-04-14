package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {

		  System.out.println("welcome to userRegister");
      Scanner sc = new Scanner(System.in);
	
      userEmail Email = new userEmail();
      String email = sc.nextLine();
      System.out.println(email + ": " + Email.isValidEmail(email));
	  
    }
}
