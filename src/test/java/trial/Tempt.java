package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		Actions act= new Actions(driver);
		
	WebElement web=	driver.findElement(By.xpath("//*[text()='Login']"));
		act.moveToElement(web).build().perform();
		
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9762720906");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("swati123");
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Manage Addresses']")).click();
		driver.findElement(By.xpath("//*[text()='ADD ADDRESSES']")).click();
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("swati pote");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9762720906");
		driver.findElement(By.xpath("//*[@name='pincode']")).sendKeys("414111");
		driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("Ahmednagar");
        driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("Bolhegaon,Ahmednagar");		
        driver.findElement(By.xpath("//*[@name='landmark']")).sendKeys("Near Aadesh Lawn,police colony");
        driver.findElement(By.xpath("//*[@name='alternatePhone']")).sendKeys("8805752148");
		driver.findElement(By.xpath("//*[@class='_1XFPmK']")).click();
		driver.findElement(By.xpath("//*[text()='Save']")).click();
		
		

	}

}
