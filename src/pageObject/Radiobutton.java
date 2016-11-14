package pageObject;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radiobutton extends AbstractPage{
	

	public Radiobutton(WebDriver driver) {
		super(driver);
	}
	

	public static void navigateToRadioButton() {
		driver.findElement(By.xpath("//div[text()='Radio Button']")).click();
	}

	public static void displayElements() {
		
		List<WebElement> colorRBs = driver.findElements(By.xpath("//div //input [contains(@id,'color')]"));
		List<WebElement> colorLabelRBs = driver.findElements(By.xpath("//div //label [contains(@id,'color')]"));
		List<WebElement> sportRBs = driver.findElements(By.xpath("//div //input [contains(@id,'sport')]"));
		List<WebElement> sportLabelRBs = driver.findElements(By.xpath("//div //label [contains(@id,'sport')]"));

		for (int i=0; i<colorRBs.size(); i++) {
			if(colorRBs.get(i).isEnabled()) {
				System.out.println("Element " + colorLabelRBs.get(i).getText() + " with index " + i + " is enabled");
			}
			else 	
				System.out.println("Element " + colorLabelRBs.get(i).getText() + " with index " + i + " is disabled");
		}
		
		System.out.println(space);

		for (int i=0; i<sportRBs.size(); i++) {
			if(sportRBs.get(i).isEnabled()) {
				System.out.println("Element " + sportLabelRBs.get(i).getText() + " with index " + i + " is enabled");
			}
			else
				System.out.println("Element " + sportLabelRBs.get(i).getText() + " with index " + i + " is disabled");
		}
	}
	
	public static void displaySelectedElements() {
		List<WebElement> colorRBs = driver.findElements(By.xpath("//div //input [contains(@id,'color')]"));
		List<WebElement> colorLabelRBs = driver.findElements(By.xpath("//div //label [contains(@id,'color')]"));
		List<WebElement> sportRBs = driver.findElements(By.xpath("//div //input [contains(@id,'sport')]"));
		List<WebElement> sportLabelRBs = driver.findElements(By.xpath("//div //label [contains(@id,'sport')]"));

		for (int i=0; i<colorRBs.size(); i++) {
			if(colorRBs.get(i).isSelected()) {
				System.out.println("Element " + colorLabelRBs.get(i).getText() + " with index " + i + " is SELECTED");
			}
			else 	
				System.out.println("Element " + colorLabelRBs.get(i).getText() + " with index " + i + " is not slected");
		}
		
		System.out.println(space);

		for (int i=0; i<sportRBs.size(); i++) {
			if(sportRBs.get(i).isSelected()) {
				System.out.println("Element " + sportLabelRBs.get(i).getText() + " with index " + i + " is SELECTED");
			}
			else
				System.out.println("Element " + sportLabelRBs.get(i).getText() + " with index " + i + " is not selected");
		}
	}

}
