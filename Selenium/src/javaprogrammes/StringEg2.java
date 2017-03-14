package javaprogrammes;

public class StringEg2 {

	public static void main(String[] args) 
	{
		String Rev="";
		String course="Malayalam";//-->malayalam
		int len=course.length();
		
		for (int i = len-1; i >= 0; i--) 
		{
//			System.out.print(course.charAt(i));
			Rev=Rev+course.charAt(i);
			
		}
		System.out.println(Rev);
		
		if (course.equalsIgnoreCase(Rev)) 
		{
			System.out.println("Given String is a polindrome");
			
		}
		else
		{
			System.out.println("Given String is not a ploindrime");
		}
	}

}
