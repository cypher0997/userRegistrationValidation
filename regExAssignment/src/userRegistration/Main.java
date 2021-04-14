package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the user password");
	passwordUC4 password = new passwordUC4();
  	String Password = sc.nextLine();
    	System.out.println(Password + ": "+ password.isValidFirstName(Password));
	  
    }
}
