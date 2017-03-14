package method;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasicMethods 
{
	public static void main(String[] args)
	{
		function1();
		String res=Function2();
		System.out.println(res);
		
		BasicMethods bm=new BasicMethods();
		
		bm.Function3();
		
		boolean flag=bm.function4();
		System.out.println(flag);
		
		
		int result=bm.sum(40,60);
		System.out.println(result);
				
	}
	
	//static method without returning any value
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//static method with returning value
	
	public static String Function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	//Non static method without returning value
	public void Function3()
	{
		System.out.println("This is function3 code");
	}
	
	//Non static method with returning value
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	
	//Sum 
	
	public int sum(int a, int b)
	{
		
		int c=a+b;
		return c;
	}
	//screenshot
	
	public void Screenshot_Taking(WebDriver driver, String fname) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Evening930PM\\Selenium\\src\\screenshot\\"+fname+".png"));
	}

}
