package macys.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebDriverTest {
 WebDriver driver;

  @Test
  public void verifySearch() {
	  ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--start-maximized");
	    driver = new ChromeDriver(chromeOptions);
   driver.get("http://only-testing-blog.blogspot.in/");
   
   driver.quit();
  }
}