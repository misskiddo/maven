package misskiddo.mavenSelenium;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws IOException {

		ExcelTest e = new ExcelTest();
		
		ArrayList data = e.getTestCase("Add Profile");
		
		System.out.println(data);

	}

}
