import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseOne {
	
	private WebDriver driver;
	private WebElement element;
	private HashMap<String, String> messages = new HashMap<String, String>();
	
	public TestCaseOne(String webDriver, String propertyLocation) {
		System.setProperty(webDriver, propertyLocation);
		this.driver = new ChromeDriver();
	}
	
	public HashMap<String, String> DisplayMessages() {
		
		return this.messages;
	}
	
	@Test
	void SignIn() {
		
		this.driver.get("https://www.youtube.com/");
		
		try 
		{
			this.element = this.driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[3]/div[2]/ytd-button-renderer"));
			this.element.click();
			this.messages.put("SignIn", "Passed");
		}
		catch(Exception e) 
		{
			this.messages.put("SignIn", "Failed");
		}
		
	}
	
	@Test
	void Login() {
		try 
		{
			this.element = this.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
			this.element.sendKeys("practiceAutomation@gmail.com");
			this.messages.put("Login", "Passed");		
		} 
		catch(Exception e) 
		{
			this.messages.put("Login", "Failed");
			
		}

	}
	
	
}
