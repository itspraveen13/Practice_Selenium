package testNG;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test (priority = 1)
	public void signup() {
		System.out.println("Signup!");
	}
	
	@Test (priority = 2)

	public void login() {
		System.out.println("login!");
	}
	
	@Test (priority = 3)

	public void searchProduct() {
		System.out.println("search product!");
	}
	@Test (priority = 4)

	public void addToCart() {
		System.out.println("Add to cart!");
	}
	@Test (priority = -10)

	public void signout() {
		System.out.println("Sign out!");
	}

}
