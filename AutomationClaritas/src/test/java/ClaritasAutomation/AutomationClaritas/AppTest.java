package ClaritasAutomation.AutomationClaritas;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



@Test

public class AppTest {
	
	
	public void testProgram(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ultimatix.net");
		driver.close();
		
		
	}
	
	
   
}
