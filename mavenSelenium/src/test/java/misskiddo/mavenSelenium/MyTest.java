package misskiddo.mavenSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void login() throws IOException {
		WebDriver driver = null;
		
		Properties prop = new Properties();
		FileInputStream path = new FileInputStream("C:\\Users\\antonia.cabrerajimen\\eclipse-workspace\\TesNGTutorial\\src\\section19\\datadriven.properties");
		
		
		prop.load(path);
		
		String username = (String) prop.get("username");
		
		System.out.println(username);
		if ( prop.get("browser").equals("chrome") ) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		}
		else if  ( prop.get("browser").equals("firefox") ) {
			 driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		}
		else {
			 driver = new InternetExplorerDriver();
		}
		
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
	

}
