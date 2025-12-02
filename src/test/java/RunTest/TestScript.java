package RunTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PagesClass.LoginPage;
import PagesClass.RegisterPage;

public class TestScript extends BaseClass {

	@Test
	public void validLoginTest() {
		LoginPage loginPage = new LoginPage(driver);

		// Use valid credentials (whatever the site expects)
		String validEmail = "test@tutorialspoint.com";
		String validPassword = "Test@123";

		loginPage.login(validEmail, validPassword);

		// Example assertion: based on message or navigation
		String msg = loginPage.getLoginMessageText();
		System.out.println("Login message: " + msg);

		// Adjust expected text according to actual application behavior
		Assert.assertTrue(msg != null && msg.toLowerCase().contains("success"),
				"Login success message not displayed as expected");
	}

	@Test
	public void invalidLoginTest() {
		LoginPage loginPage = new LoginPage(driver);

		loginPage.login("wrong@user.com", "WrongPass");

		String msg = loginPage.getLoginMessageText();
		System.out.println("Login message: " + msg);

		Assert.assertTrue(msg != null && msg.toLowerCase().contains("invalid"),
				"Error message not displayed for invalid login");
	}

}
