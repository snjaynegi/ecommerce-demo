package HomepageScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import POM.Homepage;
import POM.login;

public class VerifyLogout {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
		//Clicking on the login
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
				
		//Clicking on the login
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		login Login = new login(driver);
		Login.loginAction("rajeevsharma@gmail.com", "Abc@123");
		
		Homepage home = new Homepage(driver);
		home.clickLogout();
		
		if(driver.getPageSource().contains("Log in"))
		{
			System.out.println("Logout successful");
			
			try 
			{
				TakesScreenshot sc = (TakesScreenshot) driver;
				File source = sc.getScreenshotAs(OutputType.FILE);
				File destination = new File("./search/search.png");
				Files.copy(source, destination);
				System.out.println("Screenshot :"+destination.getAbsolutePath());
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Logout Failed!!!");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
