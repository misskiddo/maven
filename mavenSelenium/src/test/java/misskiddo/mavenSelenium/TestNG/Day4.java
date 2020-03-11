package misskiddo.mavenSelenium.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void demo() {
		System.out.println("******************************Day 4. Only one in day 4");
	}
	
	@Test
	public void demo2() {
		System.out.println("******************************Day 4. Don't display this one");
	}

	
	@Test(groups= {"Smoke"})
	public void demo3 () {
		System.out.println("******************************Day 4.  Smoke 2/3");
	}
	
	@Test(groups= {"Smoke"})
	public void ademo4 () {
		System.out.println("******************************Day 4.  Smoke 3/3");
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1st combination - username password good - good credit
		// 2nd combination - no credit history
		// 3rd combination - fraudalent credit history
		
		// Create array of  3 rows (combiations) and 2 columns (username and password)
		Object [][] data = new Object[3][2];
		
		// 1st
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		// 2nd
		data[1][0]="seconduser";
		data[1][1]="secondpass";
		
		//3rd
		data[2][0]="thirduser";
		data[2][1]="3pass";
		
		return data;
	}
	
	@Test(dataProvider="getData")
	public void displayData(String username, String pass) {
		System.out.println(username);
		System.out.println(pass);
	
		
	}

}
