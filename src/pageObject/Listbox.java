package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox extends AbstractPage {
	
	public Listbox(WebDriver driver) {
		super(driver);
	}
	
	public static void navigateToListbox() {
		driver.navigate().to("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwListBox");
	}
	
	public static void selectSports() {
		Select sel =  new Select(driver.findElement(By.id("gwt-debug-cwListBox-dropBox")));
		sel.selectByValue("Sports");
		
		Select sel1 =  new Select(driver.findElement(By.id("gwt-debug-cwListBox-multiBox")));
		sel1.selectByValue("Football");
		sel1.selectByValue("Polo");
		
	}

}
