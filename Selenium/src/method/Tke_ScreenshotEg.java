package method;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tke_ScreenshotEg {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		
		BasicMethods bm=new BasicMethods();
		
		bm.Screenshot_Taking(driver, "Seleniumhq");

	}

}
