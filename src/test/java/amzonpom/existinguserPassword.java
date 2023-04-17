package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class existinguserPassword extends BaseAmazonClass {
	boolean flag;
	public existinguserPassword() throws IOException {
		super();
		{
			PageFactory.initElements(driver, this);
		}
	}
	@FindBy(id="ap_password") WebElement cust_pwd;
	@FindBy(id="signInSubmit") WebElement signinbtn;
	@FindBy(name="rememberMe") boolean keepmesigninchkbox;
	
	/*
	 * public existinguserPassword login1(String email) throws IOException {
	 * cust_email.sendKeys(email); //conbtn.click(); return new
	 * existinguserPassword(); }
	 */
	public Homepage gotohomepage(String pd) throws IOException {
		cust_pwd.sendKeys(pd);
		signinbtn.click();
		return new Homepage();
	}
	
	
	 
	public boolean isSelected(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = keepmesigninchkbox;
		if (flag) {
			flag = ele.isSelected();
			if (flag) {
				System.out.println("The element is Selected");
			} else {
				System.out.println("The element is not Selected");
			}
		} else {
			System.out.println("Not selected ");
		}
		return flag;
	}


	public void ckSigninbtn() {
		signinbtn.click();
		
	}

	
}
