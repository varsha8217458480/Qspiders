package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllTheColumns {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
Webdriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts.implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.marimallappawomenscollege.org/");
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.name("Send")).click();
		
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("");
	
		alert.accept();
		driver.quit();




}
