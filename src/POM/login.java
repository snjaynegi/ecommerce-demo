package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='email']")
	WebElement Email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="RememberMe")
	WebElement RememberMe;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	WebElement Forgot_password;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement login_button;
	
	@FindBy(xpath="//button[text()='Register']")
	WebElement Register;
	
	public void loginAction(String email, String password)
	{
		Email.sendKeys(email);
		Password.sendKeys(password);
		login_button.click();
	}
	
	public void newUser()
	{
		Register.click();
	}
	
	
}
