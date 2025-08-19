package testNG;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test 
	public void signup() {
		System.out.println("Signup!");
	}
	
	@Test (dependsOnMethods = "signup",priority =-2 )

	public void login() {
		System.out.println("login!");
	}
	
	@Test (dependsOnMethods = "login")

	public void searchProduct() {
		System.out.println("search product!");
	}
	
	@Test (dependsOnMethods = "searchProduct")

	public void addToCart() {
		System.out.println("Add to cart!");
		throw new RuntimeException();// to fail this case
	}
	
	@Test (dependsOnMethods = "addToCart")

	public void signout() {
		System.out.println("Sign out!");
	}//pass 3, fail 1 , skips 1

}
