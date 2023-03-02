Feature: To order and cancel a product in Nykaa 

Scenario: To search the product after launching the url 
	Given user can launch the url 
	When user can go to the skin tab 
	And user can go select skin wash 
	Then user will be able to successfully switch to face wash tab. 
	
Scenario: To add the product to the cart 
	Given user can select the preferred face wash 
	When user can select the shade of the face wash 
	And user can add the product to the bag 
	Then user can now see the product in the cart. 
	
Scenario: Proceed to check out 

	Given user can go to the cart option 
	When user can click the required quantity 
	And user needs to click on proceed 
	Then User can successfully proceed to check out. 
	
Scenario: Sign_in to Nykaa 

	Given user can click on sign_in 
	When user can enter the mobile number and password 
	And user can click on login button 
	Then User can successfully login into Nykaa. 
	
Scenario: Add address for shipping 

	Given User can click on add new address 
	When User can enter the complete address in the given field 
	And User can enter the Contact information in the given field 
	Then User can click on ship to this address. 
	
Scenario: Placing order and taking screenshot 

	Given User can select Cash on Delivery as payment method 
	When User can click on place order 
	And User can take the screenshot of the order placed 
	Then User has now sucessfully placed the order. 
	
Scenario: Sign to cancel the placed order 

	Given User can launch the url and click on the sign in button 
	When User can enter the email in the given field 
	And User can enter the password in the given field 
	Then user will be able to successfully login. 
	
Scenario: Cancel the product and take screenshot 
	Given User can go to the orders 
	When User can click on order details and cancel order 
	And User can provide the reason for cancellation and click on submit 
	Then user will be able to successfully cancel the order and take screenshot. 
	
	