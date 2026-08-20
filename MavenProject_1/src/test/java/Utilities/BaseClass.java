package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	static String browsername;
	public static WebDriver driver;
	
	public static WebDriver initializeDriver() throws IOException
	{
		browsername = FetchDatafromPropertiesFile.get_data_from_property().getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.get(FetchDatafromExcel.getURL(1, 0));
			driver.manage().window().maximize();

			
		}
		
		if(browsername.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(FetchDatafromExcel.getURL(1, 0));
			driver.manage().window().maximize();
			
		}
		
		if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.get(FetchDatafromExcel.getURL(1, 0));
			driver.manage().window().maximize();
			
		}
		
		return driver;	
	}
	
	public static String getTitle()
	{
		return driver.getTitle();
	}
	
	public static String generateEmail()
	{ 
		String email =  "user" + java.util.UUID.randomUUID().toString().substring(0, 8) + "@gmail.com"; 
		return email;
	}
	
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
