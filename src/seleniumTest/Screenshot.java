package seleniumTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(1000);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        
        File destination= new File("G:\\SOFTWARE TESTING\\Automation Testing\\Screenshot\\myScreenShot.png");
       
        
        FileHandler.copy(source, destination);
		

	}

}
