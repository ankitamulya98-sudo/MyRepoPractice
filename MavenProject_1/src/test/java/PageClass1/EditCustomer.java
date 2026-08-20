package PageClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {
	
	WebDriver driver;
	
	public EditCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
		
	@FindBy(xpath="//a[normalize-space()='Edit Customer']")
	WebElement editcust;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement accountno;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement submit;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement submitbtn;
	
	public void clickeditCust()
	{
		editcust.click();
	}
	
	public void enterAccNo(String accno)
	{
		accountno.sendKeys(accno);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
	public void editaddress(String adress) 
	{
		address.sendKeys(adress);
	}
	
	public void clickSubmitBtn()
	{
		submitbtn.click();
	}
	
		

}
