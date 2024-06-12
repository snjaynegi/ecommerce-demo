package testscript;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyurl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
		String Expected = "https://demo.nopcommerce.com/";
		
		if(driver.getCurrentUrl().equals(Expected))
		{
			System.out.println("URL Verified: "+ driver.getCurrentUrl());
		}
		else
		{
			System.out.println("URL not verified!!!");
		}
		
		Thread.sleep(1500);
		
		driver.quit();
	}
}
