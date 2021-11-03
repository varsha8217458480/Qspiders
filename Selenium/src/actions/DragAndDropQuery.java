package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropQuery {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driber","./driver/chromedriver.exe");
	
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		WebElement box = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(box, 200, 50).perform();
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		System.out.println(text);
		
		
		
		
	}

}
