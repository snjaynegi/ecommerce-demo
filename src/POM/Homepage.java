package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='My account'])[1]")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement Logout;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement Wishlist;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement ShoppingCart;
	
	@FindBy(id="small-searchterms")
	WebElement Search;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement SearchButton;
	
	@FindBy(xpath="(//a[text()='Computers '])[1]")
	WebElement Computer;
	
	@FindBy(xpath="(//a[text()='Electronics '])[1]")
	WebElement Electronics;
	
	@FindBy(xpath="(//a[text()='Digital downloads '])[1]")
	WebElement DigitalDownloads;
	
	@FindBy(xpath="(//a[text()='Books '])[1]")
	WebElement Books;
	
	@FindBy(xpath="(//a[text()='Jewelry '])[1]")
	WebElement Jewelry;
	
	@FindBy(xpath="(//a[text()='Gift Cards '])[1]")
	WebElement GiftCard;
	
	public void clickMyAccount()
	{
		MyAccount.click();
	}
	
	public void clickLogout()
	{
		Logout.click();
	}
	
	public void clickWishlist()
	{
		Wishlist.click();
	}
	
	public void clickShoppingcart()
	{
		ShoppingCart.click();
	}
	
	public void SearchAction(String searchItem)
	{
		Search.sendKeys(searchItem);
		SearchButton.click();
	}
	
	public void clickComputer()
	{
		Computer.click();
	}
	
	public void clickElectronics()
	{
		Electronics.click();
	}
	
	public void clickDigitalDownload()
	{
		DigitalDownloads.click();
	}
	
	public void clickBooks()
	{
		Books.click();
	}
	
	public void clickJewelry()
	{
		Jewelry.click();
	}
	
	public void clickGiftCard()
	{
		GiftCard.click();
	}
}
