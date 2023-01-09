package com.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pagemanager.Pageobjectmanager;

import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep extends BaseClass {
	Pageobjectmanager pom=new Pageobjectmanager();
	/**
	 * @see user should cancel the order ID
	 */

	@Then("User should cancel the generated order Id")
	public void user_should_cancel_the_generated_order_id() {
		WebElement orderID = pom.getBookingComfirmPage().getOrderID();
		pom.getcancelBookingPage().CancelOderID(getAttributeByJs(orderID));
	   
	}
	/**
	 * @see User should cancel the order ID and verify success message
	 * @param cancelBookingErrorMessage
	 */

	@Then("User should verify the success message after canceling order id {string}")
	public void user_should_verify_the_success_message_after_canceling_order_id(String cancelBookingErrorMessage) {
	  Assert.assertEquals("User should verify the success message after canceling order id", cancelBookingErrorMessage,pom.getcancelBookingPage().getCancelSuccessMessage().getText());
	  HooksClass.sc.log("verify after login success message "+" exp value: "+cancelBookingErrorMessage+
				" act value: "+pom.getcancelBookingPage().getCancelSuccessMessage().getText());
	}



	

	@Then("User should cancel existing order ID {string}")
	public void user_should_cancel_existing_order_id(String orderID ) {
		pom.getcancelBookingPage().CancelOderID(orderID);
	}
	
	}






