package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Signin extends BaseAmazonClass{

	public Signin() throws IOException {
		super();
		{
			PageFactory.initElements(driver, this);
		}
	}
	@FindBy(id="ap_email") WebElement cust_email;
	@FindBy(id="continue") WebElement conbtn;
	
	public existinguserPassword login1(String email) throws IOException {
		cust_email.sendKeys(email);
		conbtn.click();
		return new existinguserPassword();
	}
	
}
