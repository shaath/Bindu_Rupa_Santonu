package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoFillersEg {

	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("h");
		
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(auto.size());
		
		for (int i = 0; i < auto.size(); i++)
		{
			String city=auto.get(i).getText();
			System.out.println(city);
			if (city.equalsIgnoreCase("hosur")) 
			{
				auto.get(i).click();
				break;
			}
		}

	}

}
