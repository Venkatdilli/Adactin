package com.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;

import com.pagemanager.Pageobjectmanager;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep extends BaseClass {

Pageobjectmanager pom =new Pageobjectmanager();
/**
 * @see User should select a hotel
 */
	@Then("User should select a hotel")
	public void user_should_select_a_hotel() {
	    pom.getSelecthotelpage().selectHotel();
	}
	/**
	 * @see User should verify after click continue success message
	 * @param successMessageAfterSelectHotel
	 */
	@Then("User should verify after click continue success message {string}")
	public void user_should_verify_after_click_continue_success_message(String successMessageAfterSelectHotel) {
		Assert.assertEquals("Verify the success message", successMessageAfterSelectHotel,
				pom.getBookHotelPage().getSelectSuccessMsg().getText());
		HooksClass.sc.log("verify after login success message "+" exp value: "+successMessageAfterSelectHotel+
				" act value: "+pom.getSearchhotelPage().getSuccessMessage().getText());

	}
/**
 * @see User should click continue without select any hotel name
 */
	@Then("User should click continue without select any hotel name")
	public void user_should_click_continue_without_select_any_hotel_name() {
		pom.getSelecthotelpage().Continue();
	 
	}
	/**
	 * @see User should verify without select any hotel name error message
	 * @param expSelectErrorMessage
	 */
	@Then("User should verify without select any hotel name error message {string}")
	public void user_should_verify_without_select_any_hotel_name_error_message(String expSelectErrorMessage) {
	   Assert.assertEquals("verify without select any hotel name error message",expSelectErrorMessage,pom.getSelecthotelpage().getRadioButtoonErrorMessage().getText());
	   HooksClass.sc.log("verify after login error message "+" exp value: "+expSelectErrorMessage+
				" act value: "+pom.getSelecthotelpage().getRadioButtoonErrorMessage().getText());


	}
}