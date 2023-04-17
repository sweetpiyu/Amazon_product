package testpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amzonpom.Amazon_POM;
import amzonpom.Homepage;
import amzonpom.Searchresult;
import amzonpom.Signin;
import amzonpom.existinguserPassword;
import basePackage.BaseAmazonClass;
import testdata.Excelsheet;

public class Productsearch extends BaseAmazonClass {
	Amazon_POM Ap;
	Signin sign; 
	existinguserPassword ep;
	Homepage hp;
	Searchresult sr;
	
	public Productsearch() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void intialsetup() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		initialize();
		//Thread.sleep(3000);
	}
	
	
	@Test()
	public void getProductDetails() throws Throwable
	{
		Ap =new Amazon_POM ();
		//sign=Ap.Clikonsigninbutton();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		//ep=sign.login1(p.getProperty("username"));
		//String g=p.getProperty("password");
		//hp=ep.gotohomepage(g);
		 sr= new Searchresult();
		boolean result=sr.isProductAvailable();
		Assert.assertTrue(result);
		sr.produchsearch("t-shirt");
		//sr.productperpagetest();
		}
		@Test
		public void itemsortdata() throws IOException
		{
			//Ap =new Amazon_POM ();
			sr= new Searchresult();
			sr.produchsearch("t-shirt");
			sr.Product_sort();
		}
		
	 @AfterMethod
		public void closebrowser() throws InterruptedException {
			// Thread.sleep(2000);
			driver.close();
		}

}
