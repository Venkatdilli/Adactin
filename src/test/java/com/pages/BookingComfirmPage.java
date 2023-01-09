package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingComfirmPage extends BaseClass {
	public  BookingComfirmPage()
	{	
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderID;
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingConfirmation;
	public WebElement getOrderID() {
		return orderID;
	}
	public WebElement getBookingConfirmation() {
		return bookingConfirmation;
	}
	/**
	 * @see User should get booking Id 
	 * @return
	 */
	
	public String getBookingID() {
		String attributeByJs = getAttributeByJs(bookingConfirmation);
		return attributeByJs;
	}
	
}
