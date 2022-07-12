package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","G:\\SOFTWARE TESTING\\Automation Testing\\selenium software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Radio1']"));
        System.out.println(radiobutton.isSelected());
         WebElement radio = driver.findElement(By.name("radio"));
        System.out.println(radio.isSelected());
        
        
        
        


	}

}
