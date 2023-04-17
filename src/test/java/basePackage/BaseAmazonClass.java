package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseAmazonClass {
	public static Properties p=new Properties();
	public static WebDriver driver;
	
	public BaseAmazonClass() throws IOException {
		try {
			FileInputStream file= new FileInputStream(
			  "C:\\Users\\prash\\eclipse-workspace\\Amazon_project\\src\\test\\java\\Environmentsetup\\AmazonConfig.properties"
			  );
			
			  p.load(file);
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		}
	public static void initialize(){
		String bsname=p.getProperty("browser");
		System.out.println(bsname);
		if (bsname.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
			else if(bsname.equals("Firefox"))
			{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			}
		driver.get(p.getProperty("url"));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
}
