import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static <integer> void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajpatel/Documents/jarforchrome/chromedriver11");  
	
		 WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	System.out.println(	driver.getPageSource().contains("Hello Raj1"));
	driver.findElement(By.className("btn-class")).click();

		String s = driver.findElement(By.id("firstname")).getAttribute("value");
		System.out.println(s);
		assertFieldValue("firstname","Raj");
		assertFieldValue("lastname","Grandhe");
		assertFieldValue("age","1");

	}

	private static void assertFieldValue(String inputValue, String expectedValue) {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("file:///Users/rajpatel/Desktop/name%20details%20copy.html");
		String s = driver1.findElement(By.id(inputValue)).getAttribute("value");
		System.out.println(s.equals(expectedValue));	
		
		
	}
}
