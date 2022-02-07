package ahmedabadLive;

public class Context {

	
		private static String userName;
		private static String password; 
		private static String firstName; 
		private static String lastName; 
		private static String email; 
		private static long mobileNo; 
		private static int birthYear;
		public static String getUserName() {
			return userName;
		}
		public static void setUserName(String userName) {
			Context.userName = userName;
		}
		public static String getPassword() {
			return password;
		}
		public static void setPassword(String password) {
			Context.password = password;
		}
		public static String getFirstName() {
			return firstName;
		}
		public static void setFirstName(String firstName) {
			Context.firstName = firstName;
		}
		public static String getLastName() {
			return lastName;
		}
		public static void setLastName(String lastName) {
			Context.lastName = lastName;
		}
		public static String getEmail() {
			return email;
		}
		public static void setEmail(String email) {
			Context.email = email;
		}
		public static long getMobileNo() {
			return mobileNo;
		}
		public static void setMobileNo(long mobileNo) {
			Context.mobileNo = mobileNo;
		}
		public static int getBirthYear() {
			return birthYear;
		}
		public static void setBirthYear(int birthYear) {
			Context.birthYear = birthYear;
		} 
		
		
		
		

	
}	
