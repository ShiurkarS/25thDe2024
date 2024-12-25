package mavenlogintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2 {
	
	
	   @FindBy(xpath = "//div[@class='app_logo']")  private WebElement LOGO;
	   @FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement MENU;
	   
	
	
	public page2(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String swaglagsLOGO() {
		
		
		String actualresult = LOGO.getText();
		
		return actualresult;
		
		
	}
	
//	public void swaglagsLOGO(String expectedtext) {
//		   
//		String actualtext = LOGO.getText();
//		
//	
//		
//		if(actualtext.equals(expectedtext)) {
//			
//			System.out.println("text is match");
//			
//		}
//		else {
//			
//			System.out.println("text is not match");
//		}
//		
//	
//		
//	}
	
	public void swaglagsMENU() {
		
		MENU.click();
		
	}

}
