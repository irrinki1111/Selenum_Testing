package COM.SP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sustainability_Program_Profile extends Login {

	@Test
	public void FAT() throws InterruptedException {
		
		//select the company
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"form-group\"]//select[@id=\"Company\"]")).click();
		
		driver.findElement(By.xpath("//option[@value=\"number:3\"]")).click();
		//select the hospital
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"form-group\"]//select[@id=\"Hospital\"]")).click();
		
		driver.findElement(By.xpath("//option[@value=\"number:167\"]")).click();
		
		//select the module
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id=\"anchorSP\"]")).click();
		
		//select the screen
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=\"Master\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"General Masters\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Sustainability Program Profile\"]")).click();
		
		//click on edit
		Thread.sleep(5000);
		WebElement edit = driver.findElement(By.xpath("//td[@role=\"gridcell\"]//a[@class=\"ui-icon ui-icon-pencil\"]"));
		if(edit.isDisplayed())
		{
			edit.click();
			System.out.println("edit button is clicked");
		}
		else {
			System.out.println("edit button is not working");
		}
		
		//click on energy tariff type
		Thread.sleep(5000);
		WebElement select = driver.findElement(By.xpath("//select[@id=\"ddlEnergyTariffType\"]//following-sibling::div[1]"));
		if(select.isDisplayed()) {
			select.click();
			System.out.println("energy tariff is clicked");
		}
		else {
			System.out.println("energy tariff is not clicked");
		}
		
		//pick the c2 value
		WebElement select1 = driver.findElement(By.xpath("//input[@value=\"number:785\"]"));
		
		
		
		
		driver.findElement(By.xpath("//button[@id=\"saveWorkOrderbtn\"]")).click();
		
	}
}
