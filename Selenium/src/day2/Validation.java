package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation {

	public static void main(String[] args)
	{
		String expval="google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();

		String actval=driver.getTitle();
		System.out.println(actval);
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("PAss");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
