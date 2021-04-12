package helloSelenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestCrossBrowser {

	public static void main(String[] args)
	{
		System.out.println("Enter Browser Name:?");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		WebDriver driver = null;
		
		if(x.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\WDTest\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		else if (x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\WDTest\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		else if(x.equals("ie"))
		{
			System.setProperty("webdriver.iedriver.driver","D:\\WDTest\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		else if(x.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver", "D:\\WDTest\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver = new  OperaDriver();
			
		}
		else
		{
			System.out.println("Browser not Found in System");
			System.exit(0);
		}
		
		
		
		
		
		
		
		

	}

}
