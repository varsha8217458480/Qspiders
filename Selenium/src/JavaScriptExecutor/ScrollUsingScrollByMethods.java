package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingScrollByMethods {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe" );
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@class='col-12-12 _2oO9oE']"));
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			js.executeScript("window.scrollBy(0-200)");
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(100,0)");
			js.executeScript("window.scrollBy(-100,0)");
			
			

	}

}
