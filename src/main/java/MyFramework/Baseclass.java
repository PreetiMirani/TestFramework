package MyFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public WebDriver driver;
	public WebDriver initialise() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\910808\\eclipse-workspace\\TestFramework\\src\\main\\java\\propert.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Eclipse_Workspace\\chromedriver.exe");
			driver=new ChromeDriver();			
			
		}
		else
			System.out.println("Wrong Driver!!!");
		
		return driver;
		
		
		
	}

}
