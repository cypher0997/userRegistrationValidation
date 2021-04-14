package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {
     	Scanner sc = new Scanner(System.in);
	userMobileNumber MobileNumber = new userMobileNumber();
	System.out.println("enter the user mobilenumber");
      	String mobilenumber = sc.nextLine();
      	System.out.println(mobilenumber + ": "+ MobileNumber.isValidMobileNumber(mobilenumber));
	  
    }
}
