package com.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pagemanager.Pageobjectmanager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass {
	Pageobjectmanager pom = new Pageobjectmanager();

	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expLoginSucessMessage) {
		Assert.assertEquals("Verify afetr Login Success Message", expLoginSucessMessage,
				pom.getSearchhotelPage().getSuccessMessage().getAttribute("value"));
		HooksClass.sc.log("verify after login success message "+" exp value: "+expLoginSucessMessage+
				" act value: "+pom.getSearchhotelPage().getSuccessMessage().getAttribute("value"));

	}


}
