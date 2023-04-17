package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;
public class Your_Address extends BaseAmazonClass {

Actions act;
	public Your_Address() throws IOException {
		super();
		{
			PageFactory.initElements(driver, this);
		}
	}
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]") WebElement createacc;
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2") WebElement youraddress;
	
	public Your_Address clickonaddress() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(createacc).build().perform(); 
		youraddress.click();
		return new Your_Address();
	}
	
	
}
