package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Reusable.Reusable;
import base.BaseClass;
 
import pages.HomePage;
import pages.RevenueCalculator;
 

public class TestCases extends BaseClass {

	 @Test
	public void  Testcase1 () throws InterruptedException
	{
		HomePage home =  new HomePage(driver);
		home.Navigate_to_RevenueCalculatorPage();
		RevenueCalculator revenuePage = new RevenueCalculator(driver);
 
		Reusable.WaitForVisibilityOfElement(driver, revenuePage.Medicare_Eligible_Patients);
		revenuePage.scrollToElement(revenuePage.Medicare_Eligible_Patients );
		Thread.sleep(2000);
		Reusable.WaitForVisibilityOfElement(driver, revenuePage.slider);
		revenuePage.Set_Slider("820");
		Thread.sleep(2000);
		Reusable.WaitForVisibilityOfElement(driver, revenuePage.slider);
		revenuePage.Set_Slider("560");
		Thread.sleep(2000);
		String value = revenuePage.slider.getAttribute("value");
		Assert.assertEquals(value,"560" );
		Thread.sleep(2000);
		revenuePage.scrollToElement(revenuePage.Scroll_CPT_99091);
		
		revenuePage.Checkbox_CPT_99091.click();
		revenuePage.Checkbox_CPT_99453.click();
		Thread.sleep(2000);
		revenuePage.scrollToElement(revenuePage.Scroll_CPT_99454);
		revenuePage.Checkbox_CPT_99454.click();
		revenuePage.Checkbox_CPT_99457.click();
		Thread.sleep(2000);
	
		Assert.assertEquals( revenuePage.Total_Recurring_Reimbursement.getText(), "$95760");
		
 
				
		
     }
    
 
	
	
	
	
	
	
	
}
 