package pageObject;

import org.openqa.selenium.By;

public class Radiobutton extends AbstractPage{
	
	public void navigateToRadioButton() {
		driver.findElement(By.xpath("//div[text()='Radio Button']")).click();
	}

}
