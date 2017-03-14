package javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		Object[] x=new Object[6];
		
		System.out.println(x.length);
		
		//Writing the data into the array
		
		x[2]="Selenium";
		x[4]=40000;
		x[5]=60000;
		
		//Reading the data from array
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
			
		}
		
	}

}
