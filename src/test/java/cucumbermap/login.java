package cucumbermap;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class login
{
	
	@Given ("^user open browser with \"(.*)\" and \"(.*)\"$")
	public void blaunch(String key,String value)
	{
		Object[] input1=new Object[2];									//browser launch
		  input1[0]=key;
		  input1[1]=value;
		  
		  SeleniumOperations.browserlaunch(input1);
		  
		
	}
	
	@Given ("^user enter url as \"(.*)\"$")
	public void openapp(String key)
	{
		Object[] input2=new Object[1];					//open application
		 input2[0]=key;
        SeleniumOperations.openApplication(input2);	
	}
	
	
	@When ("^user click on initial login page$")
	public void emailadd()
	{
		Object[] input3=new Object[1];					//click on element
	     input3[0]="//*[@class='_2KpZ6l _2doB4z']";
	     Hashtable<String,Object> output3=SeleniumOperations.ClickOnElement(input3);
	     HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user click on initial login page$", output3.get("MESSAGE").toString());
		
	}
	
	@When("^user navigate on login page$")
	public void user_navigate_on_login_page() throws Throwable
	{
		 Object[] input4=new Object[1];					//move to element (mouse point to login button not click only move)
	      input4[0]="//*[text()='Login']";
	      Hashtable<String,Object> output4= SeleniumOperations.MoveToElement(input4);
	      HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user navigate on login page$", output4.get("MESSAGE").toString());
	      
	  
	  Thread.sleep(5000);
		
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable 
	{
		 Object[] input5=new Object[1];
         input5[0]="//*[text()='My Profile']";        //click on my profile
         Hashtable<String,Object> output5=SeleniumOperations.ClickOnElement(input5);
         HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user click on login button$", output5.get("MESSAGE").toString());
          
		
	}

	
	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String key) throws Throwable
	{
	  
		  Object[] input6=new Object[2];									
		  input6[0]="//*[@class='_2IX_2- VJZDxU']";						
		  input6[1]=key;
		  Hashtable<String,Object> output6= SeleniumOperations.SendTextOnUi(input6);
		  HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as username$", output6.get("MESSAGE").toString());
	}
	
	
	
	@When ("^user enter \"(.*)\" as password$")
	public void passwordenter(String key1)
	{
		Object[] input7=new Object[2];									
		  input7[0]="//*[@type='password']";
		  input7[1]=key1; 
		  Hashtable<String,Object> output7= SeleniumOperations.SendTextOnUi(input7);
		  HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user enter \"(.*)\" as password$", output7.get("MESSAGE").toString());
	}


		  
		
	
	@When ("^user click on submit button$")
	public void click_submit()
	{
		 Object[] input8=new Object[1];					//click on submit
		   input8[0]="(//*[@type='submit'])[2]";
		   Hashtable<String,Object> output8= SeleniumOperations.ClickOnElement(input8);
		   HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^user click on submit button$", output8.get("MESSAGE").toString());

	}

	
	

/*	@Then("^application shows login successfully$")
	
	public void application_show_login_successfully() 
	{
		Object [] input9 =new Object[2];
		input9[0]="Hello";
		input9[1]="//*[text()='Hello']";
		Hashtable<String,Object> output9=SeleniumOperations.validbygettext(input9);
	
	}
*/	
	
/*	public void application_shows_login_successfully() throws Throwable 
	{
		Object[] input9=new Object[2];									
		  input9[0]="Hello";
		  input9[1]="//*[@class='_14mvAI']"; 
		  Hashtable<String,Object> output9=SeleniumOperations.validbygettext(input9);
		  HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^application shows login successfully$", output9.get("MESSAGE").toString());
		
	}

*/
}
