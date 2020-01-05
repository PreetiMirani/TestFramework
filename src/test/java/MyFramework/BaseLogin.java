package MyFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objextRespo.BasePage;

public class BaseLogin extends Baseclass
{
	
	@BeforeTest
	public void open() throws Exception
	{
		driver=initialise();
		driver.get("http://qaclickacademy.com/");
		BasePage bp=new BasePage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider= "dataObj")
	public void login(String email,String pass) throws Exception
	{
		driver=initialise();
		driver.get("http://qaclickacademy.com/");
		BasePage bp=new BasePage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[6]/div/div/button")).click();
		bp.login.click();
		bp.email.sendKeys(email);
		bp.password.sendKeys(pass);
		bp.signin.click();
		
	}
	
	@DataProvider
	public Object[][] dataObj()
	{
		Object[][] data=new Object[1][2];
		
		data[0][0]="preeti.mirani@gmail.com";
		data[0][1]="pass123$";
					
		return data;
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
