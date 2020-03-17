package mavenSelenium.pageObject.Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RediffHomePage {
	
	
	WebDriver driver;
	By searchField = By.id("srchquery_tbox");
	
	
	public RediffHomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void search(String text) {
		driver.findElement(searchField).sendKeys(text, Keys.ENTER);
		
	}
	
	
	

}
