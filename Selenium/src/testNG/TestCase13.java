package testNG;

import org.testng.annotations.Test;

public class TestCase13 {

	@Test()
	public void login() {
		System.out.println("hi");
		throw new ArithmeticException();
		
	}
	@Test(dependsOnMethods = "login")
	public void cart() {
		System.out.println("hello");
	}
	@Test(dependsOnMethods = "cart")
	public void logout() {
		System.out.println("heyy");

}

}