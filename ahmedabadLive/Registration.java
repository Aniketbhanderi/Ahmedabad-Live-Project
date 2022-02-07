package ahmedabadLive;

import java.util.Scanner;

public class Registration {

	public boolean register() {
	
		
	
		
		System.out.println("----------------------Registration Page----------------------"); 
		Scanner sc = new Scanner(System.in); 
		
		boolean isvalidate=false; 
		
		System.out.println("Enter your user name:"); 
		String userName= sc.next(); 
		 isvalidate = validateString(userName);
		
		if(isvalidate) 
		{ 
			Context.setUserName(userName);
		}
		else 
		{ 
			System.out.println("Register again!!!"); 
			return false; 
		} 
		
		System.out.println("Enter yout password"); 
		String password=sc.next(); 
		isvalidate = validateString(password); 
		if(isvalidate) 
		{ 
			Context.setPassword(password);
		}
		
		else 
		{ 
				System.out.println("Register again!!!"); 
				return false; 
		} 
		
		System.out.println("Enter yout first name");
		String firstName=sc.next(); 
		isvalidate = validateString(firstName); 
		if(isvalidate) 
		{ 
			Context.setFirstName(firstName);
		
		}
		else 
		{ 
			System.out.println("Register again!!!"); 
			return false; 
		} 
		
		System.out.println("Enter yout last name");
		String lastName=sc.next(); 
		isvalidate = validateString(lastName); 
		if(isvalidate) 
		{ 
			Context.setLastName(lastName);; 
		}
		else 
		{ 
			System.out.println("register again!!!"); 
			return false; 
		} 
		
		System.out.println("Enter yout email addres");
		String email=sc.next(); 
		isvalidate = validateString(email); 
		if(isvalidate) { 
			Context.setEmail(email);; 
		}
		else 
		{ 
			System.out.println("Register again!!!"); 
			return false; 
		}
		
		System.out.println("Enter yout mobile number");  
		long mobileNo=sc.nextLong(); 
		
		isvalidate = validateNumeric(mobileNo); 
		if(isvalidate) 
		{ 
	      Context.setMobileNo(mobileNo);; 
	    }
		else { 
		System.out.println("Register again!!!"); 
		return false; 
		} 
		System.out.println("Enter yout birth year"); int birthYear=sc.nextInt(); 
		isvalidate = validateyear(birthYear); 
		if(isvalidate) { 
	    Context.setBirthYear(birthYear);
	    }else 
	    { 
	    	System.out.println("Register again!!!"); 
	    	return false; 
		} 
			System.out.println("You are registered!!!!!"); 
			return true;
		 
		} 
		
	public boolean validateNumeric(Long number) 
	{ 
		if(number !=0 && number > 0) 
			{ 
				return true; 
			}
			return false; 
	} 
	
	public boolean validateString(String value) 
	{ 
		if(value!=null && !"".equals(value)) 
		{ return true; 
		} 
		return false; 
	} 
	
	public boolean validateyear(int year) 
	{ 
		if(year !=0 && year > 1700 && year < 2021) 
		{ 
			return true; 
		}
		return false; 
	} 

		
	


	public void bulkregistration() {
		Scanner s = new Scanner(System.in);
		 System.out.println("------------Bulk User Registration------------");
		 System.out.println("\nEnter no of users: ");
		 try {
			 int totalUsers = s.nextInt();
			 for (int i = 0; i < totalUsers; i++) 
			 {
				 System.out.println("Enter [" + (i + 1) + "] user details: ");
				 if (new Registration().register()) {
					 System.out.println("User Registered...");
				 	}
			 }
		 } 
		 catch (Exception e) 
		 {
			 System.out.println("Error: "+e); register();
		 }
			
		
	}		
}
	

