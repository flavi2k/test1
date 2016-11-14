package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Menubar extends AbstractPage{
	
	public Menubar(WebDriver drive) {
		super(driver);
	}
	
	public static void navigateToMenubar() {
		driver.findElement(By.xpath("//div [text()='Menu Bar']")).click();
		
	}
	
	public static void hoverFileMenu() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//td [text()='File']"));
		
		// hover File menu
		action.moveToElement(menu).build().perform();
		Thread.sleep(2000);
		// click Open
		action.moveToElement(driver.findElement(By.xpath("//td [text()='Open']"))).click().build().perform();
		Thread.sleep(2000);
		
		// close the pop-up
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
