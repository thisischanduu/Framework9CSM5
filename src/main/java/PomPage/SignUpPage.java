package PomPage;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    @FindBy(id="First Name")
    private WebElement firstNameTF;
    
    @FindBy(id="Last Name")
    private WebElement lastNameTF;
     
    @FindBy(xpath="//div[@id='Gender']/descendant::label/span[2]")
    private List<WebElement> genderRadioButton ;
    
    @FindBy(id="phone Number")
    private WebElement phoneNumberTF;
    
    @FindBy(id="Email Address")
    private WebElement emailAddressTF;
    
    @FindBy(id="password")
    private WebElement passwordTF;
    
    @FindBy(id="Confirm password")
    private WebElement confirmPasswordTF;
   
    @FindBy(id="Terms and Conditions")
    private WebElement termsAndConditionsCB;
    
    @FindBy(id="Register")
    private WebElement registerButton;

    //Initialization
    public SignUpPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);	
    
     }
    
    //Utilization
    public void createUserAccount(String firstname,String lastname,String expectedgender,String phoneNum,String email,String password) {
    	   firstNameTF.sendKeys(firstname);
    	   lastNameTF.sendKeys(lastname);
    	    for(WebElement element:genderRadioButton) {
    	    	String gender=element.getText();
    	    	if(gender.equals(expectedgender)) {
    	    			element.click();
    	    	break;
    	    }
        }
    
    phoneNumberTF.sendKeys(phoneNum);
    emailAddressTF.sendKeys(email);
    passwordTF.sendKeys(password);
    confirmPasswordTF.sendKeys(password);
    termsAndConditionsCB.click();
    registerButton.click();
}
}