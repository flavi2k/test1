package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.Constants;

public class Test01 {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Kit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constants.URL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("Before");
		
	
		
		//driver.navigate().to(Constants.URL);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void test() {
		
		/*Select sel1 = new Select(driver.findElement(By.id("gwt-debug-cwListBox-dropBox")));
		
		
		sel1.selectByValue("Integration_test1");*/
		
		WebElement mondayCB, sundayCB;
		mondayCB = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
		sundayCB = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
		
		if (mondayCB.isEnabled()) {
			mondayCB.click();
			System.out.println("Checkbox-ul " + mondayCB.getText() + " este enabled");
		}
		else System.out.println("Checkbox-ul " + mondayCB.getText() + " este disabled");
		
		
		if (sundayCB.isEnabled()) {
			sundayCB.click();
			System.out.println("Checkbox-ul " + driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-label")).getText().toString() + " este enabled");
		}
		else System.out.println("Checkbox-ul " + driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-label")).getText().toString() + " este disabled");
		
	}

}
