package ScreenShot;

import java.time.LocalDateTime;

public class ScreenShotWebPage {

	public static void main(String[] args) {
		
	
		String timeStamp = LocalDateTime.now().toString().replace(":","-");
		System.out.println(timeStamp);
		
		//driver.quit();
		
		

	}

}
