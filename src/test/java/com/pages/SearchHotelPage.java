package com.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement roomNos;
	@FindBy(id = "datepick_in")
	private WebElement checkIn;
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	@FindBy(id = "child_room")
	private WebElement childPerRoom;
	@FindBy(id = "Submit")
	private WebElement Submit;
	@FindBy(id = "username_show")
	private WebElement successMessage;

	@FindBy(id = "checkin_span")
	private WebElement checkInErrorMessage;

	@FindBy(id = "checkout_span")
	private WebElement checkOuterrorMessage;

	@FindBy(id = "location_span")
	private WebElement locationErrorMessage;

	public WebElement getSuccessMessage() {
		return successMessage;
	}

	public WebElement getCheckInErrorMessage() {
		return checkInErrorMessage;
	}

	public WebElement getCheckOutErrorMessage() {
		return checkOuterrorMessage;
	}

	public WebElement getLocationErrorMessage() {
		return locationErrorMessage;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getroomType() {
		return roomType;
	}

	public WebElement getroomNos() {
		return roomNos;
	}

	public WebElement getcheckIn() {
		return checkIn;
	}

	public WebElement getcheckOut() {
		return checkOut;
	}

	public WebElement getAdult_room() {
		return adultsPerRoom;
	}

	public WebElement getChild_room() {
		return childPerRoom;
	}

	/**
	 * @see Its common step for other methods
	 * @param location
	 * @param roomNos
	 * @param checkIn
	 * @param checkOut
	 * @param adultsPerRoom
	 */
	public void searchHotelCommonStep(String location, String roomNos, String checkIn, String checkOut,
			String adultsPerRoom) {

		WebElement loc = getLocation();
		seldctbyVisibletext(loc, location);
		WebElement roomno = getroomNos();
		Sendkeys(roomno, roomNos);
		clear(getcheckIn());
		WebElement ci = getcheckIn();
		Sendkeys(ci, checkIn);
		clear(getcheckOut());
		WebElement co = getcheckOut();
		Sendkeys(co, checkOut);
		WebElement adult = getAdult_room();
		Sendkeys(adult, adultsPerRoom);

	}

	/**
	 * @see User should search hotel by entering all fields
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param roomNos
	 * @param checkIn
	 * @param checkOut
	 * @param adultsPerRoom
	 * @param childPerRoom
	 */

	public void searchHotelWithAllfields(String location, String hotels, String roomType, String roomNos,
			String checkIn, String checkOut, String adultsPerRoom, String childPerRoom) {
		searchHotelCommonStep(location, roomNos, checkIn, checkOut, adultsPerRoom);

		WebElement hol = getHotels();
		seldctbyVisibletext(hol, hotels);
		WebElement room = getroomType();
		seldctbyVisibletext(room, roomType);
		WebElement child = getChild_room();
		Sendkeys(child, childPerRoom);
		WebElement search = getSubmit();
		click(search);

	}

	/**
	 * @see User Should enter only in mandatory fields
	 * @param location
	 * @param roomNos
	 * @param checkIn
	 * @param checkOut
	 * @param adultsPerRoom
	 */
	public void mandatoryFields(String location, String roomNos, String checkIn, String checkOut,
			String adultsPerRoom) {
		searchHotelCommonStep(location, roomNos, checkIn, checkOut, adultsPerRoom);
		WebElement server = getSubmit();
		click(server);

	}

	/**
	 * @see User should not enter any fileds and click search button
	 */

	public void clickSearch() {
		WebElement submit = getSubmit();
		click(submit);

	}

}