import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class My_test_page {

	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Prashanth\\practice\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=1)
	public void verify()
	{
		String title= driver.getTitle();
		System.out.println("the actual title is "+title);
	}
	@Test(priority=2)
	public  boolean practice()
	{
		String title= driver.getTitle();
		System.out.println("the actual title is "+title);
		return true;
	}
	@AfterMethod
	public void setdown() {
		driver.close();
	}
	
	}
