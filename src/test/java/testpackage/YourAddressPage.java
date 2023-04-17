package testpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.Addadressinfo;
import amzonpom.Amazon_POM;
import amzonpom.Homepage;
import amzonpom.Signin;
import amzonpom.Your_Address;
import amzonpom.existinguserPassword;
import basePackage.BaseAmazonClass;

public class YourAddressPage extends BaseAmazonClass {
	Amazon_POM Ap;
	Signin sign; 
	existinguserPassword ep;
	Homepage hp;
	Your_Address ya;
	String fname,address1,address2,city,pcode,province;
	//Addadressinfo ai; 
	public YourAddressPage() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void intialsetup() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		initialize();
		//Thread.sleep(3000);
	}
	@Test
	public void clickonyouraddress() throws IOException, InterruptedException {
		 Ap =new Amazon_POM (); 
		  sign=Ap.Clikonsigninbutton();
		  Thread.sleep(1000); 
		  ep=sign.login1(p.getProperty("username")); 
		  String g=p.getProperty("password"); 
		  hp=ep.gotohomepage(g); 
		  hp.getDetails();
		  hp.clickonaddress();
		  hp.addadressdata();
		  Addadressinfo ai=new Addadressinfo();
		 // ai.addressinfo("Nakshat Patel","20","Tanasi road","brampton","Ontario","L6X0K4");
		  ai.GetName("Nakshat Patel");
		  ai.Getphonenumber("955-206-5449");
		  ai.GetAddress1("20");
		  ai.GetAddress2("Tanasi Road");
		  ai.GetAcity("Brampton");
		  ai.GetProvince();
		  ai.Getzipcode("L6X0K4");
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  ai.clickonaddaddress();
		  ai.clickonChkbox();
		}
	
	 @AfterMethod
		public void closebrowser() throws InterruptedException {
			// Thread.sleep(1000);
			driver.close();
		}
}
