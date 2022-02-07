package ahmedabadLive;

import java.util.Scanner;

public class Login {
	
	public boolean login() {
		System.out.println("-------Login page-------");
		 Registration obj=new Registration();
		 boolean isValid=false;
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter Email Id: ");
		 String emailId=input.next();
		 obj.validateString(emailId);
		 if(isValid &&  Context.getEmail().equals(emailId))
		 {
		 isValid=true;
		 }
		 else
		 {
		 isValid=false;
		 }
		 System.out.println("Enter Password: ");
		 String password=input.next();
		 isValid = obj.validateString(password);
		 if(isValid && Context.getPassword().equals(password))
		 {
		 isValid=true; }
		 else
		 {
		 isValid=false;
		 }
		 return isValid;
		 }
		
		
		
		
		
		
}

