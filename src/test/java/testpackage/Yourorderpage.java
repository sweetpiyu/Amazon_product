package testpackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.Amazon_POM;
import amzonpom.Homepage;
import amzonpom.Signin;
//import amzonpom.YoursOrders;
import amzonpom.existinguserPassword;
import basePackage.BaseAmazonClass;

public class Yourorderpage extends  BaseAmazonClass {
	Amazon_POM Ap;
	Signin sign; 
	existinguserPassword ep;
	Homepage hp;
	//YoursOrders yourorder;
	public Yourorderpage() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void intialsetup() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		initialize();
		//Thread.sleep(3000);
	}
	
	
	
	  @Test(priority=1) public void getusername() throws IOException, InterruptedException {
	  Ap =new Amazon_POM (); 
	  sign=Ap.Clikonsigninbutton();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(1000); 
	  ep=sign.login1(p.getProperty("username")); 
	  String g=p.getProperty("password"); 
	  hp=ep.gotohomepage(g); 
	  hp.getDetails();
	  hp.your_orders();
	 // op.BuyAgaindata();
	  }
	  @Test(priority=2)
	  public void BuyAgain() throws IOException, InterruptedException {
		  Ap =new Amazon_POM (); 
		  sign=Ap.Clikonsigninbutton();
		  Thread.sleep(1000); 
		  ep=sign.login1(p.getProperty("username")); 
		  String g=p.getProperty("password"); 
		  hp=ep.gotohomepage(g); 
		  hp.getDetails();
		  hp.your_orders();
		  hp.BuyAgaindata();
		  //hp.Notyetshippeddata();
		  //hp.cancelorderdata();
	  }

		
		  @Test(priority=3) public void NotShipped() throws IOException, InterruptedException { Ap
		  =new Amazon_POM (); sign=Ap.Clikonsigninbutton(); Thread.sleep(1000);
		  ep=sign.login1(p.getProperty("username")); String
		  g=p.getProperty("password"); hp=ep.gotohomepage(g); hp.getDetails();
		  hp.your_orders(); 
		 // hp.BuyAgaindata(); 
		  hp.Notyetshippeddata();
		  //hp.cancelorderdata(); 
		  }
		  
		  @Test(priority=4) public void canceloreder() throws IOException, InterruptedException {
		  Ap =new Amazon_POM (); sign=Ap.Clikonsigninbutton(); Thread.sleep(1000);
		  ep=sign.login1(p.getProperty("username")); String
		  g=p.getProperty("password"); hp=ep.gotohomepage(g); hp.getDetails();
		  hp.your_orders(); // hp.BuyAgaindata(); //hp.Notyetshippeddata();
		  hp.cancelorderdata(); }
		 
	 @AfterMethod
		public void closebrowser() throws InterruptedException {
			// Thread.sleep(1000);
			driver.close();
		}

}
