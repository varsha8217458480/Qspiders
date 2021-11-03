package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeTheWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.quit();  
		
	}

}
