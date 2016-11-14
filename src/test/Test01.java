package test;

import org.junit.Test;
import pageObject.AbstractPage;
import pageObject.Basicbutton;
import pageObject.Checkbox;
import pageObject.Listbox;
import pageObject.Menubar;
import pageObject.Radiobutton;

public class Test01 extends AbstractPage{


	@Test
	public void test() throws InterruptedException  {

		Checkbox.displayElements();
		Checkbox.selectElementWithIndex(2);
		Checkbox.clickOnMonday();
		System.out.println(space);
		
		Radiobutton.navigateToRadioButton();
		Radiobutton.displayElements();
		System.out.println(space);
		Radiobutton.displaySelectedElements();
		System.out.println(space);
		Thread.sleep(2000);
		
		Basicbutton.navigateToBasicbutton();
		Basicbutton.clickNormalButton();
		
		Listbox.navigateToListbox();
		Thread.sleep(2000);
		Listbox.selectSports();
		Thread.sleep(2000);
		
		Menubar.navigateToMenubar();
		Menubar.hoverFileMenu();
		
	}

}
