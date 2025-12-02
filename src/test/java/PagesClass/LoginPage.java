package PagesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage {

	 private WebDriver driver;

	    

	    @FindBy(id = "email")       
	    private WebElement emailInput;

	    @FindBy(id = "password")    
	    private WebElement passwordInput;

	    @FindBy(xpath = "//button[@type='submit']")   
	    private WebElement loginButton;

	   
	    @FindBy(id = "message")    
	    private WebElement loginMessage;

	   
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	  

	    public void enterEmail(String email) {
	        emailInput.clear();
	        emailInput.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        passwordInput.clear();
	        passwordInput.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }

	    public void login(String email, String password) {
	        enterEmail(email);
	        enterPassword(password);
	        clickLogin();
	    }

	    public String getLoginMessageText() {
	        try {
	            return loginMessage.getText();
	        } catch (Exception e) {
	            return null;
	        }
	    }

	    public String getPageTitle() {
	        return driver.getTitle();
	    }

}
