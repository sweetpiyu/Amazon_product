package amzonpom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Orderpage extends BaseAmazonClass{

	public Orderpage() throws IOException {
		super();
		{
			PageFactory.initElements(driver, this);
		}
	}
   @FindBy(xpath="//td[@class='a-text-right aok-nowrap a-nowrap']") WebElement unitprice;
   @FindBy(xpath="//td[@class='a-color-price a-size-medium a-text-right grand-total-price aok-nowrap a-text-bold a-nowrap']") WebElement Totalprice;
   @FindBy(name="placeYourOrder1") WebElement placeorederbtn;
   
   public double getunitprice()
   {
	   String productunitprice=unitprice.getText();
	   String unit=productunitprice.replaceAll("[a-zA-Z0-9]", "");
	   Double finalunitprice=Double.parseDouble(unit);
	   return finalunitprice/100;
   }
   
   public double gettotalprice()
   {
	   String producttotalprice=Totalprice.getText();
	   String total=producttotalprice.replaceAll("[a-zA-Z0-9]", "");
	   Double finaltotalprice=Double.parseDouble(total);
	   return finaltotalprice/100;
   }
   
   public void clickonplaceorderbutton()
   {
	   placeorederbtn.click();
   }
}

