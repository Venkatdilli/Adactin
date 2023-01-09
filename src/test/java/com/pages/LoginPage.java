package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement passWord;
	@FindBy(id="login")
	private WebElement loginBtn;
	@FindBy(xpath="//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]")
	private WebElement errorMessage;
	public WebElement getUsername() {
		return userName;
	}
	public WebElement getPassword() {
		return passWord;
	}
	public WebElement getLoginbutton() {
		return loginBtn;
	}
	public WebElement getErrorMessage() {
		return errorMessage;
	} 
	/**
	 * @see Its common steps for other methods
	 * @param userName
	 * @param passWord
	 */
	public void logincommonstep(String userName,String passWord)
	{ 
		WebElement txtuser= getUsername();
		Sendkeys(txtuser, userName);
		WebElement txtpass=getPassword();
		Sendkeys(txtpass, passWord);
		}
	/**
	 * @see user should perform login with login button
	 * @param userName
	 * @param passWord
	 */
	public void login(String userName,String passWord)
	{
		logincommonstep(userName,passWord);
		WebElement click =getLoginbutton();
		click(click);
	}
	/**
	 * @see User should perform login with enter key
	 * @param userName
	 * @param passWord
	 * @throws AWTException
	 */
	public void loginwithEnterKey(String userName,String passWord) throws AWTException
	{
		logincommonstep(userName,passWord);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	}

