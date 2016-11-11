package test;

import org.junit.Test;
import pageObject.AbstractPage;
import pageObject.Checkbox;
import pageObject.Radiobutton;

public class Test01 extends AbstractPage{
	
		
	Checkbox cb = new Checkbox(driver);
	Radiobutton rb = new Radiobutton(driver);
	

	@Test
	public void test()  {
		
		cb.selectElementWithIndex(7);
		cb.displayEnabledCBs();
		rb.navigateToRadioButton();
	}

}
