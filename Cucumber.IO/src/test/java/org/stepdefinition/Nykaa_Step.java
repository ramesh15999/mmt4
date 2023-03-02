package org.stepdefinition;

import java.io.IOException;

import com.cucumber.Base_Class;
import com.utility.Page_Object_Manager;

import io.cucumber.java.en.*;

public class Nykaa_Step extends Base_Class {

	Page_Object_Manager pom = new Page_Object_Manager(driver);

//	PRODUCT SEARCH
	
	@Given("user can launch the url")
	public void user_can_launch_the_url() {

		url("get", "https://www.nykaa.com/");
	}

	@When("user can go to the skin tab")
	public void user_can_go_to_the_skin_tab() {
		
		waits_implicit();
		Actions("move to element", pom.getPs().getSkin());

	}

	@When("user can go select skin wash")
	public void user_can_go_select_skin_wash() {
		webelement_methods("click", pom.getPs().getSelect());
	}

	@Then("user will be able to successfully switch to face wash tab.")
	public void user_will_be_able_to_successfully_switch_to_face_wash_tab() {
		webdriver_methods("window handles");
	}

//	ADD TO CART

	@Given("user can select the preferred face wash")
	public void user_can_select_the_preferred_face_wash() {

		webelement_methods("click", pom.getAtc().getWash());
		webdriver_methods("window handles");

	}

	@When("user can select the shade of the face wash")
	public void user_can_select_the_shade_of_the_face_wash() {
		webelement_methods("click", pom.getAtc().getShade());
		select("text", pom.getAtc().getShade(), "Sandalwood & Orange Peel");

	}

	@When("user can add the product to the bag")
	public void user_can_add_the_product_to_the_bag() {
		webelement_methods("click", pom.getAtc().getSelect());

	}

	@Then("user can now see the product in the cart.")
	public void user_can_now_see_the_product_in_the_cart() {

		System.out.println("Product successfully added in the cart");

	}

//	PROCEED TO CHECK OUT
	
	@Given("user can go to the cart option")
	public void user_can_go_to_the_cart_option() {
		webelement_methods("click", pom.getPtc().getCart());
		driver.switchTo().frame(0);
	}

	@When("user can click the required quantity")
	public void user_can_click_the_required_quantity() {
		webelement_methods("click", pom.getPtc().getQuantity());
		webelement_methods("click", pom.getPtc().getNumber());
	}

	@When("user needs to click on proceed")
	public void user_needs_to_click_on_proceed() {
		webelement_methods("click", pom.getPtc().getProceed());

	}

	@Then("User can successfully proceed to check out")
	public void user_can_successfully_proceed_to_check_out() {
		System.out.println("Successfully added the product to the cart");
	}

	
//	SIGN IN
	
	@Given("user can click on sign_in")
	public void user_can_click_on_sign_in() {
		webelement_methods("click", pom.getSin().getLogin());
	}

	@When("user can enter the mobile number and password")
	public void user_can_enter_the_mobile_number_and_password() {
		webelement_methods("click", pom.getSin().getEmail_click());
		input(pom.getSin().getEmail_send(), "rameshtrichy555@gmail.com");
		webelement_methods("click", pom.getSin().getPass_click());
		input(pom.getSin().getPass_send(), "Rameshmohan");
	}

	@When("user can click on login button")
	public void user_can_click_on_login_button() {
		webelement_methods("click", pom.getSin().getSubmit());
	}

	@Then("User can successfully login into Nykaa.")
	public void user_can_successfully_login_into_nykaa() {
		System.out.println("User can now successfully sign in to Nykaa");
	}

//	ADD ADDRESS 
	
	@Given("User can click on add new address")
	public void user_can_click_on_add_new_address() {

		webelement_methods("click", pom.getAa().getNew_address());
	}

	@When("User can enter the complete address in the given field")
	public void user_can_enter_the_complete_address_in_the_given_field() throws InterruptedException {
		input(pom.getAa().getEnter_pincode(), "620102");
		webelement_methods("click", pom.getAa().getAddress());
		Thread.sleep(3000);
		input(pom.getAa().getAddress(), "No.123,muthuplots");
		input(pom.getAa().getEnter_area(), "Adhavathur,Trichy");
	}

	@When("User can enter the Contact information in the given field")
	public void user_can_enter_the_contact_information_in_the_given_field() {
		input(pom.getAa().getEnter_name(), "Ramesh");
		input(pom.getAa().getEnter_number(), "7338922626");
		
	}

	@Then("User can click on ship to this address.")
	public void user_can_click_on_ship_to_this_address() {
		
		webelement_methods("click", pom.getAa().getShip());

	}
	
//	CASH ON DELIVERY
	
	@Given("User can select Cash on Delivery as payment method")
	public void user_can_select_cash_on_delivery_as_payment_method() {
		waits_implicit();
		webelement_methods("click", pom.getCod().getCod());
	}

	@When("User can click on place order")
	public void user_can_click_on_place_order() {
		webelement_methods("click", pom.getCod().getClick());
	}

	@When("User can take the screenshot of the order placed")
	public void user_can_take_the_screenshot_of_the_order_placed() throws IOException, InterruptedException {
		Thread.sleep(5000);
		screenshot("Order Placed");
	}

	@Then("User has now sucessfully placed the order.")
	public void user_has_now_sucessfully_placed_the_order() {
		System.out.println("user has now successfully placed the order");
		
	}
	
//	SIGN IN TO CANCEL ORDER
	
	@Given("User can launch the url and click on the sign in button")
	public void user_can_launch_the_url_and_click_on_the_sign_in_button() {

		waits_implicit();
		webelement_methods("click", pom.getStc().getSignin());
		webelement_methods("click", pom.getStc().getEmail());
	}

	@When("User can enter the email in the given field")
	public void user_can_enter_the_email_in_the_given_field() {

		input(pom.getStc().getEnter_email(), "rameshtrichy555@gmail.com");
		webelement_methods("click", pom.getStc().getSubmit_email());
	}

	@When("User can enter the password in the given field")
	public void user_can_enter_the_password_in_the_given_field() {

		input(pom.getStc().getEnter_password(), "Rameshmohan");
		webelement_methods("click", pom.getStc().getSubmit());

	}

	@Then("user will be able to successfully login.")
	public void user_will_be_able_to_successfully_login() throws InterruptedException {
		System.out.println("User can successfully login to cancel the product");
		Thread.sleep(8000);
	}

//	CANCEL ORDER
	
	@Given("User can go to the orders")
	public void user_can_go_to_the_orders() {

		webelement_methods("click", pom.getCp().getUsername());
		webelement_methods("click", pom.getCp().getOrders());
		driver.switchTo().frame(0);

	}

	@When("User can click on order details and cancel order")
	public void user_can_click_on_order_details_and_cancel_order() {
		webelement_methods("Click", pom.getCp().getSelect_order());
		driver.switchTo().frame(0);
		webelement_methods("click", pom.getCp().getCancel_order());
	}

	@When("User can provide the reason for cancellation and click on submit")
	public void user_can_provide_the_reason_for_cancellation_and_click_on_submit() {
		webelement_methods("click", pom.getCp().getReason());
		webelement_methods("click", pom.getCp().getReason_select());
		webelement_methods("click", pom.getCp().getCancel());
	}

	@Then("user will be able to successfully cancel the order and take screenshot.")
	public void user_will_be_able_to_successfully_cancel_the_order_and_take_screenshot() throws IOException, InterruptedException {
		webelement_methods("click", pom.getCp().getConfirm());
		Thread.sleep(10000);
		screenshot("Order Cancelled");
	}

}
