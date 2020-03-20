package misskiddo.End2End;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import misskiddo.End2End.pageObjects.LandingPage;
import misskiddo.End2End.pageObjects.LoginPage;
import misskiddo.End2End.resources.Base;

public class HomePageTest extends Base {
	
	@Test (dataProvider="getData")
	public void basePageNavigation(String username, String password, String notes) throws IOException {
		
		driver = initializeDriver();
		
		String url = prop.getProperty("url");
		driver.get(url);
		
		LandingPage lp = new LandingPage(driver);
		
		lp.getLogin().click();
		
		LoginPage login = new LoginPage(driver);
		
		login.setEmail(username);
		login.setPassword(password);
		login.clickLogIn();
		
		
	}
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][]data = new Object[2][3];
		
		data[0][0] = "user1@hot.com";
		data[0][1] = "12345";
		data[0][2] = "Restricted user";
		
		
		data[1][0] = "user2@gmail.com";
		data[1][1] = "12345";
		data[1][2] = "Non Restricted user";
		
		return data;
		
				
	}

}
