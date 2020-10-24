package com.amazon.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.amazon.baseclass.AmazonBaseClass;
import com.amazon.properties.FileReaderManager;

import cucumber.api.java.en.*;

public class StepDefinition extends AmazonBaseClass {
	public static WebDriver driver;

@Given("^user to launch the browesr  and application$")
public void user_to_launch_the_browesr_and_application() throws Throwable {
	System.out.println("given part of 1st scenario");
	Thread.sleep(10000);
    
}

@When("^user to launch browser$")
public void user_to_launch_browser() throws Throwable {
		
		  String browserinit = FileReaderManager.frInstance().crInstance().getBrowser();
		  driver=AmazonBaseClass.browserLaunch(browserinit);
		 
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\kesavaraj\\eclipse-workspace\\AmazonCucumber\\Driver\\chromedriver.exe"
		 * ); driver = new ChromeDriver();
		 */
	Thread.sleep(9000);
   
}

@Then("^user to launch the application$")
public void user_to_launch_the_application() throws Throwable {
	String urlinit = FileReaderManager.frInstance().crInstance().getUrl();
	getUrl(urlinit);
	//driver.get("https://www.amazon.in/");
     
     
   
}



}
