package misskiddo.mavenSelenium.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test(groups= {"Smoke"})
	public void demo() {
		System.out.println("******************************Day 1. Smoke 1/3");
	}
	
	@Test
	public void demo2() {
		System.out.println("******************************Day 1. Two");
	}
	
	@AfterTest
	public void before() {
		System.out.println("**************After Test");
		
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("***********Before Class Day 1");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("***********After Class Day 1");
		
	}
	
	@Parameters({"URL", "API/username"})
	@Test
	public void printURL(String s, String key) {
		
		System.out.println("************ " + s + key);
	}
	
	
	
	
	


}
