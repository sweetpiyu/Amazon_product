package amzonpom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basePackage.BaseAmazonClass;

public class Searchresult extends BaseAmazonClass {
	//Action at;
	public Searchresult() throws IOException {
		super();
		{
			PageFactory.initElements(driver, this);
		}
		
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement searchbox;
	@FindBy(id="nav-search-submit-button") WebElement searchbtn;
	@FindBy(linkText="1-48 of over 70,000 results for") WebElement productperpage;
	@FindBy(id="a-autoid-0-announce") WebElement productsort;
	@FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[2]/div[1]/div[1]/img[1]") WebElement prodcuselect;
	
	public boolean isProductAvailable() throws Throwable {
		return searchbox.isDisplayed();
	}
	public void produchsearch(String item)
	{
		searchbox.sendKeys(item);
		searchbtn.click();
	
	}
	/*
	 * public AddtoCart clickon_Product() throws IOException { }
	 */
	
	public void productperpagetest()
	{
		String s=productperpage.getText();
		System.out.println(s);
	}
	public void Product_sort()
	{
		productsort.click();
		
		
		
		//capture the price before filter
		List <WebElement>beforeFilterprice=driver.findElements(By.className("a-price"));
		System.out.println(beforeFilterprice.size());
		//Remove the $ symbol and convert strung value to double
		List<Double> beforeFilterpricelist= new ArrayList<Double>();
		for(WebElement p :beforeFilterprice)
		{
			beforeFilterpricelist.add(Double.valueOf(p.getText().replace("$","")));
			
		}
		//Filter the price form the dropdown
		//List <WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'a-nostyle a-list-lin')]//li//a"));
		
		Select list= new Select(driver.findElement(By.id("s-result-sort-select")));
		
		list.selectByVisibleText("Price: Low to high");
				
		
		/*
		 * //After Filter capture the price List
		 * <WebElement>AfterFilterprice=driver.findElements(By.className("a-price"));
		 * //Remove the $ symbol and convert strung value to double List<Double>
		 * AfterFilterpricelist= new ArrayList<>(); //List<Double>
		 * beforeFilterpricelist= new ArrayList<>(); for(WebElement p :AfterFilterprice)
		 * { AfterFilterpricelist.add(Double.valueOf(p.getText().replace("$","")));
		 * 
		 * } Collections.sort(beforeFilterpricelist);
		 * Assert.assertEquals(beforeFilterpricelist,AfterFilterpricelist );
		 */
		
		}
	private void scrollbyvisibilityofelement(WebDriver driver, WebElement searchbtn2) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", searchbtn2);
		//js.executeScript("window.scrollBy(0,600)");		
		
	}
	public AddtoCart clickon_Product() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		scrollbyvisibilityofelement(driver, searchbtn);
		prodcuselect.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new AddtoCart();

	}}
