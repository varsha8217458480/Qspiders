package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUpUsingSendKeys {

			public static void main(String[] args) {
				String date="Sun Oct 24 2021";
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.get("https://www.cleartrip.com/");
				driver.findElement(By.xpath("//div[class='fsw_inputBox dates inactiveWidget ']")).click();
				
				driver.findElement(By.name("//div[@aria-label='+date+'")).click();
				
				
				driver.quit();

	}

}
