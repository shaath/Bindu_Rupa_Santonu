package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox1 {
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.id("Email")).sendKeys("sharathqedge449");
		driver.findElement(By.id("next")).click();
		
		WebElement check=driver.findElement(By.id("PersistentCookie"));
		
		if (check.isSelected()) 
		{
			check.click();
		}
		
	}
}
