package misskiddo.End2End.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center>h2");
	
	By navigationBar = By.cssSelector(".nav.navbar-nav.navbar-right");
	
	public LandingPage(WebDriver driver2) {
		this.driver = driver2;
	}


	public WebElement getLogin() {
		return driver.findElement(signIn);
	}
	
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	
	public boolean isNavigationBarVisible() {
		return driver.findElement(navigationBar).isDisplayed();
	}
	
	
	

}
