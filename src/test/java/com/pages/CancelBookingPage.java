package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pagemanager.Pageobjectmanager;

public class CancelBookingPage extends BaseClass {
	Pageobjectmanager pom = new Pageobjectmanager();

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Booked Itinerary')]")
	private WebElement bookedItinerary;
	@FindBy(id = "order_id_text")
	private WebElement searchOderID;
	@FindBy(id = "search_hotel_id")
	private WebElement clickGo;
	@FindBy(xpath = "//input[@type='button']")
	private WebElement cancelOderID;
	@FindBy(id = "search_result_error")
	private WebElement cancelSuccessMessage;

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getSearchOderID() {
		return searchOderID;
	}

	public WebElement getClickGo() {
		return clickGo;
	}

	public WebElement getCancelOderID() {
		return cancelOderID;
	}

	public WebElement getCancelSuccessMessage() {
		return cancelSuccessMessage;
	}
	/**
	 * @see User should cancel the existing order Id
	 * @param orderID
	 */

	public void CancelOderID(String orderID) {
		WebElement bookedItinerary2 = getBookedItinerary();
		click(bookedItinerary2);
		WebElement searchOderID2 = getSearchOderID();
		Sendkeys(searchOderID2, orderID);
		WebElement clickGo2 = getClickGo();
		click(clickGo2);
		WebElement cancelOderID2 = getCancelOderID();
		click(cancelOderID2);
		alertAccept();
	}

}
