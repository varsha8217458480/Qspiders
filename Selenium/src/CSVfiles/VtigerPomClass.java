package CSVfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class VtigerPomClass {

	public VtigerPomClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	@Findby(id="username")
	private WebElement userNameTextField;
	
	@FindBy(id="password")
	private WebElement passwardTextField;
	
	@FindBy(xpath="//button[@class='button buttonBlue']") 
	private WebElement signInButton;
	
	
	
	
	
	
	
}
