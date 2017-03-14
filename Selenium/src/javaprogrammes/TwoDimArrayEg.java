package javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		int[][] s=new int[2][3];
		
		//Finding the rows in array
		System.out.println(s.length);
		
		//Finding the number of columns
		System.out.println(s[0].length);
		
		//Writing the data into the array
		s[0][1]=40000;
		s[1][2]=60000;
		
		//reading the data from array
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.println(s[i][j]);
			}
		}
	}

}
