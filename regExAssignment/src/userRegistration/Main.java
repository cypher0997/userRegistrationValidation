package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {
      	Scanner sc = new Scanner(System.in);
	System.out.println("enter userlastname");  
      	userLastName LastName = new userLastName();
      	String lastname = sc.nextLine();
      	System.out.println(lastname + ": "+ LastName.isValidLastName(lastname));
	  
    }
}
