package testpackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amzonpom.Amazon_POM;
import amzonpom.Homepage;
import amzonpom.LoginInfo;
import amzonpom.Signin;
import amzonpom.existinguserPassword;
import basePackage.BaseAmazonClass;

public class Login_SecurityPage extends BaseAmazonClass {
	Amazon_POM Ap;
	Signin sign; 
	existinguserPassword ep;
	Homepage hp;

	public Login_SecurityPage() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void intialsetup() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		initialize();
		//Thread.sleep(3000);
	}
	@Test
	
	public void Login_Securitytest() throws IOException, InterruptedException {
		Ap =new Amazon_POM (); 
		  sign=Ap.Clikonsigninbutton();
		  Thread.sleep(1000); 
		  ep=sign.login1(p.getProperty("username")); 
		  String g=p.getProperty("password"); 
		  hp=ep.gotohomepage(g); 
		  hp.getDetails();
		  LoginInfo ls= new LoginInfo();
		  ls.clikonlogin();
		  ls.editnametest();
	}
	
	@AfterMethod
	public void closebrowser() throws InterruptedException {
		 Thread.sleep(2000);
		driver.close();
	}
}
