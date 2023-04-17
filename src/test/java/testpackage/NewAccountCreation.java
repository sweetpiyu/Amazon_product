package testpackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.Amazon_POM;
import amzonpom.Homepage;
import amzonpom.NewAccountcreate;
import amzonpom.Signin;
import basePackage.BaseAmazonClass;

public class NewAccountCreation extends BaseAmazonClass {
	Amazon_POM Ap;
	Signin sign; 
	NewAccountcreate Nac;
	Homepage hp;
	public NewAccountCreation() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void intialsetup() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		initialize();
		//Thread.sleep(3000);
	}
	@Test
	  public void accountcreation() throws IOException, InterruptedException {
		Ap =new Amazon_POM ();
		Nac=Ap.newaccount();
		Nac.getdata("priyanka","xyz@gmail.com", "abcdef", "abcdef");
		//hp=Nac.clickoncontinuebutton();
		}
	@Test
	public void ac1() {
		
		
	}
	 @AfterMethod
		public void closebrowser() throws InterruptedException {
			 Thread.sleep(3000);
			driver.close();
		}


}
