package COM.SP;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends base_class{

	@Test
	public void login() {
		
		driver.get("http://172.16.0.60:7500/Account/Login?ReturnUrl=%2f");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"LoginName\"]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Welcome@123");
		
		driver.findElement(By.xpath("//button[@id=\"btnlogin\"]")).click();
		
		
	}
}
