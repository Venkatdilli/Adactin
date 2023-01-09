package com.pages;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement ccNum;
	
	@FindBy(id = "cc_type")
	private WebElement ccType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id = "book_now")
	private WebElement bookNow;
	
	@FindBy(id="first_name_span")
	private WebElement firstNameErrorMessage;
	
	@FindBy(id="last_name_span")
	private WebElement lastNameErrorMessage;
	
	@FindBy(id="address_span")
	private WebElement adderssErrorMessage;
	
	@FindBy(id="cc_num_span")
	private WebElement cardNumberErrorMessage;
	
	@FindBy(id="cc_type_span")
	private WebElement cardTypeErrorMessage;
	
	@FindBy(id="cc_expiry_span")
	private WebElement expiryDateErrorMessage;
	
	@FindBy(id="cc_cvv_span")
	private WebElement cvvErrorMessage;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public WebElement getFirstNameErrorMessage() {
		return firstNameErrorMessage;
	}
	public WebElement getLastNameErrorMessage() {
		return lastNameErrorMessage;
	}
	public WebElement getAdderssErrorMessage() {
		return adderssErrorMessage;
	}
	public WebElement getCardNumberErrorMessage() {
		return cardNumberErrorMessage;
	}
	public WebElement getCardTypeErrorMessage() {
		return cardTypeErrorMessage;
	}
	public WebElement getExpiryDateErrorMessage() {
		return expiryDateErrorMessage;
	}
	public WebElement getCvvErrorMessage() {
		return cvvErrorMessage;
	}
	public WebElement getBookingConfirmantion() {
		return bookingConfirmantion;
	}
	public WebElement getSelectSuccessMsg() {
		return selectSuccessMsg;
	}

	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingConfirmantion;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement selectSuccessMsg;
	

/**
 * @see User should perform entering by all fields
 * @param firstname
 * @param lastname
 * @param billingaddress
 * @param dataTable
 */
	public void bookHotel(String firstname, String lastname, String billingaddress,DataTable dataTable)
			 {
		WebElement fn = getFirstname();
		Sendkeys(fn, firstname);
		WebElement ln = getLastname();
		Sendkeys(ln, lastname);
		WebElement bill = getAddress();
		Sendkeys(bill, billingaddress);
		
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		String cardNum = map.get("CreditCardNo");
		String creditType = map.get("CreditCardType");
		String expiryMon = map.get("Expirymonth");
		String expiryYr = map.get("Expiryyear");
		String ccvNum = map.get("CVVNumber");
		
		Sendkeys(getCcNum(), cardNum);
		Sendkeys(getCcType(), creditType);
		Sendkeys(getExpiryMonth(), expiryMon);
		Sendkeys(getExpiryYear(), expiryYr);
		Sendkeys(getCvvNumber(), ccvNum);
		WebElement bk=getBookNow();
		btnclick(bk);
		
	}
	/**
	 * @see User should perform without entering all fields
	 */
	public void withOutEnteringAnyFields() {
WebElement bk=getBookNow();
btnclick(bk);
	}

}