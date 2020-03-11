package misskiddo.mavenSelenium.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void demo() {
		System.out.println("******************************Day 2. exclude demo.*");
	}
	
	@Test
	public void demo2() {
		System.out.println("******************************Day 2.exclude demo.");
	}
	
	@Test
	public void demo3() {
		System.out.println("******************************Day 2. exclude demo.");
	}

	
	@Test
	public void onlythis() {
		System.out.println("******************************Day 2. Only this");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void before() {
		System.out.println("*********Before Test. Day 2");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("**************************This should be the printed before every method in Day 2");
		
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("**************************This should be the printed after every method in Day 2");
		
	}


}
