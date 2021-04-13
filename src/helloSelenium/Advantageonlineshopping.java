package helloSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		        driver.findElement(By.xpath("//input[@name='passwordRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='passwordRegisterPage']")).sendKeys("Abcd1");
		        driver.findElement(By.xpath("//input[@name='confirm_passwordRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='confirm_passwordRegisterPage']")).sendKeys("Abcd1");

		        //Scroll from Top to Bottom
		        
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,200)");
		        Thread.sleep(10000);
		        
		        driver.findElement(By.xpath("//input[@name='first_nameRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='first_nameRegisterPage']")).sendKeys("tushar");
		        driver.findElement(By.xpath("//input[@name='last_nameRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='last_nameRegisterPage']")).sendKeys("Rajput");
		        driver.findElement(By.xpath("//input[@name='phone_numberRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='phone_numberRegisterPage']")).sendKeys("7972942322");
		        js.executeScript("window.scrollBy(0,200)");
		        Thread.sleep(10000);
		        
		        //Dropdownlist 
		        
		        WebElement dropElement = driver.findElement(By.name("countryListboxRegisterPage"));
		        dropElement.click();
		        Select dropdown =new Select(dropElement);
		        dropdown.selectByVisibleText("India");
		        driver.findElement(By.xpath("//input[@name='cityRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='cityRegisterPage']")).sendKeys("Jalgaon");
		        driver.findElement(By.xpath("//input[@name='addressRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='addressRegisterPage']")).sendKeys("132 B. J. Nagar , near Shop store, Jalgaon");
		        driver.findElement(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']")).sendKeys("Maharashtra");
		        driver.findElement(By.xpath("//input[@name='postal_codeRegisterPage']")).click();
		        driver.findElement(By.xpath("//input[@name='postal_codeRegisterPage']")).sendKeys("425001");
		        js.executeScript("window.scrollBy(0,200)");
		        driver.findElement(By.xpath("//input[@name='i_agree']")).click();
		        
		        
	}
}