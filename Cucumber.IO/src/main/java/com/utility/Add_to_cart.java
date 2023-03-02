package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_cart {
	
	public static WebDriver driver;
	
	public Add_to_cart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Nykaa Naturals Face Wash']")
	private WebElement wash;
	
	@FindBy(xpath="//select[@title='SHADE']")
	private WebElement shade;
	
	@FindBy(xpath="(//button[@type='button'])[13]")
	private WebElement select;
	
	public WebElement getSelect() {
		return select;
	}

	public WebElement getWash() {
		return wash;
	}

	public WebElement getShade() {
		return shade;
	}
	
}
