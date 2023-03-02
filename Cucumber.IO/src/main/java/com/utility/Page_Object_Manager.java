package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {

	public static WebDriver driver;
	private Product_search ps;
	private Add_to_cart atc;
	private Proceed_to_Checkout ptc;
	private Sign_In_Nykaa sin;
	private Add_Address aa;
	private COD cod;
	private Signin_To_Cancel stc;
	private Cancel_Product cp;
	
	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Product_search getPs() {
		ps = new Product_search(driver);
		return ps;
	}

	public Add_to_cart getAtc() {
		atc = new Add_to_cart(driver);
		return atc;
	}

	public Proceed_to_Checkout getPtc() {
		ptc = new Proceed_to_Checkout(driver);
		return ptc;
	}

	public Sign_In_Nykaa getSin() {
		sin = new Sign_In_Nykaa(driver);
		return sin;
	}

	public Add_Address getAa() {
		aa = new Add_Address(driver);
		return aa;
	}

	public COD getCod() {
		cod = new COD(driver);
		return cod;
	}

	public Signin_To_Cancel getStc() {
		stc = new Signin_To_Cancel(driver);
		return stc;
	}

	public Cancel_Product getCp() {
		cp = new Cancel_Product(driver);
		return cp;
	}
	
	
}
