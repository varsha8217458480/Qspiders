package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTheValuesToDisabledField {

}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	WebElement disabledField=driver.findElement(By.xpath("//input[@class='form-control']"));
	driver.get("https://www.demoapp.skillrary.com/");
	Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	js.executeScript("arguements[0].value='qspiders'", disabledField);
}
}
