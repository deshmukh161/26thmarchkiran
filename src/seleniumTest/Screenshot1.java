package seleniumTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot1 {

	

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String str =RandomString.make(3);//to add random string this will avoid overrwriting of file
    File destination= new File("G:\\SOFTWARE TESTING\\Automation Testing\\Screenshot\\amazon.png"+str+".png");
    FileHandler.copy(source, destination);
        
		

	}

}
