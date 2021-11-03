package ScreenShot;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfWebElements {

	private static final String Output = null;

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	File tempFile= driver.findElement(By.xpath("https://www.saucedemo.com/")).getScreenshotAs(OutputType.FILE);
	String timeStamp = LocalDateTime.now().toString().replace(":","-");
	File destfile = new File("./screenshot/"+timeStamp+"robot.png");
	tempFile.remaneTo(destfile);
	
	
	 driver.quit();
	 
	
	
	}

}
