package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {

		  System.out.println("welcome to userRegister");
      Scanner sc = new Scanner(System.in);
		
	  userFirstName FirstName = new userFirstName();
      String firstname = sc.nextLine();
      System.out.println(FirstName + ": "+ FirstName.isValidFirstName(firstname));
	  
      userLastName LastName = new userLastName();
      String lastname = sc.nextLine();
      System.out.println(lastname + ": "+ LastName.isValidLastName(lastname));
	  
    }
}