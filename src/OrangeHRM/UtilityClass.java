package OrangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
public static String getTestData(int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException

{
	FileInputStream file=new FileInputStream("E:\\OrangeHRM.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	String value = sh.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	
	return value;
}

public static void Capture_ScreenShot(WebDriver driver, int TCID) throws IOException
{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination=new File("C:\\Users\\HP\\Desktop\\SS"+TCID+".jpg");
	
	FileHandler.copy(source, destination);
	
}
}
