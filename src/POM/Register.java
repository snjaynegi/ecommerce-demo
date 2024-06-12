package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Your Personal Details
	
	@FindBy(xpath="//input[@value='M']")
	WebElement male;
	
	@FindBy(xpath="//input[@value='F']")
	WebElement female;
	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	@FindBy(id="LastName")
	WebElement LastName;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement day;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement month;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement year;
	
	@FindBy(id="Email")
	WebElement email;
	
	//Company Details
	
	@FindBy(id="Company")
	WebElement Company;
	
	//Options
	
	@FindBy(id="Newsletter")
	WebElement Newsletter;
	
	//Your Password
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;
	
	//Register Button
	
	@FindBy(id="register-button")
	WebElement registerButton;
}
