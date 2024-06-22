package HomepageScripts;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

import POM.Homepage;
import POM.login;

public class VerifyWishlistFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
						
		//Clicking on the login
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
				
		//Login action
		login Login = new login(driver);
		Login.loginAction("rajeevsharma@gmail.com", "Abc@123");
				
		//Search
		Homepage home = new Homepage(driver);
		home.SearchAction("Nikon D5500 DSLR");
		
		//Add To Wishlist Initial
		driver.findElement(By.xpath("//button[@class='button-2 add-to-wishlist-button']")).click();
		
		//Delay
		Thread.sleep(2500);
		
		//Add To Wishlist Final
		driver.findElement(By.xpath("(//button[text()='Add to wishlist'])[1]")).click();
		
		//Delay
		Thread.sleep(20000);
		
		//Click on Wishlist
		home.clickWishlist();
		
		if(driver.getPageSource().contains("Wishlist"))
		{
			System.out.println("Item is wishlisted");
			
			try {
				//Take screenshot
				TakesScreenshot sc = (TakesScreenshot) driver;
				File source = sc.getScreenshotAs(OutputType.FILE);
				File destination = new File("./search/search.png");
				Files.copy(source, destination);
				
				//Screenshot path
				System.out.println("SCREENSHOT PATH -> "+destination.getAbsolutePath());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		Thread.sleep(2000);
		driver.quit();
		}
	}
