package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsGetAttribute {

	public static void main(String[] args) {
		String expectedToolTipTitle=("Dp not select if this computer is shared");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		String actualToolTipTitle = driver.findElement(By.name("remember")).getAttribute("title");
		System.out.println(actualToolTipTitle);
			
		
		if(expectedToolTipTitle.equals("actualToolTipTitle"));{
			System.out.println("passed: Tool Tip Is Verified");
		}
		else {
				
		System.out.println("failed: Values are diffrent");
		
		


	}
driver.quit();
}
