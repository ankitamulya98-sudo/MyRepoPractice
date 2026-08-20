package PageClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class Login_Page extends BaseClass {
	WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement submit;
	
	public void enterUsername(String userName)
	{
		uname.sendKeys(userName);
	}
	
	public void enterPassword(String passWord)
	{
		pwd.sendKeys(passWord);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	

	
			

}
