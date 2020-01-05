package MyFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import objextRespo.BasePage;

public class ValidateLabel extends Baseclass {
	
	@BeforeTest
	public void loginPage() throws Exception
	{
		driver=initialise();
		driver.get("http://qaclickacademy.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void validateLabel()
	{
		
		BasePage bp=new BasePage(driver);
		String text=bp.label.getText();
		Assert.assertEquals("FEATURED COURSES", text);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
