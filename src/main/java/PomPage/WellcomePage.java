package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WellcomePage
{
	//Declaration
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	//Initialization
	public WellcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public void clickLoginButton() {
		loginButton.click();
	}
}
