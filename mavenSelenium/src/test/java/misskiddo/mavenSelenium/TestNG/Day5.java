package misskiddo.mavenSelenium.TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day5 {
	
	@BeforeSuite
	public void demo() {
		System.out.println("*******Before Suite");
	}
	
	@AfterSuite
	public void demo2() {
		System.out.println("*******After suite");
	}
	
	@Test (dependsOnMethods= {"z", "x"})
	public void a() {
		System.out.println("************ A");
	}
	
	@Test
	public void x() {
		System.out.println("************ x");
	}
	
	
	@Test 
	public void z() {
		System.out.println("************ Z");
	}
	
	@Test (enabled=false)
	public void y() {
		System.out.println("************ Y");
	}
	
	@Test (enabled=true)
	public void b() {
		System.out.println("************ B");
	}
	
	@Test (timeOut=4000)
	public void t() {
		System.out.println("************ Timeout");
	}
	
	@Parameters({"URL"})
	@Test
	public void printURL(String s) {
		
		System.out.println("************ " + s);
	}


}
