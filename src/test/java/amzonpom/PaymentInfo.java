package amzonpom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PaymentInfo extends BaseAmazonClass {

	public PaymentInfo() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//body/div[@id='a-page']/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]") WebElement payment;
	@FindBy(xpath="//body/div[@id='a-page']/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]") WebElement addcardbtn;
	//@FindBy(xpath="//span[@id='pp-o1eFiH-26']") WebElement addcardbtn;
	public void clickonaddcardbtn()
	{
		addcardbtn.click();
	}
	public UserPayement addPayemntdata() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		payment.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addcardbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new UserPayement();
		
	  }
	
}
