package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

 

public class HomePage {

	WebDriver driver;
	
	public  HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //div[text()='Revenue Calculator']")
	public WebElement  RevenueCalculatorPage ;
	

	 
	
	public void  Navigate_to_RevenueCalculatorPage( ) {
		
		RevenueCalculatorPage.click();
		
	}
	 
 

	 
	 
	 
	 
	 
	 
}
