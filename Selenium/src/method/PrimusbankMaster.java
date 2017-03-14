package method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusbankMaster 
{
	public static WebDriver driver;
	//Launch
	public String primus_Launch(String url)
	{
		String expval="Banker Login";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String actval=driver.findElement(By.xpath(".//*[@id='Table_1101']/tbody/tr[1]/td/div/font")).getText();
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Sending the textbox
	
	public void send_text(WebDriver driver, String Loc, String value, String text )
	{
		if (Loc.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(value)).sendKeys(text);
			
		}
		else if (Loc.equalsIgnoreCase("classname")) 
		{
			driver.findElement(By.className(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("tagname")) 
		{
			driver.findElement(By.tagName(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("linktext"))
		{
			driver.findElement(By.linkText(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("partiallinktext"))
		{
			driver.findElement(By.partialLinkText(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("cssselector"))
		{
			driver.findElement(By.cssSelector(value)).sendKeys(text);
		}
		
	}
	

}
