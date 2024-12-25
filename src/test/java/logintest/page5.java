package logintest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library_files.page5B;
import library_files.page5U;
import mavenlogintest.page1;
import mavenlogintest.page2;
import mavenlogintest.page3;

public class page5 extends page5B{
	
	
	
	Sheet Sh;
	
	page1 login;
	page2 mainpage;
	page3 logout;
	int TCID;
	
	
	
	
	
	
	@BeforeClass
	public void openbrowserpage() throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		
		
	    
		
		
		
	     initializebrowser();
		 login=new page1(driver);
		  mainpage=new page2(driver);
		   logout=new page3(driver);
		
	}
	@BeforeMethod
	public void loginpage() throws InterruptedException, EncryptedDocumentException, IOException {
		
		login.swaglagsloginUN(page5U.getTDfromPF("UN"));
		login.swaglagsPWD(page5U.getTDfromPF("PWD"));
		login.swaglagsloginLOGIN();
		Thread.sleep(3000);
		
	}
	@Test
	public void mainpage() throws InterruptedException, EncryptedDocumentException, IOException {
		
		TCID=001;
		
		String actualresult = mainpage.swaglagsLOGO();
	    String expectedresult=page5U.getTD(0, 2);
	    Assert.assertEquals(actualresult, expectedresult,"both the results are same");
	    
		mainpage.swaglagsMENU();
		Thread.sleep(3000);
		
		
		
	}
	@AfterMethod
	public void logout(ITestResult S1) throws InterruptedException, IOException {
		
		if(S1.getStatus()==ITestResult.FAILURE) {
			
			page5U.getScreenshots(driver, TCID);
			
		}
		
		logout.swaglagsLOGOUT();
		Thread.sleep(2000);
		
		
		
		
	}
	@AfterClass
	public void quitbrowser() {
		driver.quit();
	}

}
