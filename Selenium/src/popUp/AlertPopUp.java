package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver diver= new ChromeDriver();
		WebDriver driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demoqa.com/");
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();
		
		
		
		
		

	}

}
