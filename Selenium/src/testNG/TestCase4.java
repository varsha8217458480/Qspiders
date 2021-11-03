package testNG;

import java.util.concurrent.TimeUnit;
//test case will get failed, if execution is not completed within given time limit
//time limit is in milli seconds

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4 {

	public class TestCase3 {
		@Test(timeOut= 2000)
		public void demo() {
			
			System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://actitime.com/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
	        driver.findElement(By.id("loginButton")).click();
			
			driver.findElement(By.id("loginLink")).click();
			driver.quit();
}
