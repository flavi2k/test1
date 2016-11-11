package pageObject;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.Constants;

public class AbstractPage {
	
	public static WebDriver driver;
	
	public AbstractPage() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractPage(WebDriver driver) {
		AbstractPage.driver = driver;
        initWebElements();
	}
	
	public void initWebElements(){
        PageFactory.initElements(driver, this);
    }
				
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
