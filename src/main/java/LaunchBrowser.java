import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.google.com");
//		String title=driver.getTitle();
//		System.out.println(title);
//		//driver.close();
		
		
      BrowserUtil br= new  BrowserUtil ();
      
		br.initDriver("Chrome");
		br.getUrl("https://google.com");
		br.getTitle();
		
		

	}

}
