package userRegistration;

import java.util.*;

public class Main{
    public static void main(String args[]) {
      	Scanner sc = new Scanner(System.in);
	System.out.println("enter user firstname");
      	userFirstName FirstName = new userFirstName();
      	String firstname = sc.nextLine();
      	System.out.println(FirstName + ": "+ FirstName.isValidFirstName(firstname));
    }
}
