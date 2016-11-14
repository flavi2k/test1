package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basicbutton extends AbstractPage{

	public Basicbutton(WebDriver driver) {
		super(driver);
	}

	public static void navigateToBasicbutton() {
		driver.findElement(By.xpath("//div[text()='Basic Button']")).click();
	}

	public static void clickNormalButton() throws InterruptedException {
		WebElement normalButton = driver.findElement(By.id("gwt-debug-cwBasicButton-normal"));
		logger.info("Click on normal button");
		normalButton.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		logger.info("Accept the alert");
		alert.accept();

	}

}
