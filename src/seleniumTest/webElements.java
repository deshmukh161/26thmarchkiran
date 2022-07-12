package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //web elements send keys
        //5.isEnabled()
        driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
        driver.manage().window().maximize();
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        //enabled
        System.out.println(submit.isEnabled());
        driver.findElement(By.id("mobileNumber")).sendKeys("9011501488");
        System.out.println(submit.isEnabled());
        //submit.click();
        //6 clear
        Thread.sleep(2000);
        driver.findElement(By.id("mobileNumber")).clear();
        
        
       
        
        
        
       
	}

}
