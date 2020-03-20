package misskiddo.End2End.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver = null;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		
		prop = new Properties();
		FileInputStream path = new FileInputStream("src\\main\\java\\misskiddo\\End2End\\resources\\data.properties");
		prop.load(path);
		
		String browserName = prop.getProperty("browser");
	
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		}
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		}
		else {
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
		
	}

}
