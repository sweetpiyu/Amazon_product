package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class LoginInfo extends BaseAmazonClass {

	public LoginInfo() throws IOException {
		super();
		{
			PageFactory.initElements(driver, this);
		}
		
	}
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a/div/div") WebElement YourLogin;
	@FindBy(id="auth-cnep-edit-name-button") WebElement editnamebtn;
	@FindBy(id="auth-cnep-edit-email-button") WebElement editemailbtn;
	@FindBy(id="auth-cnep-add-phone-button") WebElement addphonebtn;
	@FindBy(id="auth-cnep-edit-password-button") WebElement editpasswordbtn;
	@FindBy(id="auth-cnep-advanced-security-settings-button") WebElement adscuritybtn;
	@FindBy(id="auth-cnep-secure-your-account-button") WebElement startbtn;
	@FindBy(id="auth-cnep-done-button") WebElement donebtn;
	
	public LoginInfo clikonlogin() throws IOException {
		YourLogin.click();
		return new LoginInfo();
	}
	public Edituserinfo editnametest() {
		editnamebtn.click();
		return new Edituserinfo();
	}
}
