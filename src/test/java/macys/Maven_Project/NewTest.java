package macys.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	 @BeforeTest
	  public void beforeTest() 
	  {
		 //ChromeOptions chromeOptions = new ChromeOptions();
		   // chromeOptions.addArguments("--start-maximized");
		    driver = new ChromeDriver();
	  }

  @Test
  public void f() throws Exception 
  {
	  
	  driver.get("http://www.google.co.in");
	  Thread.sleep(10000);
	  driver.findElement(By.name("q")).sendKeys("Kalam");
	  driver.manage().window().maximize();
	  Thread.sleep(10000);
	  
	  /*while (2>1) 
	  {
		  driver.get("http://only-testing-blog.blogspot.in/");
		  driver.manage().window().maximize();
		  break;
	  }*/
	  	  
  }

 @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
