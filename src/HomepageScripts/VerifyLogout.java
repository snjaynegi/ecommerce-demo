package HomepageScripts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		}
		else
		{
			System.out.println("Logout Failed!!!");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
