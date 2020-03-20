package misskiddo.End2End.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;

	By email = By.id("user_email");
	
	By password = By.id("user_password");
	
	By logIn = By.cssSelector("[data-disable-with='Log In']");
	
	
	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public void setEmail(String e) {
		driver.findElement(email).sendKeys(e);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogIn() {
		driver.findElement(logIn).click();
	}



	
	

}
