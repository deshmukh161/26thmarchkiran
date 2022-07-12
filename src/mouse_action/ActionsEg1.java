package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(2000);
        WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
        Actions act= new Actions(driver);
      // act.moveToElement(rightClickButton).contextClick().build().perform();
     //act.contextClick(rightClickButton).perform();
     // how to double click using Actions class
     WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
     //act.moveToElement(doubleClickButton).doubleClick().build().perform();
     act.doubleClick(doubleClickButton).perform();
        
		

	}

}
