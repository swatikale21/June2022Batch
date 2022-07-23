package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable
{
	
	@Before
    public void before(Scenario scenario) throws UnknownHostException
    {
		
		HTMLReportGenerator.TestSuiteStart("D:\\Report\\flipkart.html", "flipcard");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		
		
		System.out.println("........................scenaroi start........................");
    }
	
	@After
	public void  after(Scenario scenario)
	{
		System.out.println("........................scenario end...........................");
		
	    HTMLReportGenerator.TestCaseEnd();
	    HTMLReportGenerator.TestSuiteEnd();
	    
		
	}
}
