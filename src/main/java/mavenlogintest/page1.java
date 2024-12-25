package mavenlogintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1 {
	
	    @FindBy(xpath = "//input[@placeholder='Username']") private WebElement UN;
	    @FindBy(xpath = "//input[@placeholder='Password']") private WebElement PWD;
	    @FindBy(xpath = "//input[@type='submit']") private WebElement LOGIN;
	
	
	public page1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void swaglagsloginUN(String username) {
		UN.sendKeys(username);
	}
	public void swaglagsPWD(String password) {
		
		PWD.sendKeys(password);
	}
	public void swaglagsloginLOGIN() {
		
		LOGIN.click();
		
	}
	
	

}
