package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pagemanager.Pageobjectmanager;

import io.cucumber.java.en.*;
import io.netty.handler.codec.http.multipart.HttpPostMultipartRequestDecoder;

public class TC1_LoginStep extends BaseClass {

	Pageobjectmanager pom = new Pageobjectmanager();

	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() throws FileNotFoundException, IOException {
	

	}
/**
 * @see user should perform login
 * @param userName
 * @param passWord
 */
	@When("User should perform login {string},{string}")
	public void user_should_perform_login(String userName, String passWord) {
		pom.getLoginPage().login(userName, passWord);
	}
/**
 * @see user should perform login with enter key
 * @param userName
 * @param passWord
 * @throws AWTException
 */
	@When("User should perform login {string},{string} with Enter Key")
	public void user_should_perform_login_with_enter_key(String userName, String passWord) throws AWTException {
		pom.getLoginPage().loginwithEnterKey(userName, passWord);
	}
/**
 * @see User should verify after login with invaild credential error message contain
 * @param expectedLoginErrorMessage
 */
	@Then("User should verify after login with invaild credential error message contain {string}")
	public void user_should_verify_after_login_with_invaild_credential_error_message_contain(
			String expectedLoginErrorMessage) {
		WebElement errormsg = pom.getLoginPage().getErrorMessage();
		String text = getText(errormsg);
		boolean contains = text.contains(expectedLoginErrorMessage);
		Assert.assertTrue(contains);
		HooksClass.sc.log("verify after login erorr message "+" exp value: "+expectedLoginErrorMessage+
				" act value: "+text);

	}

}
