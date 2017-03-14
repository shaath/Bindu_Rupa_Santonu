package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> s=new ArrayList<Object>();
		
		//Writing the data into arraylist
		s.add("Selenium");
		s.add(40000);
		s.add("UFT");
		s.add("Manual");
		s.add('M');
		s.add(2, 50000);
		
		//Finding the length of the arraylist
		System.out.println(s.size());
		
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
			
		}
		

	}

}
