package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/iframes/");
        Thread.sleep(2000);
       String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
       System.out.println(text);
       driver.switchTo().frame(0); //by index
      String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
      System.out.println(text1);
    //driver.findElement(By.xpath("//a[text()='Category2']")).click();
      driver.switchTo().parentFrame();
      driver.switchTo().frame("Frame2");//by name
		String test3 = driver.findElement(By.linkText("Category3")).getText();
		System.out.println(test3);
		driver.findElement(By.linkText("Category3")).click();
		Thread.sleep(1000);
	
		driver.switchTo().parentFrame();
		String test2 = driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(test2);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='Frame2']"));
	 driver.switchTo().frame(frame2);//by using web element
	 String test4 = driver.findElement(By.xpath("//p[text()='Enter something!']")).getText();
	  System.out.println(test4);
	  
	  driver.switchTo().defaultContent();
	 String test5 = driver.findElement(By.id("inputtext1")).getText();
	 System.out.println(test5);
      
       
		

	}

}
