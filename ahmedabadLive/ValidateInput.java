package ahmedabadLive;

public class ValidateInput {

	
	public static boolean validateNumber(long number)
	{
		if(number!=0 && number>700000000)
		{
			return true;
		}
	return false;	
	}
	
	
	public static boolean validateString(String value)
	{
		if(value!=null && !"".equals(value.trim()))
		{
			return true;
		}
		
		return false;
	}

}
