package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelpage extends BaseClass {
	public SelectHotelpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;

	@FindBy(id = "continue")
	private WebElement buttonContinue;

	@FindBy(xpath = "//label[@id='radiobutton_span']")
	private WebElement radioButtonErrorMessage;

	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement slectHotelSuccessSelectMessage;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getButtonContinue() {
		return buttonContinue;
	}

	public WebElement getRadioButtoonErrorMessage() {
		return radioButtonErrorMessage;
	}

	public WebElement getSelectHotelSuccessSelectMessage() {
		return slectHotelSuccessSelectMessage;
	}

	/**
	 * @see User should click radio button and click continue
	 */
	public void selectHotel() {

		click(getRadioButton());
		click(getButtonContinue());
	}

	/**
	 * @see User should not click radio button and click continue
	 */
	public void Continue() {
		click(getButtonContinue());
	}
}