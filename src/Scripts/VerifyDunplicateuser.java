package Scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Register;

public class VerifyDunplicateuser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
		//Click on Register button on the welcome page
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		Register register = new Register(driver);
		register.Mgender();
		register.register("rajeev", "sharma", "20", "April", "2000", "rajeevsharma@gmail.com", "Abc", "Abc@123", "Abc@123");
		//TO uncheck the Newsletter
		register.ClickNewsletter();
		register.clickRegisterButton();
		
		if(driver.getPageSource().contains("The specified email already exists"))
		{
			System.out.println("User aleready exist");
		}
		else
		{
			System.out.println("User doesn't exist!!!");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
