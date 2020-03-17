package mavenSelenium.pageObject.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import mavenSelenium.pageObject.Repository.RediffHomePage;
import mavenSelenium.pageObject.Repository.RediffLoginPagePageFactory;

public class LoginApp {
	
	
	
	@Test
	public void TestApp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		//RediffLoginPage login = new RediffLoginPage(driver);
		RediffLoginPagePageFactory login = new RediffLoginPagePageFactory(driver);
		
		login.setUsername("misskiddo");
		login.setPassword("12234");
		login.clickSignButton();
		
		login.Home().click();
		
		RediffHomePage home = new RediffHomePage(driver);
		home.search("Hola caracola");
		
	
		
		
	}

}
