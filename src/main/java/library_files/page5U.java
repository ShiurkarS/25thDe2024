package library_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class page5U {
	
	public static String getTD(int rowindex,int columnindex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\shubham shiurkar\\eclipse-workspace\\24thDecember2024\\testdata\\24rdDec2024.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = Sh.getRow(rowindex).getCell(columnindex).getStringCellValue();
		return value;
		
		
	}
	public static void getScreenshots(WebDriver driver,int TCID) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\shubham shiurkar\\eclipse-workspace\\24thDecember2024\\screenshots\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
		
	}
	public static String getTDfromPF(String key) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\shubham shiurkar\\eclipse-workspace\\24thDecember2024\\propertyfiles");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
		
	}

}
