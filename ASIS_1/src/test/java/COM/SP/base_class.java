package COM.SP;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base_class {
    WebDriver driver;
	@BeforeClass
	public void chrome() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\html\\ASIS_1\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void close(){
		driver.close();
	}
}
