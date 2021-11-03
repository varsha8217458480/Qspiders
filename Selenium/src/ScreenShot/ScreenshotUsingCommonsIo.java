package ScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotUsingCommonsIo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		Object outputType;
		File.tempFile =  driver.findElement(By.xpath("//div[@class='loginButton'")).getScreenshotAs(outputType.FILE);
		 
		
				}

}
