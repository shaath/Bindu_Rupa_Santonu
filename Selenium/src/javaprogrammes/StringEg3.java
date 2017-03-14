package javaprogrammes;

public class StringEg3
{
	public static void main(String[] args) 
	{
		String stmt1="You are selected Selenium";
		String stmt2="selenium";
		
		if (stmt1.contains(stmt2))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
