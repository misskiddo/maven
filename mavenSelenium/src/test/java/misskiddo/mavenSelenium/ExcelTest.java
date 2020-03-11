package misskiddo.mavenSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelTest {

	public static ArrayList<String> getTestCase(String nameTestCase) throws IOException {
		FileInputStream fis = new FileInputStream("C://TestAutomation//dataExcel.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		ArrayList<String> array = new ArrayList<String>();

		int numSheets = workbook.getNumberOfSheets();

		for (int i = 0; i < numSheets; i++) {
			System.out.println("sheet name: " + workbook.getSheetName(i));
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();

				// Access to the first row
				Row firstRow = rows.next();

				Iterator<Cell> cell = firstRow.cellIterator(); // row is a collection of cells

				int columnIndex = 0;
				int k = 0;
				while (cell.hasNext()) {
					cell.next();
					if (cell.toString().equalsIgnoreCase("TestCases")) {
						columnIndex = k;

					}
					k++;
				}

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(columnIndex).getStringCellValue().equalsIgnoreCase(nameTestCase)) {

						Iterator<Cell> c = r.cellIterator();
						while (c.hasNext()) {
							Cell x = c.next();
							if(x.getCellType()==CellType.STRING) {
								array.add(x.getStringCellValue());
							}
							else {
								String value = NumberToTextConverter.toText(x.getNumericCellValue());
								array.add(value);
							}
								
												
							
						}
					}

				}
				break;
			}

		}

		return array;
	}

}
