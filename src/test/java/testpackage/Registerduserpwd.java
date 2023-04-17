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

public class Registerduserpwd extends BaseAmazonClass {
	Amazon_POM Ap;
	Signin sign; 
	existinguserPassword ep;
	Homepage hp;
	boolean flag;
	public Registerduserpwd() throws IOException {
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
	
	public void retrivepwd() throws IOException, InterruptedException {
		Ap =new Amazon_POM ();
		sign=Ap.Clikonsigninbutton();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		ep=sign.login1(p.getProperty("username"));
		String s1=p.getProperty("password");
		// System.out.println(s1);
		  if (s1 == "") { System.out.println("Enter your Password"); } else {
		 //ep=sign.login1(s); 
			 
			  hp=ep.gotohomepage(s1);
			 // ep.ckSigninbtn();
			   }
		 }
	
	//@AfterMethod
	public void closebrowser() throws InterruptedException {
		 Thread.sleep(2000);
		driver.close();
	}
}
