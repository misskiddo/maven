package misskiddo.End2End;

import java.io.IOException;

import org.testng.annotations.Test;

import misskiddo.End2End.pageObjects.LandingPage;
import misskiddo.End2End.resources.Base;

public class HomePageTest extends Base {
	
	@Test
	public void basePageNavigation() throws IOException {
		
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		LandingPage lp = new LandingPage(driver);
		
		lp.getLogin().click();
		
		
	}

}
