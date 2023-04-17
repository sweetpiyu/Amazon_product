package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Homepage extends BaseAmazonClass{
	 Actions act;
	 
	public Homepage() throws IOException {
		super();
		{
			PageFactory.initElements(driver, this);
		}
	}
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]") WebElement createacc;
	@FindBy(id="nav-link-accountList-nav-line-1") WebElement helloname;
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span") WebElement YourAccount;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2") WebElement YorOreders;
	@FindBy(xpath="//h2[contains(text(),'Your Payments')]") WebElement addPayment;
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[5]/span") WebElement primemembership;
	@FindBy(linkText="Buy Again") WebElement BuyAgain;
	@FindBy(linkText="Not Yet Shipped") WebElement notyetshipped;
	@FindBy(linkText="Cancelled Orders") WebElement cancelorder;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2") WebElement youraddress;
	@FindBy(xpath="//*[@id=\"ya-myab-address-add-link\"]/div/div") WebElement Addaddress;
	public Homepage getDetails() throws InterruptedException, IOException {
		  Actions act=new Actions(driver);
		  act.moveToElement(createacc).build().perform(); 
		  YourAccount.click();
		  Thread.sleep(3000);
		//driver.navigate().to("https://www.amazon.ca/gp/css/homepage.html?ref_=nav_AccountFlyout_ya");
		  return new Homepage();
		 
	}
	public void Primedetails() throws InterruptedException {
		primemembership.click();
		//Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.ca/gp/primecentral?ref_=nav_AccountFlyout_prime");
	}
	
	  public Homepage your_orders() throws InterruptedException, IOException { 
		  // Actions act=newActions(driver); //act.moveToElement(createacc).build().perform();
	  YorOreders.click(); 
	  Thread.sleep(3000); 
	 // driver.navigate().to("https://www.amazon.ca/gp/your-account/order-history?ref_=ya_d_c_yo"); }
	 return new Homepage();
	  }
	  public Homepage BuyAgaindata() throws IOException {
			
			BuyAgain.click();
			//driver.navigate().to("https://www.amazon.ca/gp/buyagain?ref_=ppx_yo2ov_dt_b_tb_buy_again");
			return new Homepage();
		}
	  public Homepage Notyetshippeddata() throws IOException {
			
		  notyetshipped.click();
			//driver.navigate().to("https://www.amazon.ca/gp/buyagain?ref_=ppx_yo2ov_dt_b_tb_buy_again");
			return new Homepage();
		}
	  public Homepage cancelorderdata() throws IOException {
			
		  cancelorder.click();
			//driver.navigate().to("https://www.amazon.ca/gp/buyagain?ref_=ppx_yo2ov_dt_b_tb_buy_again");
			return new Homepage();
		}
	  public Your_Address clickonaddress() throws IOException {
			youraddress.click();
			return new Your_Address();
		}
	  public PaymentInfo clickonaddpayment() throws IOException {
		  addPayment.click();
			return new PaymentInfo();
		}
	  
	  public Addadressinfo addadressdata() throws IOException {
		  Addaddress.click();
		  return new Addadressinfo ();
	  }
}

