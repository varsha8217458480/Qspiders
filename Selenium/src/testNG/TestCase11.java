package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
//add the comments to report and to print it in console
public class TestCase11 {
	@Test
	public void login() {
		System.out.println("text case");
		Reporter.log("its reporter class");
				Reporter.log("test case id:001", true);
	}

}
