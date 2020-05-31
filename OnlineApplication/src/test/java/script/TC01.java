package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commands.ActionDriver;
import configs.StarBrowser;
import or.CreatePage;

public class TC01 extends StarBrowser {

	public static ActionDriver ad;
	public static WebElement statedropdown, countrydropDown, SecondImg, MoreBtn, Sizedrpdwn;
	public static Select oSelect, oSelectC;
	public static String userText, ConfirmationText;

	@Test(priority = 1)
	public void CreateAccount() {

		ad = new ActionDriver();

		// URL
		ad.navigateToApplication("http://automationpractice.com/index.php");

		// Home Page
		ad.click(CreatePage.txtSignIn);
		ad.type(CreatePage.txtemailadd, "ganesh20@test.com");
		ad.click(CreatePage.btnCreate);

		// Select Title 
		ad.click(CreatePage.selectRadio);
		ad.type(CreatePage.entFirstName, "Test User");
		ad.type(CreatePage.entLastName, "Vsoft");
		ad.type(CreatePage.entPassword, "PKR@PKR");

		// Enter your address 
		ad.type(CreatePage.txtFName, "Test User");
		ad.type(CreatePage.txtLName, "Vsoft");
		ad.type(CreatePage.txtCompany, "Vsoft");
		ad.type(CreatePage.txtAddress, "Test 81/1,2nd cross");
		ad.type(CreatePage.txtCity, "XYZ");

		// Select State 
		statedropdown = driver.findElement(By.name("id_state"));
		oSelect = new Select(statedropdown);
		oSelect.selectByValue("4");
		ad.type(CreatePage.txtPostCode, "51838");

		// Select Country 
		countrydropDown = driver.findElement(By.name("id_country"));
		oSelectC = new Select(countrydropDown);
		oSelectC.selectByVisibleText("United States");

		// Enter Mobile Number 
		ad.type(CreatePage.entPhoneNo, "234567890");
		ad.clear(CreatePage.txtClear);
		ad.type(CreatePage.entOffice, "Office");
		ad.click(CreatePage.btnSubmitAcc);
		userText = ad.gettext(CreatePage.txtuser);

		// Validate that user has created
		if (userText.contains("Vsoft")) {
			System.out.println("User Verified,Test case Passed");
		} else {
			System.out.println("User Verification Failed,Test case Failed");
		}
	}

	@Test(priority = 2, dependsOnMethods = "CreateAccount")
	public void ProductOrder() {

		// Click on Sign out
		ad.click(CreatePage.signOut);

		// Click on Sign in
		ad.click(CreatePage.txtSignIn);

		// Login
		ad.type(CreatePage.pEmail, "ganesh20@test.com");
		ad.type(CreatePage.entPassword, "PKR@PKR");
		ad.click(CreatePage.pSubmitLogin);

		// Click on Women
		ad.click(CreatePage.selectWomen);
		SecondImg = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
		MoreBtn = driver.findElement(
				By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();

		// Change quantity by 2
		ad.clear(CreatePage.selectQuantity);
		ad.type(CreatePage.selectQuantity, "2");

		// Select size as L
		Sizedrpdwn = driver.findElement(By.xpath("//*[@id='group_1']"));
		Select oSelect = new Select(Sizedrpdwn);
		oSelect.selectByVisibleText("M");

		// Select Color
		ad.click(CreatePage.selectColor);

		// Click on add to cart
		ad.click(CreatePage.addCard);

		// Click on proceed
		ad.click(CreatePage.itemProceed);

		// Checkout page Proceed
		ad.click(CreatePage.pageProceed);
		ad.click(CreatePage.pagePro);

		// Agree terms&Conditions
		ad.click(CreatePage.termsCon);
		ad.click(CreatePage.termsConbtn);

		// Click on Payby Check
		ad.click(CreatePage.payCheck);

		// Confirm the order
		ad.click(CreatePage.confirmOrder);

		// Get Text
		ConfirmationText = ad.gettext(CreatePage.confText);

		// Verify that Product is ordered
		if (ConfirmationText.contains("complete")) {
			System.out.println("Order Completed: Test Case Passed");
		} else {
			System.out.println("Order Not Successfull: Test Case Failed");
		}
	}

}
