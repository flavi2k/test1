package pageObject;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Constants;

public class AbstractPage {
	
	protected WebDriver driver;
	public WebElement we;
				
	@Before
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver", "D:\\Kit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constants.URL);
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
}
