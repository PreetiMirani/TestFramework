package objextRespo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//*[@id=\'homepage\']/header/div[1]/div/nav/ul/li[4]/a")
	public WebElement login;
	
	@FindBy(xpath="//*[@id='user_email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='user_password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='new_user']/div[3]/input")
	public WebElement signin;
	
	@FindBy(xpath="//*[@id='content']/div/div")
	public WebElement label;
	
	
}
