package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodSEndKeys {

	public static void main(String[] args) 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement userNameTextField = driver.findElement(By.name("pwd"));
		userNameTextField.sendKeys("admin");
		
		
		userNameTextField.sendKeys(Keys.CONTROL+"a");
		userNameTextField.sendKeys(Keys.CONTROL+"c");
		
		WebElement passwardTextField = driver.findElement(By.name("pwd"));
		passwardTextField.sendKeys("manager");
		Thread.sleep(2000);
		passwardTextField.sendKeys(Keys.ENTER);
		
		
		

	}

}
