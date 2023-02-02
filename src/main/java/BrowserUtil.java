import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver  driver;
	
	/**
	 * This method is used to initialize driver on the basis of browser name
	 * @param browserName
	 * @return this returns driver
	 */
	
	
	public WebDriver initDriver(String browserName) {
		
		
		System.out.println("The Browser name is "+browserName);
		
		  if(browserName.equalsIgnoreCase("chrome")){
			 
	              WebDriverManager.chromedriver().setup();
		          driver=new ChromeDriver();
				
	      }
		  else if(browserName.equalsIgnoreCase("Edge")){
		  
			    WebDriverManager.edgedriver().setup();
				driver=new ChromeDriver();
		  }
		  
		  else {
			  System.out.println("Please pagge the right browser");
			  
			  
		  }
		 return driver;
		  
	}
	
	
	public void getUrl(String url) {
	
	 driver.get(url);
	 
	}
	
	 public String getTitle() {
		 
		 
		String title= driver.getTitle();
		
		System.out.println(title);
		
		return title;
	 }
	 
	 
	 
	}
	
	

