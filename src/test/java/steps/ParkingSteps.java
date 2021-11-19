package steps;


import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.ParkingPage;

public class ParkingSteps {

    ParkingPage parking = new ParkingPage();


    @Given("^I am on the Parking cost calculator page$")
    public void navigateToPage(){
        parking.navigateToParking();
    }

    @When("^I enter the values on the form$")
    public void fillForm(){
        parking.fillParkingForm();
    }

    @And("^click on the calculate button$")
    public void clickButton(){
        parking.clickCalculateButton();
    }

    @Then("^the price match whith the expected price$")
    public void validateResults(){
        Assert.assertEquals("$ 144.00", parking.parkingPrice());
    }

}