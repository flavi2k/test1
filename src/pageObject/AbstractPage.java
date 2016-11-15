package pageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Constants;

public class AbstractPage {
	
	protected static final Logger logger = Logger.getLogger(AbstractPage.class.getName());
	protected Handler fileHandler = null;
	Formatter formatter = null;
	public static WebDriver driver;
	public static String space = "______________________________________";

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
	
	
	// wait until element is visible
	public static WebElement getWhenVizible(WebDriver driver, By locator, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}
	
	public static void waitForAlert() {
	WebDriverWait wait = new WebDriverWait(driver, 3);
	wait.until(ExpectedConditions.alertIsPresent());
	}

	@Before
	public void setUp() throws SecurityException, IOException  {
		
		fileHandler = new FileHandler("./test.log");
		formatter = new SimpleFormatter();
		fileHandler.setLevel(Level.ALL);
		fileHandler.setFormatter(formatter);
		logger.addHandler(fileHandler);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Kit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		logger.info("Navigate to URL");
		driver.get(Constants.URL);
		logger.info("Maximize browser");
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		logger.info("Close browser");
		driver.close();
		driver.quit();
	}
}
