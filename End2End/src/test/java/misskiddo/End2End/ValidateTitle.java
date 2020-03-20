package misskiddo.End2End;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import misskiddo.End2End.pageObjects.LandingPage;
import misskiddo.End2End.resources.Base;

public class ValidateTitle extends Base {
	
	@Test
	public void basePageNavigation() throws IOException {
		
		
		
		
		LandingPage lp = new LandingPage(driver);
		
	//	Assert.assertEquals("Features", lp.getTitle());
		
		Assert.assertTrue(lp.isNavigationBarVisible());
		
		
	}
	
	
	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();

		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	@AfterTest
	public void closeWindow() {
		driver.close();
	}

}
