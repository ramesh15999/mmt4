package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Address {

	public static WebDriver driver;

	public Add_Address(WebDriver driver) {

		this. driver = driver;
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath = "//div[@class='css-1pan5g8 e1gecm6x0']")
	private WebElement new_address;

	@FindBy(xpath = "(//input[@type='number'])[1]")
	private WebElement enter_pincode;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement address;

	@FindBy(xpath = "//textarea[@class='input-element input-area ']")
	private WebElement enter_area;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement enter_name;

	@FindBy(xpath = "(//input[@type='number'])[2]")
	private WebElement enter_number;

	@FindBy(xpath = "//button[text()='Ship to this address']")
	private WebElement ship;

	public WebElement getNew_address() {
		return new_address;
	}

	public WebElement getEnter_pincode() {
		return enter_pincode;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEnter_area() {
		return enter_area;
	}

	public WebElement getEnter_name() {
		return enter_name;
	}

	public WebElement getEnter_number() {
		return enter_number;
	}

	public WebElement getShip() {
		return ship;
	}

}
