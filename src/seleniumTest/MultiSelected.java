package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");	
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement cars = driver.findElement(By.name("cars"));
        Select c=new Select(cars);
        System.out.println("Multiselectable "+c.isMultiple());
        c.selectByVisibleText("Volvo");
        Thread.sleep(2000);
        c.selectByValue("saab");
        Thread.sleep(2000);
        c.selectByIndex(2);
        c.selectByIndex(3);
        Thread.sleep(2000);
        
       // c.deselectAll();
        c.deselectByIndex(3);
        c.deselectByIndex(2);
        c.deselectByValue("saab");
        c.deselectByVisibleText("Volvo");
        
        
        
        
        
		
		
        
        

	}

}
