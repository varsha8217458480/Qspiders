package webelementmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodgetcssvalue {

	public static void main(String[] args)
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();

String colorofLoginButton = driver.findElement(By.xpath("//div[text()='Login']"))
                 .getcssvalue("border-top-color");
System.out.println(colorofLoginButton);

driver.quit();
}
