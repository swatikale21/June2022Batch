package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 

{
	public static Hashtable<String,Object> outputparameter = new Hashtable<String,Object>();
	public static ChromeDriver driver=null;
	
	public static Hashtable<String,Object> browserlaunch(Object[]inputparameters)
	{
		try
		{
			
		
		String strBrowserName=(String)inputparameters[0];
		String strExe=(String)inputparameters[1];
		
		System.setProperty(strBrowserName, strExe);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputparameter.put("STATUS","PASS");
		outputparameter.put("MESSAGE","methodUsed: browerLaunch,Input Given:" + inputparameters[0].toString());
		
		}
		
		
		catch(Exception e)
		{
			outputparameter.put("STATUS","FAIL");
			outputparameter.put("MESSAGE","methodUsed: browerLaunch,Input Given:" + inputparameters[0].toString());
		}
		
		return outputparameter;
	}
	
	
	
	public static  Hashtable<String,Object> openApplication(Object[]inputparameters)
	{
		try
		{
		String path=(String)inputparameters[0];
		driver.get(path);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		outputparameter.put("STATUS","PASS");
		outputparameter.put("MESSAGE","methodUsed: openApplication,Input Given:" + inputparameters[0].toString());
		}
		catch(Exception e)
		{
			outputparameter.put("STATUS","FAIL");
			outputparameter.put("MESSAGE","methodUsed: openApplication,Input Given:" + inputparameters[0].toString());
		}
		
		return outputparameter;
	}
	
	
	public static Hashtable<String,Object> ClickOnElement(Object[]inputparameters)
	{
		try
		{
			
		
		String cancelpage=(String)inputparameters[0];
		driver.findElement(By.xpath(cancelpage)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputparameter.put("STATUS","PASS");
		outputparameter.put("MESSAGE","methodUsed: ClickOnElement,Input Given:" + inputparameters[0].toString());
		
		}
		catch(Exception e)
		{
			outputparameter.put("STATUS","FAIL");
			outputparameter.put("MESSAGE","methodUsed: ClickOnElement,Input Given:" + inputparameters[0].toString());
		}
		
		return outputparameter;
	}
	
	
	
	public static Hashtable<String,Object> MoveToElement(Object[]inputparameters)
	{
		try
		{
			
		
		String Xpath=(String)inputparameters[0];
		Actions act= new Actions(driver);
		
		WebElement web=	driver.findElement(By.xpath(Xpath));
		act.moveToElement(web).build().perform();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		outputparameter.put("STATUS","PASS");
		outputparameter.put("MESSAGE","methodUsed: MoveToElement,Input Given:" + inputparameters[0].toString());
		
		}
		catch(Exception e)
		{
			outputparameter.put("STATUS","FAIL");
			outputparameter.put("MESSAGE","methodUsed: MoveToElement,Input Given:" + inputparameters[0].toString());
		}
		
		return outputparameter;
	}
	
	public static Hashtable<String,Object> SendTextOnUi(Object[]inputparameters) 
	{
		try
		{
		
		String input1=(String)inputparameters[0];
		String input2=(String)inputparameters[1];
		driver.findElement(By.xpath(input1)).sendKeys(input2);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		outputparameter.put("STATUS","PASS");
		outputparameter.put("MESSAGE","methodUsed: SendTextOnUi,Input Given:" + inputparameters[1].toString());
		}
		catch(Exception e)
		{
			outputparameter.put("STATUS","FAIL");
			outputparameter.put("MESSAGE","methodUsed: SendTextOnUi,Input Given:" + inputparameters[1].toString());
		}
		
		return outputparameter;
	}
	
	
	public static Hashtable<String,Object> validbygettext(Object[]inputparameters)
	{
		try
		{
			
			String givenText=(String)inputparameters[0];
			String locater=(String)inputparameters[1];
			String captured = driver.findElement(By.xpath(locater)).getText();
			if(givenText.equalsIgnoreCase(captured)){
				System.out.println("Test case pass ");
				
			}else {
				System.out.println("Test case fail");
				
			}
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			outputparameter.put("STATUS","PASS");
			outputparameter.put("MESSAGE","methodUsed: validation,Input Given:" + inputparameters[1].toString());
			}catch(Exception e){
				outputparameter.put("STATUS","FAIL");
				 outputparameter.put("MESSAGE","methodUsed: validation,Input Given:" + inputparameters[1].toString());
			}
			return outputparameter;
		}
		
	/*	String givenText=(String)inputparameters[0];
		String locator=(String)inputparameters[1];
		String capturetext=driver.findElement(By.xpath(locator)).getText();
		
		if(givenText.equalsIgnoreCase(capturetext))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
		
		outputparameter.put("STATUS","PASS");
		outputparameter.put("MESSAGE","methodUsed: validbygettext,Input Given:" + inputparameters[1].toString());
		}
		catch(Exception e)
		{
			outputparameter.put("STATUS","FAIL");
			outputparameter.put("MESSAGE","methodUsed: validbygettext,Input Given:" + inputparameters[1].toString());
		}
		
		return outputparameter;
		*/
	

	public static void main(String[] args) throws InterruptedException
	{
      
		Object[] input1=new Object[2];									//browser launch
		  input1[0]="webdriver.chrome.driver";
		  input1[1]="D:\\Automation support\\chromedriver.exe";
		  
		  SeleniumOperations.browserlaunch(input1);
		  
	  
		  
		Object[] input2=new Object[1];					//open application
				 input2[0]="https://www.flipkart.com/";
		         SeleniumOperations.openApplication(input2);	
		  
		  
	    Object[] input3=new Object[1];					//click on element
			     input3[0]="//*[@class='_2KpZ6l _2doB4z']";
			     SeleniumOperations.ClickOnElement(input3);
			
		 Object[] input4=new Object[1];					//move to element (mouse point to login button not click only move)
			      input4[0]="//*[text()='Login']";
			      SeleniumOperations.MoveToElement(input4);
			  
			  Thread.sleep(5000);
			
		 Object[] input5=new Object[1];
		          input5[0]="//*[text()='My Profile']";        //click on my profile
		          SeleniumOperations.ClickOnElement(input5);
		          
		 Object[] input6=new Object[2];									
				  input6[0]="//*[@class='_2IX_2- VJZDxU']";
				  input6[1]="9762720906";
		          SeleniumOperations.SendTextOnUi(input6);
		          
		 Object[] input7=new Object[2];									
				  input7[0]="//*[@type='password']";
				  input7[1]="swati123"; 
				  SeleniumOperations.SendTextOnUi(input7);
				  
				 
		  Object[] input8=new Object[1];					//click on submit
				   input8[0]="(//*[@type='submit'])[2]";
		           SeleniumOperations.ClickOnElement(input8);
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
	/*	Object [] input9 =new Object[2];
		input9[0]="Hello";
		input9[1]="//*[text()='Hello']";
		 SeleniumOperations.validbygettext(input9);
		 
		 */
		
	/*	Object[] input9=new Object[2];									
		  input9[0]="Hello";
		  input9[1]="//*[@class='_14mvAI']"; 
		  SeleniumOperations.validbygettext(input9);
		
		  */
	
		
		
	}

}
