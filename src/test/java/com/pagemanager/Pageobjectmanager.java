package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingComfirmPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelpage;

/**
 * 
 * @author Dillibabu
 * @see used to create object for adactinhotel pages
 */
public class Pageobjectmanager {
	private LoginPage loginPage;
	private SearchHotelPage searchhotelPage;
	private SelectHotelpage selecthotelpage;
	private BookHotelPage bookHotelPage;
	private BookingComfirmPage bookingComfirmPage;
	private CancelBookingPage cancelBookingPage;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public SearchHotelPage getSearchhotelPage() {
		return (searchhotelPage == null) ? searchhotelPage = new SearchHotelPage() : searchhotelPage;
	}

	public SelectHotelpage getSelecthotelpage() {
		return (selecthotelpage == null) ? selecthotelpage = new SelectHotelpage() : selecthotelpage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}

	public BookingComfirmPage getBookingComfirmPage() {
		return (bookingComfirmPage == null) ? bookingComfirmPage = new BookingComfirmPage() : bookingComfirmPage;
	}

	public CancelBookingPage getcancelBookingPage() {
		return (cancelBookingPage == null) ? cancelBookingPage = new CancelBookingPage() : cancelBookingPage;
	}

}
