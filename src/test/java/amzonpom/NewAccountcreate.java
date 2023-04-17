package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class NewAccountcreate extends BaseAmazonClass {
	public  NewAccountcreate() throws IOException {
		//super();
		{
			PageFactory.initElements(driver, this);
		}
	}
	@FindBy(id="ap_customer_name") WebElement custname;
	@FindBy(id="ap_email") WebElement custemail;
	@FindBy(id="ap_password") WebElement custpwd;
	@FindBy(id="ap_password_check") WebElement custpwdAgain;
	@FindBy(id="continue") WebElement Continuebtn;
	
	public void getdata(String name,String Email,String pwd,String pwdAg) 
	{
		//type(custname,name);
		custname.sendKeys(name);
		//type(custemail,Email);
		custemail.sendKeys(Email);
		//type(custpwd,pwd);
		custpwd.sendKeys(pwd);
		//type(custpwdAgain,pwdAg);
		custpwdAgain.sendKeys(pwdAg);
		
	}
	public boolean type(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}

		}
		return flag;
	}
	public Homepage clickoncontinuebutton() throws IOException {
		Continuebtn.click();
		return new Homepage();
		
	}
}
