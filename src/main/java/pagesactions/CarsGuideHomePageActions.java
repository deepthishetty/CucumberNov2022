package pagesactions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageslocators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions()
	{
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveToCarsForSaleMenu()
	{
		Actions action =new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyandsell).build().perform();
		
	}
	
	public void clickOnSearchCarsMenu()
	{
		carsGuideHomePageLocators.searchCars.click();
	}

	public void clickOnUsedCarsSearchMenu()
	{
		carsGuideHomePageLocators.usedCarsearch.click();
	}
}
