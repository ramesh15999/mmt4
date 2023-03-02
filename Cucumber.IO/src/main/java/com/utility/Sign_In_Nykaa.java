package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Nykaa {
	
	public static WebDriver driver;

	public Sign_In_Nykaa(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "//button[text()='Log In']")
	private WebElement login;
	
	@FindBy(xpath ="//input[@type='email']")
	private WebElement email_click;
	
	@FindBy(name = "emailMobile")
	private WebElement email_send;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement pass_click;
	
	@FindBy(name="password")
	private WebElement pass_send;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement submit;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail_click() {
		return email_click;
	}

	public WebElement getEmail_send() {
		return email_send;
	}

	public WebElement getPass_click() {
		return pass_click;
	}

	public WebElement getPass_send() {
		return pass_send;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	

}
