package testNG;

import org.testng.annotations.Test;

//wecan give the priorities for the test cases

//  default priority is zero
//lowest piority will execute first, if priority is not given or priorities are same--

//
public class TestCase {
	@Test(priority = 0)
	public void a1() {
		System.out.println("hi");
	}
	@Test(priority = -1)
	public void b1() {
		System.out.println("hello");
	}
	@Test(priority = 2)
	public void c1() {
		System.out.println("hhey");
	}

}
