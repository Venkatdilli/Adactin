package com.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;

import com.pagemanager.Pageobjectmanager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends BaseClass {
	Pageobjectmanager pom = new Pageobjectmanager();

	/**
	 * @see User should enter all fields in SlectHotel Page
	 * @param firstname
	 * @param lastname
	 * @param billingaddress
	 * @param dataTable
	 */

	@Then("User should enter all fields in {string},{string} and {string}")
	public void user_should_enter_all_fields_in_and(String firstname, String lastname, String billingaddress,
			io.cucumber.datatable.DataTable dataTable) {
		pom.getBookHotelPage().bookHotel(firstname, lastname, billingaddress, dataTable);

	}

	/**
	 * @see User should verify after booking success message
	 * @param bookHotelSuccessMessage
	 */
	@Then("User should verify after booking success message {string} and save the generated order ID")
	public void user_should_verify_after_booking_success_message_and_save_the_generated_order_id(
			String bookHotelSuccessMessage) {
		implicitWait();
		Assert.assertEquals("User should verify after booking success message ", bookHotelSuccessMessage,
				pom.getBookHotelPage().getBookingConfirmantion().getText());
		HooksClass.sc.log("verify after login success message " + " exp value: " + bookHotelSuccessMessage
				+ " act value: " + pom.getBookHotelPage().getBookingConfirmantion().getText());

	}

	/**
	 * @see User should click book now without entering any fields
	 */

	@Then("User should click book now without entering any fields")
	public void user_should_click_book_now_without_entering_any_fields() {
		pom.getBookHotelPage().withOutEnteringAnyFields();

	}

	/**
	 * @see User should verify error message with entering any field
	 * @param firstNameErrorMessage
	 * @param lastNameErrorMessage
	 * @param adderssErrorMessage
	 * @param cardNumberErrorMessage
	 * @param cardTypeErrorMessage
	 * @param expiryDateErrorMessage
	 * @param cvverrorMessage
	 */
	@Then("User should verify error message {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_message_and(String firstNameErrorMessage, String lastNameErrorMessage,
			String adderssErrorMessage, String cardNumberErrorMessage, String cardTypeErrorMessage,
			String expiryDateErrorMessage, String cvverrorMessage) {
		Assert.assertEquals("User should verify error message", firstNameErrorMessage,
				pom.getBookHotelPage().getFirstNameErrorMessage().getText());
		HooksClass.sc.log("verify after login error message " + " exp value: " + firstNameErrorMessage
				+ " act value: " + pom.getBookHotelPage().getFirstNameErrorMessage().getText());

		Assert.assertEquals("User should verify error message", lastNameErrorMessage,
				pom.getBookHotelPage().getLastNameErrorMessage().getText());
		HooksClass.sc.log("verify after login error message " + " exp value: " + lastNameErrorMessage + " act value: "
				+ pom.getBookHotelPage().getLastNameErrorMessage().getText());

		Assert.assertEquals("User should verify error message", adderssErrorMessage,
				pom.getBookHotelPage().getAdderssErrorMessage().getText());
		HooksClass.sc.log("verify after login error message " + " exp value: " + adderssErrorMessage + " act value: "
				+ pom.getBookHotelPage().getAdderssErrorMessage().getText());

		Assert.assertEquals("User should verify error message", cardNumberErrorMessage,
				pom.getBookHotelPage().getCardNumberErrorMessage().getText());
		HooksClass.sc.log("verify after login error message " + " exp value: " + cardNumberErrorMessage
				+ " act value: " + pom.getBookHotelPage().getCardNumberErrorMessage().getText());

		Assert.assertEquals("User should verify error message", cardTypeErrorMessage,
				pom.getBookHotelPage().getCardTypeErrorMessage().getText());
		HooksClass.sc.log("verify after login error message " + " exp value: " + cardTypeErrorMessage + " act value: "
				+ pom.getBookHotelPage().getCardTypeErrorMessage().getText());

		Assert.assertEquals("User should verify error message", expiryDateErrorMessage,
				pom.getBookHotelPage().getExpiryDateErrorMessage().getText());
		HooksClass.sc.log("verify after login error message " + " exp value: " + expiryDateErrorMessage
				+ " act value: " + pom.getBookHotelPage().getExpiryDateErrorMessage().getText());

		Assert.assertEquals("User should verify error message", cvverrorMessage,
				pom.getBookHotelPage().getCvvErrorMessage().getText());
		HooksClass.sc.log("verify after login error message " + " exp value: " + cvverrorMessage + " act value: "
				+ pom.getBookHotelPage().getCvvErrorMessage().getText());
	}

}
