package ahmedabadLive;

import java.util.Scanner;

public class ApplicationStartup {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);

		do
		{
			 System.out.println("-------Welcome to Brainy Beam Technologies-------"+StringConstantPool.NEWLINES);
			 System.out.println(" 1.Register \n 2.Login \n 3.Bulk Registration \n 4.Exit \nEnter your choice: ");
			 int a =sc.nextInt();
			 switch(a)
			 {
			 case 1:
				 if(new Registration().register())
				 {
				 System.out.println("\nRegistration done successfully!!\n");
				 }
				 break;
			 case 2:
				 while(!(new Login().login()))
				 {
				 System.out.println("\nInvalid Email or Password!!\n");
				 }
				 System.out.println("\nLogin successful!!\n");
				 
				 
				 
				 break; 
			 case 3:
				 new Registration().bulkregistration();
			 
			 case 4:
				 return;
			 	}
			 } while(true);
	}
	
} 
