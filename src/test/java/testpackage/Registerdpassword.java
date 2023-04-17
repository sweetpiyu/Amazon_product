package testpackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.Amazon_POM;
import amzonpom.Homepage;
//import amzonpom.NewAccountcreate;
import amzonpom.Signin;
import amzonpom.existinguserPassword;
import basePackage.BaseAmazonClass;

public class Registerdpassword extends BaseAmazonClass {
	Amazon_POM Ap;
	Signin sign; 
	existinguserPassword ep;
	Homepage hp;
	public Registerdpassword() throws IOException {
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
	public void retrivedata() throws IOException, InterruptedException {
		Ap =new Amazon_POM ();
		sign=Ap.Clikonsigninbutton();
		String s=p.getProperty("username");
		//System.out.println(s);
		 if (s == "")
		  {
		  System.out.println("Enter your e-mail address or mobile phone number"); 
		  } 
		 else {
			 
			 ep=sign.login1(s);
			 }
		 }
		 
 @AfterMethod
		public void closebrowser() throws InterruptedException {
			 Thread.sleep(2000);
			driver.close();
		}
}
