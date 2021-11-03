package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login = new LoginPage(driver);
		login.getUserNameTextField().sendKeys("admin");
		login.getPassworTextField().sendKeys("manager");
		login.getLoginButton().click();
		
		//driver.quit();
		
		
		
	}

}
