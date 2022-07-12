package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
       String text =driver.findElement(By.xpath("//input[@type='submit']")).getText();
        System.out.println("Text is "+text);
        		
	}

	
}
