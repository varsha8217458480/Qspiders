package basic;

import org.openqa.selenium.chrome.ChromeDriver;

interface Test1 {
	int a=21;
	int b=25;
	abstract public int test();
	 
	public static void main(String[] args) { 
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 
	 
	
		
	}

}
