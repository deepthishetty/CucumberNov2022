package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesactions.CarsGuideHomePageActions;
import pagesactions.CarsSearchPageActions;
import utilities.SeleniumDriver;

public class SearchCarSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions=new CarsSearchPageActions();
	
	@Given("I am on the home page {string} of Carsguide website")
	public void i_am_on_the_home_page_of_carsguide_website(String websiteURL) {
	    SeleniumDriver.openPage(websiteURL);
		System.out.println("after");
	}

	@When("I move to  menu")
	public void i_move_to_menu(List<String> list) {
		String menu=list.get(1);
		carsGuideHomePageActions.moveToCarsForSaleMenu();
		
	    
	}

	@When("select carbrand as {string} from AnyMake dropdown")
	public void select_carbrand_as_from_any_make_dropdown(String carMake) {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
		carsSearchPageActions.selectCarMake(carMake);
	}

	@When("select {string} as car model")
	public void select_as_car_model(String carModel) {
		carsSearchPageActions.selectCarModel(carModel);
	}

	@When("select location as {string} from SelectLocation dropdown")
	public void select_location_as_from_select_location_dropdown(String carLocation) {
		carsSearchPageActions.selectLocation(carLocation);
	   
	}

	@When("select {string} as price")
	public void select_as_price(String price) {
		carsSearchPageActions.selectPrice(price);
	    
	}

	@When("click on Find_My_Next_Car button")
	public void click_on_find_my_next_car_button() {
		carsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	   
	}

	@Then("the page title should be {string}")
	public void the_page_title_should_be(String expecedTitle) {
		String actualtitle=SeleniumDriver.getDriver().getTitle();
		System.out.println(actualtitle);
		//Assert.assertEquals(expecedTitle, actualtitle);
	    
	}



	
	
	

}
