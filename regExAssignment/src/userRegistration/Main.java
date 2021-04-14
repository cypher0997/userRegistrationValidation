package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {

		  System.out.println("welcome to userRegister");
      Scanner sc = new Scanner(System.in);
	    
	 userMobileNumber MobileNumber = new userMobileNumber();
      String mobilenumber = sc.nextLine();
      System.out.println(mobilenumber + ": "+ MobileNumber.isValidMobileNumber(mobilenumber));
	  
    }
}
