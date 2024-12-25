package mavenlogintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page3 {
	
	
	 @FindBy(xpath = "//a[@id='logout_sidebar_link']") private WebElement LOGOUT;
	
	
	public page3(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void swaglagsLOGOUT() {
		
		LOGOUT.click();
		
	}

}
