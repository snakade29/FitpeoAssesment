package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RevenueCalculator {
	
WebDriver driver;
	
	public   RevenueCalculator(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	  
//	
//	@FindBy(xpath="//*[text()='Medicare Eligible Patients']/..//span[contains(@class,'thumbColorPrimary css-sy3s50')]")
//	public WebElement  slider ;
	
	@FindBy(xpath="//*[text()='Medicare Eligible Patients']")
	public WebElement  Medicare_Eligible_Patients  ;
	
	@FindBy(xpath="//input[@type='number']")
	public WebElement  slider ;
	
	
	@FindBy(xpath=" 	//p[text()='CPT-99091']")
	public WebElement  Scroll_CPT_99091 ;
	
	
	@FindBy(xpath="//p[text()='CPT-99454']")
	public WebElement Scroll_CPT_99454   ;
	
	
	
	@FindBy(xpath="//p[text()='CPT-99091']/..//label//input[@type='checkbox'] ")
	public WebElement  Checkbox_CPT_99091   ;
	
	@FindBy(xpath="//p[text()='CPT-99453']/..//label//input[@type='checkbox'] ")
	public WebElement  Checkbox_CPT_99453    ;
	
	@FindBy(xpath="//p[text()='CPT-99457']/..//label//input[@type='checkbox'] ")
	public WebElement  Checkbox_CPT_99457   ;
	
	@FindBy(xpath="//p[text()='CPT-99454']/..//label//input[@type='checkbox'] ")
	public WebElement  Checkbox_CPT_99454   ;
	
	
	
	@FindBy(xpath="//p[contains(text(),' Patients Per Month:')]//p[contains(@class,'body1 inter css-hocx5c')]")
	public WebElement   Total_Recurring_Reimbursement   ;
	  
	
	
	 
	
	
	 
	
	 
	
	 
	
	
	public void scrollToElement(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
	
	 public  void   Set_Slider(String str ) throws InterruptedException
	 {
		 slider.click();
	 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].value='';",  slider);
	 
		    
            slider.sendKeys(str);        
		  	     
 
	 }
	 
	 
	 
}
