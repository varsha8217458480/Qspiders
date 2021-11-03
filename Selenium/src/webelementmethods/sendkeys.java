package webelementmethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.naukri.com/");
     driver.manage().window().maximize();
     
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    System.out.println(driver.getWindowHandles());
    
    
   Dimension variable = driver.manage().window().getSize();
   System.out.println( variable.height);
   System.out.println(variable.width);
   
  Point variable3 = new Point(589,1000);
   
    driver.manage().window().setPosition(variable3);
	
	//driver.quit();
	
	}
   
    
    
   
     
     
	}


