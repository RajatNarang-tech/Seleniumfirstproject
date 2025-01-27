package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First
{
  static WebDriver driver;
  @Test
  public void firstcases()
  {
	driver=new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\Driver\\chromedriver.exe");
	driver.get("https://www.facebook.com/login");
	System.out.println("Hi kamal");
 }
}
