package pageObjectPattern.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectPattern.ObjectRepository.RediffLoginPage;

public class LoginApp {
	
	
	
	@Test
	public void TestApp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		RediffLoginPage login = new RediffLoginPage(driver);
		
		login.setUsername("misskiddo");
		login.setPassword("12234");
		login.clickSignButton();
		
	}

}
