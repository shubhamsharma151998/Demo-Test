package Question_No_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4_Implementation {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swayam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
    driver=new ChromeDriver();  
      
    driver.navigate().to("http://www.automationanywhere.com/");  
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    
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
}
