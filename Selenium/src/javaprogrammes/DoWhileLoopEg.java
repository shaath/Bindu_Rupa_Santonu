package javaprogrammes;

public class DoWhileLoopEg {

	public static void main(String[] args) 
	{
		int i=1;
		do
		{
			System.out.println(i);
			if (i==75)
			{
				break;
			}
			i++;
			
		}
		while(i<=100);
		
	}

}
