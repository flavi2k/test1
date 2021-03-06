package pageObject;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.AbstractPage;

public class Checkbox extends AbstractPage {

	protected static WebElement mondayCB, sundayCB, mondayLabel, sundayLabel;

	public Checkbox(WebDriver driver) {
		super(driver);
	}

	public static void clickOnMonday()  {
		//mondayCB = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
		//mondayLabel = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-label"));
		
		mondayCB = getWhenVizible(driver,By.id("gwt-debug-cwCheckBox-Monday-input"),5000);
		mondayLabel = getWhenVizible(driver,By.id("gwt-debug-cwCheckBox-Monday-label"),5000);
		

		// if button is enabled, click it
		if (mondayCB.isEnabled()) {
			mondayCB.click();
			Assert.assertTrue(mondayCB.isSelected());
			System.out.println("Checkbox " + mondayLabel.getText() + " is enabled and SELECTED");
			logger.info("Checkbox " + mondayLabel.getText() + " is enabled and SELECTED");
		}
		else { System.out.println("Checkbox " + mondayLabel.getText() + " is disabled");
		logger.info("Checkbox " + mondayLabel.getText() + " is disabled");
		}
	}

	public static void clickOnSunday() {
		sundayCB = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
		sundayLabel = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-label"));

		// if button is enabled, click it
		if (sundayCB.isEnabled()) {
			sundayCB.click();
			System.out.println("Checkbox " + sundayLabel.getText() + " is enabled and SELECTED");
			logger.info("Checkbox " + sundayLabel.getText() + " is enabled and SELECTED");
		}
		else { System.out.println("Checkbox " + sundayLabel.getText() + " is disabled");
		logger.info("Checkbox " + sundayLabel.getText() + " is disabled");
		}
	}

	public static void displayElements() {
		List<WebElement> allCBs = driver.findElements(By.xpath("//div//span //input [contains(@id,'gwt-debug-cwCheckBox')]"));
		List<WebElement> allCBLabels = driver.findElements(By.xpath("//div//span //label [contains(@id,'gwt-debug-cwCheckBox')]"));

		for (int i =0; i<allCBs.size(); i++) {

			if (allCBs.get(i).isEnabled()) {
				System.out.println("Element " + allCBLabels.get(i).getText() + " with index " + i + " is enabled");
				logger.info("Element " + allCBLabels.get(i).getText() + " with index " + i + " is enabled");
			}
			else { System.out.println("Element " + allCBLabels.get(i).getText() + " with index " + i + " is disabled");
			logger.info("Element " + allCBLabels.get(i).getText() + " with index " + i + " is disabled");
			}
		}
	}

	public static  void selectElementWithIndex(int index) {
		List<WebElement> allCBs = driver.findElements(By.xpath("//div//span //input [contains(@id,'gwt-debug-cwCheckBox')]"));
		int numberOfElements = allCBs.size();

		System.out.println("There are " + numberOfElements + " elements on this page");
		logger.info("There are " + numberOfElements + " elements on this page");

		try {
			if (allCBs.get(index).isEnabled()) {
				allCBs.get(index).click();
			}
			else { System.out.println("Unable to select the element. Element with index " + index +" is disabled");
			logger.info("Unable to select the element. Element with index " + index +" is disabled");
			}
		}
		catch(IndexOutOfBoundsException e) { 
			logger.info("You've selected an invalid index. Make sure the selected index is in the 0-" + (numberOfElements - 1) + " interval");
			System.out.println("You've selected an invalid index. Make sure the selected index is in the 0-" + (numberOfElements - 1) + " interval");
		}

	}
}

