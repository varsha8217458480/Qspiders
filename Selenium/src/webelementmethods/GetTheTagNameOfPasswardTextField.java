package webelementmethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheTagNameOfPasswardTextField {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromrdriver.exe");
			WebDriver.driver= new ChromeDriver();
			
			
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			
			String passwardTextField= driver.findelement(By.name("pwd")).getTagNmae();
			System.out.println(passwardTextField);
			driver.quit();
			
			

	}

}
