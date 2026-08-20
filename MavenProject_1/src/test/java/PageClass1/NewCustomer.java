package PageClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
	
WebDriver driver;
	
	public NewCustomer(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement newcust;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement cust_name;
	
	@FindBy(xpath="//input[@value='f']")
	WebElement gender;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement Submit;
	
	@FindBy(xpath="//td[text()='Customer ID']/following::td[1]")
	WebElement cust_id;
	
	public void ClickNewCust()
	{
		newcust.click();
	}
	
	public void enterCustname(String custname)
	{
		cust_name.sendKeys(custname);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	public void enterDOB(String DOB)
	{
		dob.sendKeys(DOB);
	}
	
	public void enterCity(String City)
	{
		city.sendKeys(City);
	}
	
	public void enterState(String st)
	{
		state.sendKeys(st);
	}
	
	public void enterAddress(String addr)
	{
		address.sendKeys(addr);
	}
	
	public void enterPin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void enterMobile(String tele)
	{
		mobile.sendKeys(tele);
	}
	
	public void enterEmail(String email)
	{
		emailid.sendKeys(email);
	}
	
	public void enterPassword(String passw)
	{
		Password.sendKeys(passw);
	}
	
	public void clickSubmitBtn()
	{
		Submit.click();
	}
	
	public boolean custIDValidation()
	{
		return cust_id.isDisplayed();
	}
	
	public String getCustid()
	{
		return cust_id.getText();
	}
	
	
	
	

}
