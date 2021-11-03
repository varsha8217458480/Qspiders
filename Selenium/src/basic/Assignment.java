package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        
        String actualTitle="actiTIME -  Enter Time-Track";
        String expectedTitle = driver.getTitle();
        
        if(expectedTitle.equals(actualTitle)) {
        	System.out.println("Pass: The Actual Title is equal to the expected title");
        }
        	else
        	{
        		System.out.println("Fail: The Actual Title is not equal to the expected title");
        	}
         Thread.sleep(5000);
        driver.findElement(By.id("logoutLink")).click();
        }
     
        
} 
