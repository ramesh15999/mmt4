package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_To_Cancel {
	
	public static WebDriver driver;

	public Signin_To_Cancel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signin;
	
	@FindBy(xpath="(//button[@kind='secondary'])[1]")
	private WebElement email;
	
	@FindBy(name="emailMobile")
	private WebElement enter_email;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit_email;
	
	@FindBy(name="password")
	private WebElement enter_password;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement submit;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getEnter_email() {
		return enter_email;
	}

	public WebElement getSubmit_email() {
		return submit_email;
	}

	public WebElement getEnter_password() {
		return enter_password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	


}
