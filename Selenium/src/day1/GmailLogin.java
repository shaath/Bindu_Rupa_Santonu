package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args)
	{
		//Lauching the firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launch gmail app
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying the email text box
		WebElement email=driver.findElement(By.id("Email"));
		
		//Sending the text into that email text box
		email.sendKeys("sharathqedge449");
		
//		Sleeper.sleepTightInSeconds(5);
		
		//Delete the text in the email text box
//		email.clear();
		//Clicking on next button
		driver.findElement(By.name("signIn")).click();
//		Sleeper.sleepTightInSeconds(10);
		//Entering text into password text box
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		//Click on signin button
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
		
	}

}
