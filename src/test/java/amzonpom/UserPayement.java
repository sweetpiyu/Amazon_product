package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazonClass;

public class UserPayement extends BaseAmazonClass {

	public UserPayement() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"pp-N2htXg-16\"]") WebElement cardno;
	@FindBy(xpath="//*[@id=\"pp-N2htXg-18\"]") WebElement Nameoncard;
	@FindBy(xpath="//*[@id=\"pp-N2htXg-22\"]/span/span") WebElement expirationdate;
	@FindBy(xpath="//*[@id=\"pp-N2htXg-23\"]/span/span") WebElement expirationyear;
	@FindBy(xpath="//*[@id=\"pp-N2htXg-25\"]") WebElement Securitycode;
	@FindBy(xpath="//*[@id=\"pp-N2htXg-31\"]/span/input") WebElement Addyourcard;
	public void  add_cardnumber(String no) throws IOException
	{
		cardno.sendKeys(no);	
	}
	public void  add_cardname(String name) throws IOException
	{
		Nameoncard.sendKeys(name);	
	}
	public void  add_cardsecuritycode(String code) throws IOException
	{
		
		Securitycode.sendKeys(code);	
	}
	public void add_carddate() {
		Select d= new Select(expirationdate);
		d.selectByIndex(0);
	}
	public void add_cardyear() {
		Select y= new Select(expirationyear);
		y.selectByIndex(0);
	}
	public void clickonaddcard()
	{
		Addyourcard.click();
	}
}
