package misskiddo.End2End.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href*='sign in]");
	
	
	public LandingPage(WebDriver driver2) {
		this.driver = driver2;
	}


	public WebElement getLogin() {
		return driver.findElement(signIn);
	}
	
	
	

}
