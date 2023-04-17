package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class AddtoCart extends  BaseAmazonClass {

	public AddtoCart() throws IOException {
		super();
		{
			PageFactory.initElements(driver, this);
		}
	}
	@FindBy(xpath="//*[@id='quantity']") WebElement pqty;
	@FindBy(xpath="//*[@id=\"size_name_0\"]/span") WebElement psize;
	@FindBy(id="add-to-cart-button") WebElement addtocartbutton;
	@FindBy(xpath="//span[contains(text(),'Added to Cart')]") WebElement addtocartmsg;
	@FindBy(id="proceed-to-checkout-action") WebElement checkoutntn;
	
	public void clickonaddtocart()
	{
		addtocartbutton.click();
	}
	
	public boolean validateaddtocart() throws InterruptedException 
	{
		Thread.sleep(3000);
		return addtocartmsg.isDisplayed();
	}
	public Orderpage clickonproceedtocheckout() throws IOException
	{
		checkoutntn.click();
		return new Orderpage();
	}
	public void SelectSize()throws InterruptedException {
		psize.click();
	}
	public void Selectqty(String pq) throws InterruptedException {
		Select no= new Select(pqty);
		//Thread.sleep(3000);
		no.selectByVisibleText(pq);
		//no.selectByValue(pq);
	}
	
}
