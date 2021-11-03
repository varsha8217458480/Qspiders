package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyPopUp {

			public static void main(String[] args) {
				String expectedTitle = "Life Insurance Corperation Of India";
				
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver diver= new ChromeDriver();

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://licindia.in/");
				driver.findElement(By.xpath("//b[text()='Pay Direct (Without login)']")).click();
				Alert alert =driver.switchTo().alert();
                alert.accept();
                //Thread.sleep(2000);
                
                String actualTitle= driver.getTitle();
                
				Object expectedTitle1;
				if(expectedTitle1.equals(actualTitle));
				{
					System.out.println("navigating to next window");
					
				} else {
					System.out.println("fail");
					
				}
				
                driver.quit();
                


	}

}
