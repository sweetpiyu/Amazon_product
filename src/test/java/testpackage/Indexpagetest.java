package testpackage;

import java.io.IOException;

//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.Amazon_POM;
import basePackage.BaseAmazonClass;

public class Indexpagetest extends BaseAmazonClass {
	Amazon_POM Ap;
	public Indexpagetest() throws IOException {
		super();
		}

	@BeforeMethod
	public void intialsetup() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		initialize();
		//Thread.sleep(3000);
	}
	@Test
	
	  public void logintest() throws IOException, InterruptedException { 
		Ap =new Amazon_POM ();
		Ap.Clikonsigninbutton();
		
		
	 }
	@Test
	public void newaccount() throws IOException
	{
		Ap =new Amazon_POM ();
		Ap.newaccount();
		
	}
	 
	 @AfterMethod
	public void closebrowser() throws InterruptedException {
		// Thread.sleep(2000);
		driver.close();
	}

}
