package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BySelect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("kiran");
        driver.findElement(By.name("lastname")).sendKeys("deshmukh");
        driver.findElement(By.name("reg_email__")).sendKeys("mona.deshmukh2016@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("kiran123456789");
        
        WebElement day = driver.findElement(By.name("birthday_day"));
        Select d = new Select(day);
        d.selectByVisibleText("16");
        Thread.sleep(1000);
        
        WebElement month = driver.findElement(By.id("month"));
        Select m = new Select(month);
        //m.selectByVisibleText("5");
        m.selectByValue("5");
       // Thread.sleep(1000);
        
        WebElement year = driver.findElement(By.id("year"));
        Select y = new Select(year);
        y.selectByVisibleText("1994");
        Thread.sleep(1000);
        
      //driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
      		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
      		female.click();
        
        
        
        
        

	}

}
