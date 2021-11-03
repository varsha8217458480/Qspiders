package TestNG;

import org.testng.annotations.Test;

public class Group2 {
	
	@Test(groups = {"SmokeTestCase"})
	public void sample3() {
		System.out.println("This is smoke testing of group 2");
	}
	
	@Test(groups = {"IntegrationTestCase"})
	public void sample4() {
		System.out.println("This is integration testing of group 2");
	}

}
