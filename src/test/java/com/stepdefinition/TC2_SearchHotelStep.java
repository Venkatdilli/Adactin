package com.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pagemanager.Pageobjectmanager;

import io.cucumber.java.en.Then;

public class TC2_SearchHotelStep extends BaseClass {
	Pageobjectmanager pom = new Pageobjectmanager();
	
/**
 * @see User should search hotels
 * @param location
 * @param hotels
 * @param roomType
 * @param roomNos
 * @param checkIn
 * @param checkOut
 * @param adultsPerRoom
 * @param childPerRoom
 */
	@Then("User should search hotels {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_search_hotels_and(String location, String hotels, String roomType, String roomNos,
			String checkIn, String checkOut, String adultsPerRoom, String childPerRoom) {
		pom.getSearchhotelPage().searchHotelWithAllfields(location, hotels, roomType, roomNos, checkIn, checkOut,
				adultsPerRoom, childPerRoom);
	}
	/**
	 * @see User should verify after click search success message
	 * @param searchsuccessMessage
	 */
	@Then("User should verify after click search success message {string}")
	public void user_should_verify_after_click_search_success_message(String searchsuccessMessage) {
		Assert.assertEquals("verify after click search success message", searchsuccessMessage,
				  pom.getSelecthotelpage().getSelectHotelSuccessSelectMessage().getText());
		HooksClass.sc.log("verify after login success message "+" exp value: "+searchsuccessMessage+
				" act value: "+pom.getSelecthotelpage().getSelectHotelSuccessSelectMessage().getText());

	}
/**
 * @see User should enter mandatory fields 
 * @param location
 * @param roomNos
 * @param checkIn
 * @param checkOut
 * @param adultsPerRoom
 */
	@Then("User should enter mandatory fields {string},{string},{string},{string} and {string}")
	public void user_should_enter_mandatory_fields_and(String location, String roomNos, String checkIn, String checkOut,
			String adultsPerRoom) {
		pom.getSearchhotelPage().mandatoryFields(location, roomNos, checkIn, checkOut, adultsPerRoom);
	}
	/**
	 * @see User should enter wrong data
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param roomNos
	 * @param checkIn
	 * @param checkOut
	 * @param adultsPerRoom
	 * @param childPerRoom
	 */

	@Then("User should wrong data {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_wrong_data_and(String location, String hotels, String roomType, String roomNos,
			String checkIn, String checkOut, String adultsPerRoom, String childPerRoom) {
		pom.getSearchhotelPage().searchHotelWithAllfields(location, hotels, roomType, roomNos, checkIn, checkOut,
				adultsPerRoom, childPerRoom);
	}
/**
 * @see User should verify invalid checkIn Date and checkOut Date 
 * @param CheckInDateshallbebeforethanCheckOutDate
 * @param CheckOutDateshallbeafterthanCheckInDate
 */
	@Then("User should verify invalid checkIn Date and checkOut Date {string} and {string}")
	public void user_should_verify_invalid_check_in_date_and_check_out_date_and(String CheckInDateshallbebeforethanCheckOutDate, String CheckOutDateshallbeafterthanCheckInDate) {
		Assert.assertEquals("Verify Error message", CheckInDateshallbebeforethanCheckOutDate, pom.getSearchhotelPage().getCheckInErrorMessage().getText());
		Assert.assertEquals("Verify Error message", CheckOutDateshallbeafterthanCheckInDate, pom.getSearchhotelPage().getCheckOutErrorMessage().getText());
	}
/**
 * @see User should not enter any fields
 */
	@Then("User should not enter any fields")
	public void user_should_not_enter_any_fields() {
		pom.getSearchhotelPage().clickSearch();
	}
	/**
	 * @see User should click search verify error message
	 * @param WithOutAnyField
	 */

	@Then("User should click search verify error message {string}")
	public void user_should_click_search_verify_error_message(String WithOutAnyField) {
		WebElement searcherrorMsg = pom.getSearchhotelPage().getLocationErrorMessage();
		String searcherror = getText(searcherrorMsg);
		boolean contains = searcherror.contains(WithOutAnyField);
		Assert.assertTrue("verify after search hotel the error message", contains);
		HooksClass.sc.log("verify after login success message "+" exp value: "+WithOutAnyField+
				" act value: "+searcherror);


	}

}
