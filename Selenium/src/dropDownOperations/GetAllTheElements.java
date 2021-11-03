package dropDownOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllTheElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropDown = driver.findElement(By.xpath("//select"));
		
		
		Select select = new Select(dropDown);
		Select select = new Select(dropDown);
		List<WebElement> list = select.getOptions();
		for(WebElement element:list) {
			System.out.println(element.getText());
			
		
	
		}
		driver.quit();

	}

}
