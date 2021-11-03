package dropDownOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://denoqa.com/select-menu");
		WebElement dropDown = driver.findElement(By.xpath("//cars"));
		
		Select select = new Select(dropDown);
		
		select.selectByIndex(0);
		select.selectByIndex(1);
		
		WebElement firstElement = select.getFirstSelectedOption();
		System.out.println(firstElement.getText());
		
		List<WebElement> allElement = select.getFirstSelectedOption();
		for(WebElement element:allElement) {
			System.out.println(element.getText());
			
		

		}
		driver.quit();
	}

	}

}
