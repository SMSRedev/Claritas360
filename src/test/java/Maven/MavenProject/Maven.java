package Maven.MavenProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Maven {


	WebDriver driver;
	public static String BaseFolder = "E:\\NewProject\\";

	    



public void google() throws IOException {
	
		System.setProperty("webdriver.chrome.driver", BaseFolder+"Support Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
		}

}
