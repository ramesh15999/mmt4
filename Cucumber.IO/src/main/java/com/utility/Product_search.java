package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_search {
	
	WebDriver driver;
	
	public Product_search(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//a[text()='skin'])[2]")
	private WebElement skin;
	
	@FindBy(xpath ="//a[text()='Face wash for Oily Skin']")
	private WebElement select;

	public WebElement getSkin() {
		return skin;
	}

	public WebElement getSelect() {
		return select;
	}
}
