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
		WebElement menu;
		WebElement open;
		//menu = driver.findElement(By.xpath("//td [text()='File']"));
		menu = getWhenVizible(driver, By.xpath("//td [text()='File']"), 5000);

		// hover File menu
		logger.info("Hover File menu");
		
		action.moveToElement(menu).build().perform();
		Thread.sleep(1000);
		
		// click Open
		logger.info("Click Open");
		
		open = getWhenVizible(driver, By.xpath("//td [text()='Open']"), 5000);
		action.moveToElement(open).click().build().perform();
		Thread.sleep(1000);

		// close the pop-up
		logger.info("Accept alert");
		waitForAlert();
		Alert alert = driver.switchTo().alert();
		waitForAlert();
		alert.accept();

	}

}
