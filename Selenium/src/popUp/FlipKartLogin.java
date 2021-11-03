package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver diver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath(//input[@class='_2IX_2- VJZDxU']")).sendKeys("varsha")
		driver.findElemeNT("")).click();
		driver.findElement(By.name("Send")).click();
		
		Alert alert =driver.switchTo().alert();
	    alert.accept();
		driver.quit();


}
