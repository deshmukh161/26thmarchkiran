package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysProperty {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
       /* driver.findElement(By.id("name")).sendKeys("Kiran");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).clear();
		Thread.sleep(5000);*/
        //by using refereance
        WebElement UN = driver.findElement(By.id("name"));
        UN.sendKeys("kiran");
        Thread.sleep(3000);
        UN.clear();
        Thread.sleep(5000);
        
        

	}

}
