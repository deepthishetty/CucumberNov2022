package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
//import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import utilities.SeleniumDriver;

public class Hooks {
//	@BeforeAll
//	public static void before_all()
//	{
//		System.out.println("Before All-set db connection");
//	}
//	@AfterAll
//	public static void after_all()
//	{
//		System.out.println("After All-close db connection");
//	}
//	
//	@Before("@prod")
//	public void beforeprod()
//	{
//		System.out.println("before hooks -prod");
//	}
//	
//	@After("@prod")
//	public void afterprod()
//	{
//		System.out.println("After hooks-prod");
//	}
//	
//	
	@Before(order=0)
	public void setup()
	{
		System.out.println("Before");
	       SeleniumDriver.setUpDriver();
	}
	
//	@After(order=1)
//	public void teardown()
//	{
//		System.out.println("After hooks-quitting browser");
//	}
//	
//	@Before(order=1)
//	public void setup1()
//	{
//		System.out.println("Before hooks-launching browser1");
//	}
//	
	@After
    public static void tearDown(Scenario scenario) {
    	
   	WebDriver driver=SeleniumDriver.getDriver();
   	System.out.println(scenario.isFailed());
   	 if (scenario.isFailed()) {
   		final byte[] screenshot = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName()); 
    }   
     
        
         
    SeleniumDriver.teardown();
    }
//	
//	@BeforeStep
//	public void before_step()
//	{
//		System.out.println("Before step-adding log");
//	}
//	
//	@AfterStep
//	public void after_step()
//	{
//		System.out.println("After hooks-deleting log");
//	}
//	
//	
	
	
	
}
