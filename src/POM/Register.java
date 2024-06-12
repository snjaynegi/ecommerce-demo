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
	
	@FindBy(xpath="//input[@value='M']")
	WebElement male;
	
	@FindBy(xpath="//input[@value='F']")
	WebElement female;
	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	@FindBy(id="LastName")
	WebElement LastName;
}
