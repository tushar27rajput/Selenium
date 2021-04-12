package helloSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advantageonlineshopping {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Test Start");  
	     
		  // System Property for Chrome Driver   
		        System.setProperty("webdriver.chrome.driver", "D:\\WDTest\\chromedriver.exe");  
		          
		             // Instantiate a ChromeDriver class.     
		        WebDriver driver=new ChromeDriver(); 
		        String webURL ="http://advantageonlineshopping.com/#/";
		          
		           // Launch Website  
		        driver.get(webURL); 
		          
		          //Maximize the browser  
		        driver.manage().window().maximize();  
		        
		        Thread.sleep(10000);
		        //Click to registor shopping site
		     // declare and initialize the variable to store the expected title of the webpage.
		        String excptedTitle ="Advantage Shopping";
		     // fetch the title of the web page and save it into a string variable
		        String actualTitle=driver.getTitle();
		        //System.out.print("WebSite Title" + actualTitle);
		        
		     // compare the expected title of the page with the actual title of the page and print the result
		        if(excptedTitle.equals(actualTitle))
		        {
		        	System.out.println("Verification Successful - The correct title is displayed");
		        }
		        else
		        {
		        	System.out.println("Verification Failed - The incorrect title is displayed");
		        }
		        
		        
		        driver.findElement(By.id("menuUser")).click();
		        Thread.sleep(10000);
		          
		        driver.findElement(By.linkText("CREATE NEW ACCOUNT")).click();
		        Thread.sleep(10000);
		        driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).sendKeys("abcd");
		        driver.findElement(By.xpath("//input[@name='emailRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='emailRegisterPage']")).sendKeys("abcd@gmail.com");
		        
		        
		        //driver.quit()
	}

}
