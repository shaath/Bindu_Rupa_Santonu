package javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] salary={20000,30000,40000,50000,30000,50000};

		//Finding the length of the array
		
		
		System.out.println("The length of the array "+salary.length);
		
		//Read the data from array
//		System.out.println(salary[3]);
		
//		for (int i = 0; i < salary.length; i++)
//		{
//			System.out.println(salary[i]);
//		}
		
		for (int data : salary) 
		{
			System.out.println(data);
			
		}
	}

}
