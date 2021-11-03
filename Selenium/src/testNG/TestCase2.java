package testNG;

import java.util.concurrent.TimeUnit;

//execute same test case multiple times using invocation count
//TextPool
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestCase2 {
@Test(invocationCount=2)
public void demo() {
	
	System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts()implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElements("loginButton").click();
	
	//driver.findElement(By.id("logoutLink")).click();
	driver.quit();
	
	
	
}

private void implicitlyWait(int i, TimeUnit seconds) {
	// TODO Auto-generated method stub
	
}
}
