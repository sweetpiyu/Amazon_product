package amzonpom;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import com.Amazon_project.actionsdriver. ActionsUtility;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;
import testpackage.Productsearch;


public class Amazon_POM extends BaseAmazonClass {
	 Actions act;
	public Amazon_POM() throws IOException {
		//super();
		{
			PageFactory.initElements(driver, this);
		}
	}
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	 WebElement createacc;
	@FindBy(xpath="//span[text()='Sign in']") WebElement signinbtn;
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-newCust\"]/a") WebElement createnewaccount;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement searchbox;
	@FindBy(id="nav-search-submit-button") WebElement searchbtn;
	
	
	
	public  Signin Clikonsigninbutton() throws InterruptedException, IOException {
		
		  act=new Actions(driver);
		  act.moveToElement(createacc).build().perform(); 
		  // boolean r=signinbtn.isEnabled();
		  //System.out.println(r);
		  signinbtn.click();
		 return new Signin();
	}
	public NewAccountcreate newaccount() throws IOException
	{
		 
		Actions act1=new Actions(driver);
		act1.moveToElement(createacc).build().perform(); 
		//boolean result=createnewaccount.isEnabled();
		//System.out.println(result);
		createnewaccount.click();
		return  new NewAccountcreate();
	}
	
	public  Searchresult searchProduct(String productName) throws Throwable {
		//action.type(searchProductBox, productName);
		searchbox.sendKeys(productName);
		
		//Actions act2=new Actions(driver);
		//act2.click(searchbtn);
		searchbtn.click();
		
		
		return new  Searchresult();
	}
	
	
	
	

}
