package testNG;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnAttribute2 {
	@Test (enabled = false)
	//@Test (enabled =false, alwaysRun = true)in this case enabled will suppresses the alwaysRun and will not execute as expected
	public void signup() {
		System.out.println("Signup 2!");
	}

	@Test (dependsOnMethods = "testNG.LearnAttributes.addToCart")
	public void checkout() {
		System.out.println("checkout!");
	}

	@Test (priority = 6, description = "This is used to do the payment")

	public void payment() {
		System.out.println("payment!");
	}

	@Test (priority = 7)

	public void trackOrder() {
		System.out.println("track Order!");
		throw new NoSuchElementException("Element not found!, stoped intentionaly");
	}

	@Test (dependsOnMethods = "trackOrder", alwaysRun = true)

	public void onTheWay() {
		System.out.println("on the way!");
	}
	@Test (priority = 9)

	public void delivered() {
		System.out.println("Delivered!");
	}

}
