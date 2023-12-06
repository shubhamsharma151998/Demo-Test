package question_No_5;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Question4_TestNGAnswerWithPrioirty {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swayam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
	    driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.navigate().to("http://www.automationanywhere.com/");  
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	}
	
  @Test(priority=1)
  public void verifyFirstnameAndLastName() throws InterruptedException {
	  
	  WebElement l=driver.findElement(By.xpath("//a[@class=\"coh-link coh-style-solid-orange-button btn-link\"]"));
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
      Thread.sleep(800);
      driver.findElement(By.xpath("//a[@class=\"coh-link utility-nav-link coh-style-solid-orange-button\"]")).click();
      Thread.sleep(800);
      String first_name=driver.findElement(By.id("LblFirstName")).getText();
      if(first_name.equals("*First Name"))
      {
    	  System.out.println("First Name Label Verified");
      }
      String last_name=driver.findElement(By.id("LblLastName")).getText();
      if(last_name.equals("*Last Name"))
      {
    	  System.out.println("Last Name Label Verified");
      }
  }
   @AfterTest
	public void tear()
	{
	  //driver.quit();
	}
}
