package testpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.AddtoCart;
import amzonpom.Amazon_POM;
import amzonpom.Searchresult;
import basePackage.BaseAmazonClass;

public class AddtocartPage extends BaseAmazonClass {
	Amazon_POM Ap;
	Searchresult sr;
	AddtoCart ac;
	public AddtocartPage() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void intialsetup() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		initialize();
		//Thread.sleep(3000);
	}
	@Test
	public void Addtocarttest() throws Throwable
	{
		Ap=new Amazon_POM();
		sr=Ap.searchProduct("t-shirt");
		ac=new AddtoCart();
		ac=sr.clickon_Product();
		ac.SelectSize();
		ac.Selectqty("1");
		ac.clickonaddtocart();
		boolean result=ac.validateaddtocart();
		Assert.assertTrue(result);
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException {
		// Thread.sleep(2000);
		driver.close();
	}
}
