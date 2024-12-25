package library_files;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page5B {
	
	protected WebDriver driver;
	
	public void initializebrowser() throws InterruptedException, IOException {
		
		 driver=new ChromeDriver();
		    driver.get(page5U.getTDfromPF("URL"));
			driver.manage().window().maximize();
			Thread.sleep(3000);
	}

}
