package StepDefination1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageClass1.EditCustomer;
import PageClass1.Login_Page;
import PageClass1.NewCustomer;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.FetchDatafromExcel;

public class StepDefination1 extends BaseClass {
	
	Login_Page obj;
	NewCustomer obj1;
	EditCustomer obj2;
	
	@Given("User opens Guru {int} Demo Application")
	public void user_opens_guru_demo_application(Integer int1) throws IOException 
	{
	    WebDriver driver = BaseClass.initializeDriver();
	    obj = new Login_Page(driver);
	    obj1 = new NewCustomer(driver);
	    obj2 = new EditCustomer(driver);
	    getTitle();
		Assert.assertEquals(false,false);
	    
	}

	@Given("user enters the username in uname field {string}")
	public void user_enters_the_username_in_uname_field(String username) 
	{
		obj.enterUsername(username);
	}

	@Given("user enters the password in passwd field {string}")
	public void user_enters_the_password_in_passwd_field(String password) 
	{
		obj.enterPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	    obj.clickSubmit();
	}

	@Then("user will navigate to the home page of the application")
	public void user_will_navigate_to_the_home_page_of_the_application() 
	{
	    String title = getTitle();
	    System.out.println(title);
	}
	
	
	@Given("user clicks on new customer link")
	public void user_clicks_on_new_customer_link() 
	{
	    obj1.ClickNewCust();
	}

	@Given("user enteres the customer name {string}")
	public void user_enteres_the_customer_name(String custname) 
	{
	   obj1.enterCustname(custname);
	}

	@Given("user selects the gender")
	public void user_selects_the_gender() 
	{
		obj1.selectGender();
	}

	@Given("user enters dob {string}")
	public void user_enters_dob(String DOB) 
	{
	    obj1.enterDOB(DOB);
	}

	@Given("user enters address {string}")
	public void user_enters_address(String addr) 
	{
		obj1.enterAddress(addr);
	}

	@Given("user enters city {string}")
	public void user_enters_city(String City) 
	{
		obj1.enterCity(City);
	}

	@Given("user enters state {string}")
	public void user_enters_state(String st) 
	{
		obj1.enterState(st);
	}

	@Given("user enters pincode {string}")
	public void user_enters_pincode(String PIN) 
	{
		obj1.enterPin(PIN);
	}

	@Given("user enters mobile {string}")
	public void user_enters_mobile(String tele) 
	{
		obj1.enterMobile(tele);
	}

	@Given("user enters email as emailAddress")
	public void user_enters_email_as_email_address() 
	{
		obj1.enterEmail(generateEmail());  
	}

	@Given("user enters password {string}")
	public void user_enters_password(String passw) 
	{
		obj1.enterPassword(passw);
	}

	@When("user clicks on new customer creation submit button")
	public void user_clicks_on_new_customer_creation_submit_button() 
	{
		obj1.clickSubmitBtn();
	}

	@Then("a new customer will be created")
	public void a_new_customer_will_be_created()
	{
		Boolean flag = obj1.custIDValidation();
		Assert.assertEquals(true, flag);
	}

	@Then("user captures customer id")
	public void user_captures_customer_id() throws IOException 
	{
		String cust_id = obj1.getCustid();
		System.out.print(cust_id);
		FetchDatafromExcel.writeCustomerID(cust_id);
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException 
	{
		closebrowser();
	}
	
	@Then("user clicks on edit customer link")
	public void user_clicks_on_edit_customer_link() 
	{
	    obj2.clickeditCust();
	}

	@Then("user enters the customer ID")
	public void user_enters_the_customer_id() throws IOException 
	{
		 String cust_id1 = FetchDatafromExcel.getCustomerID();
		 System.out.println("Customer ID read from Excel: " + cust_id1);
		 obj2.enterAccNo(cust_id1);
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() 
	{
	    obj2.clickSubmit();
	}
	
	@Then("user edit address")
	public void user_edit_address() 
	{
		obj2.editaddress("test");
	}

	@Then("user click on submit")
	public void user_click_on_submit() 
	{
		obj2.clickSubmitBtn();
	}



}
