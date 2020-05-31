package commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import configs.BrowserLaunch;

public class ActionDriver {

	WebDriver driver;

	public ActionDriver() {
		driver = BrowserLaunch.driver;
	}

	public void navigateToApplication(String url) {
		driver.get(url);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void type(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public String gettext(By locator) {
		return driver.findElement(locator).getText();
	}

	public void clear(By locator) {
		driver.findElement(locator).clear();
	}

	/*
	 * public void value(WebElement value,By locator){
	 * driver.findElement(locator);
	 * 
	 * }
	 */
}
