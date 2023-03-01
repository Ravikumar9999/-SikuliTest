import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {
	
	WebDriver driver;
	

	public static void main(String[] args) throws FindFailed {


		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\SikuliTest\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        
		        //dynamic wait
		        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //element find out time
		        
		        driver.get("https://www.youtube.com/watch?v=gVaQhxajCB0");
		        
		        //Create the object of Screen class - Sikuli
		        Screen s = new Screen();
		        
		        Pattern pauseImg = new Pattern("YT_Pause.jpeg");
		        s.wait(pauseImg,2000);
		        s.click();
		        s.click();

	}
	
  
}
	
	

