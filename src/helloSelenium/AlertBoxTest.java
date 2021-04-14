package helloSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxTest {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "D:\\WDTest\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		String webURL ="http://demo.guru99.com/test/delete_customer.php";
        
        // Launch Website  
        driver.get(webURL); 
          
          //Maximize the browser  
        driver.manage().window().maximize();  
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@name='submit']")).submit();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(5000);
        alert.accept();

	}

}
