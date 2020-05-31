package or;

import org.openqa.selenium.By;

public class CreatePage {

	// Home Page
	public static By txtSignIn = By.xpath("//a[@class='login']"); 
	public static By txtemailadd = By.xpath("//input[@id='email_create']"); 
	public static By btnCreate = By.xpath("//button[@name=\"SubmitCreate\"]"); 
																				
	// Select Title
	//public static By selectRadio = By.xpath("//div[@class='clearfix']//div[1]//label[1]"); // gender
	public static By selectRadio = By.cssSelector("#id_gender1"); 
	public static By entFirstName = By.xpath("//input[@id='customer_firstname']"); // FirstName
	public static By entLastName = By.xpath("//input[@id='customer_lastname']"); // LastName
	public static By entPassword = By.id("passwd"); // Password

	// Enter your address
	public static By txtFName = By.id("firstname");
	public static By txtLName = By.id("lastname");
	public static By txtCompany = By.id("company");
	public static By txtAddress = By.id("address1");
	public static By txtCity = By.id("city");

	// Select State
	public static By txtStateN = By.name("id_state");
	public static By txtPostCode = By.name("postcode");

	// Enter Mobile Number
	public static By entPhoneNo = By.id("phone_mobile");
	public static By txtClear = By.xpath("//input[@name=\"alias\"]");
	public static By entOffice = By.xpath("//input[@name=\"alias\"]");
	public static By btnSubmitAcc = By.name("submitAccount");
	public static By txtuser = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	
	
	 //Click on Sign out
	public static By signOut = By.xpath("//a[@class='logout']");
	 
	  
	  
	  //Login
	public static By pEmail = By.id("email");
	public static By pSubmitLogin = By.id("SubmitLogin");
			
	 
	//Click on Women
	public static By selectWomen = By.linkText("WOMEN");
	
	  
	//Change quantity by 2
	public static By selectQuantity = By.id("quantity_wanted");
	
	
	  //Select Color
	public static By selectColor = By.id("color_11");
	 

	  //Click on add to cart
	public static By addCard = By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']");
	  

	  //Click on proceed
	public static By itemProceed =  By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span");
	
	  //Checkout page Proceed
	public static By pageProceed = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span");
	public static By pagePro = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span");
	
	  
	  
	  //Agree terms&Conditions
	public static By termsCon = By.xpath("//*[@id=\"cgv\"]");
	public static By termsConbtn = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span");
	  

	 //Click on Payby Check
	public static By payCheck = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a");
			
	  
	 //Confirm the order
	public static By confirmOrder = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span");
			
	//Get Text
	public static By confText = By.xpath("//div[@id='center_column']/p[@class='alert alert-success']");	
	 
}
