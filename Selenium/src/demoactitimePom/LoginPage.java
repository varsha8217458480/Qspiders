package demoactitimePom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//element identification using @findBy
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement usernameTextField1;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginButton;
	
	
	
	
	
	
	
	
	
}
