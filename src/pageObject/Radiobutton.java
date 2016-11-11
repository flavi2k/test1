package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Radiobutton extends AbstractPage{
	
	public Radiobutton(WebDriver driver) {
		super(driver);
	}
	
	public void navigateToRadioButton() {
		driver.findElement(By.xpath("//div[text()='Radio Button']")).click();
	}

}
