package POMClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import demoactitimePom.LoginPage;

public class TestCase3 {

	public static void main(String[] args) throws Throwable {
		String filePath = "./resources/prop.properties";
		FileInputStream file = new FileInputStream(filePath);
		
		Properties property = new Properties();
		property.load(file);
		
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.getTitle();
		
		LoginPage login = new LoginPage(driver);
		login.login(username, password);
		login.getDetails();
		
		driver.quit();
	}

}
