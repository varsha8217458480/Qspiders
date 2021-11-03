package TestNG;
import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = {"SmokeTestCase"})
	public void sample1() {
		System.out.println("This is smoke testing");
	}
	
	@Test(groups = {"IntegrationTestCase"})
	public void sample2() {
		System.out.println("This is integration testing");
	}
}
