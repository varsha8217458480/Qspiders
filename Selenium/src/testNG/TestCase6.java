package testNG;

import org.testng.annotations.Test;

public class TestCase6 {

	@Test(priority=-3)
	public void a1() {
		System.out.println("hello");
		
	}
	@Test(priority = -1)
	public void b1() {
		System.out.println("hii");
	}
	@Test(priority=6)
	public void c1() {
		System.out.println("bye");

}
}



