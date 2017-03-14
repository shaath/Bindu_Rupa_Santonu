package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ClalanderOps {

	public static void main(String[] args) 
	{
		String date="18/november/2018";
		String[] split=date.split("/");
		String day=split[0];
		String month=split[1];
		String year=split[2];
		System.out.println(day+"-----"+month+"----"+year);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		Sleeper.sleepTightInSeconds(5);
		//year selection
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!year.equals(calyear)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//month selection
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//Day Selection
		
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		
		for (int i = 0; i < cols.size(); i++) 
		{
			String calday=cols.get(i).getText();
			System.out.println(calday);
			if (day.equals(calday))
			{
				cols.get(i).click();
				break;
			}
		}
		
	}

}
