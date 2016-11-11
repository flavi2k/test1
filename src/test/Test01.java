package test;

import org.junit.Test;
import pageObject.AbstractPage;
import pageObject.Basicbutton;
import pageObject.Checkbox;
import pageObject.Listbox;
import pageObject.Menubar;
import pageObject.Radiobutton;

public class Test01 extends AbstractPage{


	Checkbox cb = new Checkbox(driver);
	Radiobutton rb = new Radiobutton(driver);
	Basicbutton bb = new Basicbutton(driver);
	Listbox lb = new Listbox(driver);
	Menubar mb = new Menubar(driver);


	@Test
	public void test() throws InterruptedException  {

		cb.displayElements();
		cb.selectElementWithIndex(2);
		cb.clickOnMonday();
		System.out.println(space);
		
		rb.navigateToRadioButton();
		rb.displayElements();
		System.out.println(space);
		rb.displaySelectedElements();
		System.out.println(space);
		Thread.sleep(2000);
		
		bb.navigateToBasicbutton();
		bb.clickNormalButton();
		
		lb.navigateToListbox();
		Thread.sleep(2000);
		lb.selectSports();
		Thread.sleep(2000);
		
		mb.navigateToMenubar();
		mb.hoverFileMenu();
		
	}

}
