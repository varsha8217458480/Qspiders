package testNG;

import org.testng.annotations.Test;

public class TestCase10 {
	
	@Test(enabled=false)
	public void a1() {
		System.out.println("hi");
		
	}
	@Test(invocationCount = 0)
	public void a2() {
		System.out.println("hi");
	}
	@Test(invocationCount=-1)
	public void a3() {
		System.out.println("bye");


}
}
