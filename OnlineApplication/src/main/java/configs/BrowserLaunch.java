package configs;



import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BrowserLaunch{
  
	public static  WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  String URL="http://automationpractice.com/index.php";
	  driver.get(URL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
