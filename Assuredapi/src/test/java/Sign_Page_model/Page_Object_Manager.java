package Sign_Page_model;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public static WebDriver  driver {
		
		private Product_search ps;
		private Add_to_cart atc;
		
		
		
		public Page_Object_Manager(webDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
			
		}
		
		public product_search getps() {
			ps = new product_search(driver);
			return ps;
		}
	public Add_to_cart getAtc() {
		atc = new Add_to_cart(driver);
		return atc;
	}
}
	
	
	
	
	
	
	
 

