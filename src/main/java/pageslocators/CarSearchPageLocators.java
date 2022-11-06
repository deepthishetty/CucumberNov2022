package pageslocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {
	
	@FindBy(how=How.XPATH,using="//*[@id='makes']")
	public WebElement make;
	

	@FindBy(how=How.XPATH,using="//*[@id='models']")
	public WebElement model;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='locations']")
	public WebElement locations;
	

	@FindBy(how=How.XPATH,using="//*[@id='priceTo']")
	public WebElement priceTo;
	
	@FindBy(how=How.XPATH,using="//input[@id='search-submit']")
	public WebElement findMyCar;

}
