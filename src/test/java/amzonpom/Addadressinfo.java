package amzonpom;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class Addadressinfo extends BaseAmazonClass{
	Actions as;
	public Addadressinfo() throws IOException {
		super();
		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
	}
	@FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId") WebElement Country;
	@FindBy(id="address-ui-widgets-enterAddressFullName") WebElement Fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber") WebElement Phonenumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1") WebElement Add1;
	@FindBy(id="address-ui-widgets-enterAddressLine2") WebElement add2;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement City;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId") WebElement province;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") WebElement postalcode;
	@FindBy(id="address-ui-widgets-use-as-my-default") WebElement chkbox;
	@FindBy(id="address-ui-widgets-form-submit-button-announce") WebElement addaddressbtn;
	
	public Your_Address addressinfo(String name,String ad1,String ad2,String ucity,String regoin,String zipcode) throws IOException, InterruptedException {
		Select s1= new Select(Country);
		s1.selectByVisibleText("Canada");
		/*
		 * Fullname.sendKeys(name); Add1.sendKeys(ad1); add2.sendKeys(ad2);
		 * City.sendKeys(ucity); Select s2= new Select(province);
		 * s2.selectByVisibleText("Ontario"); postalcode.sendKeys(zipcode);
		 */
		return new Your_Address();
	}
	public Your_Address GetName(String name ) throws IOException {
		Fullname.sendKeys(name);
		return new Your_Address();
	}
	public Your_Address Getphonenumber(String phone ) throws IOException {
		Phonenumber.sendKeys(phone);
		return new Your_Address();
	}
	public Your_Address GetAddress1(String ad1 ) throws IOException {
		Add1.sendKeys(ad1);
		return new Your_Address();
	}
	public Your_Address GetAddress2(String ad2 ) throws IOException {
		add2.sendKeys(ad2);
		return new Your_Address();
	}
	public Your_Address GetAcity(String ucity ) throws IOException {
		City.sendKeys(ucity);
		return new Your_Address();
	}
	public Your_Address GetProvince() throws IOException {
		Select s2= new Select(province);
		s2.selectByVisibleText("Ontario");
		return new Your_Address();
	}
	public Your_Address Getzipcode(String zipcode ) throws IOException {
		postalcode.sendKeys(zipcode);
		return new Your_Address();
	}
	public Your_Address clickonaddaddress() throws IOException {
		addaddressbtn.click();
		return new Your_Address();
	}
	
	public Your_Address clickonChkbox() throws IOException {
		 if(chkbox.isSelected())
		 {
			 System.out.println("Make this my default address");
		 }
		 else
		 {
			return new Your_Address(); 
		 }
			return new Your_Address(); 
		 
	}
}
