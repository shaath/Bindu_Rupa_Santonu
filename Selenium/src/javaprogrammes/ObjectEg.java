package javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={"Selenium",30000,4444.44,'M',true};
		
		System.out.println(x.length);
		
		for (Object object : x)
		{
			System.out.println(object);
		}

	}

}
