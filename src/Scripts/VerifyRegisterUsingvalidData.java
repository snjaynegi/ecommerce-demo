package Scripts;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import POM.Register;

public class VerifyRegisterUsingvalidData {

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
		register.ClickNewsletter();
		register.clickRegisterButton();
		
		if(driver.getPageSource().contains("Your registration completed"))
		{
			System.out.println("Account created");
			try {
				TakesScreenshot sc = (TakesScreenshot) driver;
				File source = sc.getScreenshotAs(OutputType.FILE);
				File destination = new File("./search/search.png");
				Files.copy(source, destination);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Action not created!!!!");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
