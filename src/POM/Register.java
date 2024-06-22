package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;
	
	//Register Button
	
	@FindBy(id="register-button")
	WebElement registerButton;
	
	public void Mgender()
	{
		male.click();
	}
	
	public void Fgender()
	{
		female.click();
	}
	
	public void ClickNewsletter()
	{
		Newsletter.click();
	}
	
	public void register(String fname, String LName, String Day, String Month, String Year, String Email, String Company_name, String Password, String confirmpassword)
	{
		FirstName.sendKeys(fname);
		LastName.sendKeys(LName);
		
		Select select_Day = new Select(day);
		select_Day.selectByVisibleText(Day);
		
		Select select_month = new Select(month);
		select_month.selectByVisibleText(Month);
		
		Select seelct_year = new Select(year);
		seelct_year.selectByVisibleText(Year);
		
		email.sendKeys(Email);
		
		Company.sendKeys(Company_name);
		
		password.sendKeys(Password);
		
		ConfirmPassword.sendKeys(confirmpassword);
		
	}
	
	public void clickRegisterButton()
	{
		registerButton.click();
	}
}
