package method;

import org.openqa.selenium.By;

public class ReuseEg {

	public static void main(String[] args)
	{
//		BasicMethods bm=new BasicMethods();
//		int res=bm.sum(400,600);
//		System.out.println(res);
		
		PrimusbankMaster pm=new PrimusbankMaster();
		
		String res=pm.primus_Launch("http://primusbank.qedgetech.com");
		System.out.println(res);
		
		pm.send_text(pm.driver, "id", "txtuId", "Admin");
		pm.send_text(pm.driver, "xpath", ".//*[@id='txtPword']", "Admin");
		pm.driver.findElement(By.id("login")).click();

	}

}
