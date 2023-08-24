package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperLoginPage {

	
	@FindBy(id="Email")
	private WebElement emailTF;
	@FindBy(id="Password")
	private WebElement passwordTF;
	@FindBy(name="Login")
	private WebElement loginButton;
	@FindBy(id="Create Account")
	private WebElement createAccountButton;
	
	//Initialization
	public ShopperLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void loginToApp(String email,String password) {
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
	    loginButton.click();
	}
	
	
	
	
	
	
	
}
