package testNG;

import org.testng.annotations.Test;

public class Groups {
	@Test (priority = 1, groups = {"Smoke"})
	public void signup() {
		System.out.println("Signup!");
	}
	
	@Test (priority = 2,groups = {"Smoke"})

	public void login() {
		System.out.println("login!");
	}
	
	@Test (priority = 3,groups = {"Regression"})

	public void searchProduct() {
		System.out.println("search product!");
	}
	@Test (priority = 4,groups = {"Regression"})

	public void addToCart() {
		System.out.println("Add to cart!");
	}
	@Test (priority = -10,groups = {"EndToEnd"})

	public void signout() {
		System.out.println("Sign out!");
	}

}
