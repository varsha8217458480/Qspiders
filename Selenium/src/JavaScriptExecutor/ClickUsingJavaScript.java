package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(	By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
				WebElement loginButton = driver.findElement(By.id("loginButton"));
		//Javascript code to click on login button
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguements[0].click()",loginButton);
		Thread.sleep(5000);
		//Javascript code to get current page title
		
		String pageTitle = js.executeScript("return document.title").toString();
		System.out.println("pageTitle");
		 
		driver.quit(); 
				

	}

}
