package com.amazon.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AmazonBaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\kesavaraj\\eclipse-workspace\\AmazonCucumber\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\kesavaraj\\eclipse-workspace\\SeleniumConcept\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\kesavaraj\\eclipse-workspace\\SeleniumConcept\\Driver\\geckoDriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid browsename");
			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void getUrl(String url) {
		try {
			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
