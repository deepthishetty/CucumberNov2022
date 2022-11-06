package pagesactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageslocators.CarSearchPageLocators;
import utilities.SeleniumDriver;

public class CarsSearchPageActions {
	
	CarSearchPageLocators carSearchPageLocators=null;
	
	public CarsSearchPageActions()
	{
		carSearchPageLocators =new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	
	public void  selectCarMake(String carBrand)
	{
		Select selectcarMaker=new Select(carSearchPageLocators.make);
		selectcarMaker.selectByVisibleText(carBrand);
	}
	
	public void  selectCarModel(String carModel)
	{
		Select selectcarMaker=new Select(carSearchPageLocators.model);
		selectcarMaker.selectByVisibleText(carModel);
	}
	
	public void  selectLocation(String location)
	{
		Select selectcarMaker=new Select(carSearchPageLocators.locations);
		selectcarMaker.selectByVisibleText(location);
	}
	
	
	public void  selectPrice(String price)
	{
		Select selectcarMaker=new Select(carSearchPageLocators.priceTo);
		selectcarMaker.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
		carSearchPageLocators.findMyCar.click();
	}

}
