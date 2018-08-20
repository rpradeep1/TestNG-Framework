package com.abc.testscript;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.abc.projectpage.TestngAnnotations;



public class LoginPage extends TestngAnnotations {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUpApplication()
	{
		String Path = System.getProperty("user.dir");	
		
		//System.out.println(Path);
		
		System.setProperty("webdriver.chrome.driver", Path + "chromedriver.exe");
		
		driver = new ChromeDriver();			    
     
		
		Reporter.log("===========Browser Starting Session============");
		
		driver.get("https://qapolicy.ihtech.com/jbpm/#LogInPlace:login");
		
		//driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void CloseApplication() 
	
	{
		
		driver.quit();		
		Reporter.log("===========Browser Closing Session============");	
		
	}
	
	@Test
	public void LoginToApplication ()
	
	{
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//input[@id='x-auto-22-input']")).sendKeys("iht_ittest01");
		
		driver.findElement(By.id("x-auto-24-input")).sendKeys("Ihealth123");
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		System.out.println("Sign In Button is clicked Successfully");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		
		
	}
	
	


}
