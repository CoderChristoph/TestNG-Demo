

public class primary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCaseOne test1 = new TestCaseOne("webdriver.chrome.driver", "/Users/chris/Desktop/WebDrivers/chromedriver.exe");
		
		test1.SignIn();
		test1.Login();
		test1.DisplayMessages();
		
		System.out.println(test1.DisplayMessages());
		
	}
	

}
