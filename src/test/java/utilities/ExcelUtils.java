package utilities;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtils {
	public static String getData(int row, int cell) throws Exception{
		FileInputStream fis=new FileInputStream("testdata/TestData.xlsx");
		
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	
	String value=sheet.getRow(row).getCell(cell).getStringCellValue();
	
	wb.close();
	return value;
	}

}
