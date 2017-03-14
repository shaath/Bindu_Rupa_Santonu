package javaprogrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample
{
	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
                 //to identify serach box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		
                 //to identify product
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/a/h2")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
                //to identify add to cart
		driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
		
		
	}

}
