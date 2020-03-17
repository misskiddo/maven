package mavenSelenium.pageObject.Repository;
 // PAGE FACTORY

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePageFactory {
	
	
	WebDriver driver;
	
/*	By usernameField = By.xpath("//input[@id='login1']");
	
	By passwordField = By.cssSelector("#password");
	
	By signButton = By.xpath("//input[@name='proceed']");
	
	By home = By.partialLinkText("rediff.com");*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement usernameField;
	
	@FindBy(css="#password")
	WebElement passwordField;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement signButton;
	
	@FindBy(partialLinkText="rediff.com")
	WebElement home;
	
	
	
	//Constructor
	public RediffLoginPagePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setUsername(String username) {
		usernameField.sendKeys(username);
		
	}
	
	public void setPassword(String pass) {
		passwordField.sendKeys(pass);
	}
	
	public void clickSignButton() {
		signButton.click();
	}
	
	public WebElement Home() {
		  return home;
	}
	
	
		
	
	
	
	
	

}
