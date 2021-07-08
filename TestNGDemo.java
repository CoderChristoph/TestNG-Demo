import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

	private WebDriver driver;
	private WebElement element;
	private HashMap<String, String> messages = new HashMap<String, String>();
	
	public TestNGDemo(String WebProperty, String WebLocation) {
		System.setProperty(WebProperty, WebLocation);
		this.driver = new ChromeDriver();
	}
	
	public HashMap<String, String> DisplayMessages() {
		
		return this.messages;
	}
	
	@Test
	void TestOne() {
		this.driver.get("http://www.google.com");
		this.element = this.driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		this.element.sendKeys("5*10");
		this.element.submit();
		WebElement result = driver.findElement(By.id("cwos"));
		
		try {
			Assert.assertEquals(result.getText(), "50");
			this.messages.put("TestOne", "Passed");
		} 
		catch (Exception e) 
		{
			this.messages.put("TestOne", "Failed");
		}
	}
}
