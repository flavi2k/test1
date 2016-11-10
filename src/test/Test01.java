package test;

import org.junit.Test;
import pageObject.AbstractPage;
import pageObject.Checkbox;
import pageObject.Radiobutton;

public class Test01 extends AbstractPage{
	
	Checkbox cb = new Checkbox();
	protected Radiobutton rb = new Radiobutton();

	@Test
	public void test()  {
		
		cb.displayMessage();
		cb.clickOnMonday();
		
	}

}
