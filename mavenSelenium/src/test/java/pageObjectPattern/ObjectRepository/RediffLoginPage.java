package pageObjectPattern.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RediffLoginPage {
	
	
	WebDriver driver;
	
	By usernameField = By.xpath("//input[@id='login1']");
	
	By passwordField = By.cssSelector("#password");
	
	By signButton = By.xpath("//input[@name='proceed']");
	
	
	//Constructor
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void setUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
		
	}
	
	public void setPassword(String pass) {
		driver.findElement(passwordField).sendKeys(pass);
	}
	
	public void clickSignButton() {
		driver.findElement(signButton).click();
	}
	
	
		
	
	
	
	
	

}
