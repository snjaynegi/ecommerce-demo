package HomepageScripts;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import POM.Homepage;
import POM.login;

public class VerifySearchFunctionality {

	public static void main(String[] args) {

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
		
		//Javascript executor 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Webelement
		WebElement product_title = driver.findElement(By.xpath("//a[text()='Nikon D5500 DSLR']"));
		
		if(driver.getPageSource().contains("Nikon D5500 DSLR"))
		{
			//To print searched product title
			System.out.println("Product is present:-> "+product_title.getText());
			js.executeScript("arguments[0].scrollIntoView(false)",product_title);
			
			try 
			{	
				//Take screenshot
				TakesScreenshot sc = (TakesScreenshot) driver;
				File source = sc.getScreenshotAs(OutputType.FILE);
				File destination = new File("./search/search.png");
				Files.copy(source, destination);
				
				//Screenshot path
				System.out.println("SCREENSHOT PATH -> "+destination.getAbsolutePath());
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
	
}
