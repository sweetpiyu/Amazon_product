package testpackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.Amazon_POM;
import amzonpom.Homepage;
import amzonpom.PaymentInfo;
import amzonpom.Signin;
import amzonpom.UserPayement;
import amzonpom.existinguserPassword;
import basePackage.BaseAmazonClass;

public class PaymentInfopage extends BaseAmazonClass  {
	Amazon_POM Ap;
	Signin sign; 
	existinguserPassword ep;
	Homepage hp;
	public PaymentInfopage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void intialsetup() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		initialize();
		
	}
	@Test
	public void getpaymentinfo() throws IOException, InterruptedException
	{
		 Ap =new Amazon_POM (); 
		  sign=Ap.Clikonsigninbutton();
		  Thread.sleep(1000); 
		  ep=sign.login1(p.getProperty("username")); 
		  String g=p.getProperty("password"); 
		  hp=ep.gotohomepage(g); 
		  hp.getDetails();
		  hp.clickonaddpayment();
		  PaymentInfo pinfo=new PaymentInfo(); 
		  pinfo.addPayemntdata();
		  UserPayement up=new UserPayement();
		  up.add_cardnumber("4987654321098769");
		  up.add_cardname("ABC");
		  up.add_cardsecuritycode("100");
		 // up.clickonaddcard();
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException {
	driver.close();
	}
}
