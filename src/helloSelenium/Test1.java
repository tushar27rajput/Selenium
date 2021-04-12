package helloSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	  public static void main(String args[])
	  {  
	     System.out.println("Test Start");  
	     
	  // System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver", "D:\\WDTest\\chromedriver.exe");  
	          
	             // Instantiate a ChromeDriver class.     
	        WebDriver driver=new ChromeDriver();  
	          
	           // Launch Website  
	        driver.navigate().to("http://www.javatpoint.com/");  
	          
	         //Maximize the browser  
	          driver.manage().window().maximize();  
	          
	          //Scroll down the webpage by 5000 pixels  
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 5000)");   
	          
	         // Click on the Search button  
	        driver.findElement(By.linkText("Core Java")).click(); 
	        driver.navigate().to("https://www.udemy.com/courses/development/software-testing/");
	        String pagetitle=driver.getTitle();
	        System.out.println(pagetitle);
	        
	        driver.navigate().back();
	        driver.close();
	        System.out.println("Test End");  
	          
       }
}
