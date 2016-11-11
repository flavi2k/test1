package test;

import org.junit.Test;
import pageObject.AbstractPage;
import pageObject.Checkbox;

public class Test01 extends AbstractPage{
	
		
	Checkbox cb = new Checkbox(driver);
	

	@Test
	public void test()  {
		
		cb.displayMessage();
		cb.clickOnMonday();
		
	}

}
