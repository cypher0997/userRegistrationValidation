package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {
      	Scanner sc = new Scanner(System.in);
	System.out.println("enter user email");
      	userEmail Email = new userEmail();
      	String email = sc.nextLine();
     	System.out.println(email + ": " + Email.isValidEmail(email));  
    }
}
