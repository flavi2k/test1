package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.AbstractPage;

public class Checkbox extends AbstractPage {
		
	protected WebElement mondayCB, sundayCB, mondayLabel, sundayLabel;
	
	
	public void displayMessage() {
		System.out.println("Message is displayed");
	}
	
	public void clickOnMonday()  {
				
		mondayCB = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
		mondayLabel = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-label"));
		
		
		// if button is enabled, click it
		if (mondayCB.isEnabled()) {
			mondayCB.click();
			System.out.println("Checkbox " + mondayLabel.getText() + " is enabled");
		}
		else System.out.println("Checkbox " + mondayLabel.getText() + " is disabled");
	}
	
	public void clickOnSunday() {
		sundayCB = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
		sundayLabel = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-label"));
		
		// if button is enabled, click it
		if (sundayCB.isEnabled()) {
			sundayCB.click();
			System.out.println("Checkbox " + sundayLabel.getText() + " is enabled");
		}
		else System.out.println("Checkbox " + sundayLabel.getText() + " is disabled");
	}
		
	
}
