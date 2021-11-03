package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
		WebDriver driver = new ChromeDriver;
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		List <webElement> navBar = driver.findElements(By.xpath("//ul[@class=\"navbar-nav mr-4 mb-2 mb-lg-0 pl-4 pl-lg-2\"]/li"]));
				Actions action = new Actions(driver);
				action.keyDown(Keys.CONTROL);
				for(WebElement ele:navBar) {
					action.click(ele);
					
				}
	action.keyUp(Keys.CONTROL);
	action.perform();
	

	}

}
