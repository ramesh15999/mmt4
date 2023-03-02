package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class COD {
	
	public static WebDriver driver;

	public COD(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[text()='Cash on delivery']")
	private WebElement cod;
	
	@FindBy(xpath = "//button[text()='Place order']")
	private WebElement click;

	public WebElement getCod() {
		return cod;
	}

	public WebElement getClick() {
		return click;
	}
	
	

}
