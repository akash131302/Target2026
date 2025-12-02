package PagesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class RegisterPage extends BaseClass {

	private WebElement textBoxFiName = driver.findElement(By.xpath("//input[@name='firstname']"));

	private WebElement textBoxLastName = driver.findElement(By.xpath("//input[@name='lastname']"));

	private WebElement textBoxUserName = driver.findElement(By.xpath("//input[@name='username']"));

	private WebElement textBoxPassd = driver.findElement(By.xpath("//input[@name='password']"));

	private WebElement registerBtn = driver.findElement(By.xpath("//input[@value='Register']"));

	public void RegisterPage1(String Fname, String Lanme, String Uname, String pasd) {

		textBoxFiName.sendKeys(Fname);
		textBoxLastName.sendKeys(Lanme);
		textBoxUserName.sendKeys(Uname);
		textBoxPassd.sendKeys(pasd);
		registerBtn.click();

	}

}
