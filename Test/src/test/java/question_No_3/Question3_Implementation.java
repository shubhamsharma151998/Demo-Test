package question_No_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3_Implementation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swayam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("http://www.automationanywhere.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Actions actions =new Actions(driver);
		  WebElement menuOption=driver.findElement(By.xpath("//a[text()=\"Products\"]"));
		  actions.moveToElement(menuOption).perform();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("(//a[text()=\"Process Discovery\"])[2]")).click();
		  String url=driver.getCurrentUrl();
		  if(url.contains("https://www.automationanywhere.com/products/process-discovery"))
		  {
			  System.out.println("Verified URL");
		  }
	}
}
