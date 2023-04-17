package testpackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.Amazon_POM;
import amzonpom.Homepage;
import amzonpom.Signin;
import amzonpom.existinguserPassword;
import basePackage.BaseAmazonClass;

public class Homepagetest extends BaseAmazonClass  {
	Amazon_POM Ap;
	Signin sign; 
	existinguserPassword ep;
	Homepage hp;
	public Homepagetest() throws IOException {
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
	public void validateuserdetails() throws IOException, InterruptedException {
		Ap =new Amazon_POM ();
		sign=Ap.Clikonsigninbutton();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		ep=sign.login1(p.getProperty("username"));
		String g=p.getProperty("password");
		hp=ep.gotohomepage(g);
		hp.getDetails();
	}

	
	
	  @Test public void getussername() throws IOException, InterruptedException {
	  Ap =new Amazon_POM (); sign=Ap.Clikonsigninbutton();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(1000); ep=sign.login1(p.getProperty("username")); String
	  g=p.getProperty("password"); hp=ep.gotohomepage(g); hp.getDetails();
	  hp.your_orders(); }
	 
	@Test
	public void getprimemembership() throws IOException, InterruptedException
	{
		Ap =new Amazon_POM ();
		sign=Ap.Clikonsigninbutton();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		ep=sign.login1(p.getProperty("username"));
		String g=p.getProperty("password");
		hp=ep.gotohomepage(g);
		hp.getDetails();
		Thread.sleep(3000);
		hp.Primedetails();
	}
	 
	 @AfterMethod
		public void closebrowser() throws InterruptedException {
			 Thread.sleep(2000);
			driver.close();
		}
}
