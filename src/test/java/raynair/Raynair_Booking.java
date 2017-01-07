package raynair;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Raynair_Booking
{
	

	public WebDriver driver;
	
	public final String departureAirport = "Dublin";
	public final String destinationAirport = "Brussels (CRL)";
	public final String flyoutDate = "5";
	public final String userName = "adityareddy.dyapa@gmail.com";
	public final String password = "Test@123";
	public final String passengarTitle = "Mr";
	public final String passengarName = "Aditya";
	public final String passengarLastName = "dyap";
	public final String phonenumberCountry = "Ireland";
	public final String cardtype  = "Visa Debit / Delta";
	public final String phonenumber = "858585953";
	public final String cardnumber = "4319351036342454";
	public final String expiryMonth = "9";
	public final String expiryYear = "2020";
	public final String securitycode = "111";
	public final String cardholdersname = "aditya";
	public final String address1 = "kimmage";
	public final String city = "dublin";

	
	
	@Test
	public void browser_instance() throws Exception{
	FirefoxDriver browser = new FirefoxDriver();
	browser.manage().window().maximize();
	browser.get("http://www.ryanair.com/ie/en/");
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// LOGIN WITH GMAIL ACCOUNT
	browser.findElement(Webelements.LOGIN_BUTTON).click();
	browser.findElement(Webelements.USER_NAME).sendKeys(userName);
	browser.findElement(Webelements.PASSW0RD).sendKeys(password);
	browser.findElement(Webelements.LOGIN).click();
	Thread.sleep(1000);
	browser.findElement(Webelements.PlAN).click();
	browser.findElement(Webelements.SEARCH_FLIGHTS).click();
	browser.findElement(Webelements.ONEWAYBUTTON).click();
	browser.findElement(Webelements.DEPARTURECITY).click();
	browser.findElement(Webelements.DEPARTURE_AIRPOTTXTFIELD).sendKeys(departureAirport);
	browser.findElement(Webelements.DESTINATIONCITY).click();
	browser.findElement(Webelements.DESTINATION_AIRPOTTXTFIELD).sendKeys(destinationAirport);
	Robot ro = new Robot();
	ro.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	ro.keyRelease(KeyEvent.VK_ENTER);
	browser.findElement(Webelements.FlYOUT_DATE).sendKeys(flyoutDate);
	browser.findElement(Webelements.LETSGO_BUTTON).click();
	browser.findElement(Webelements.CONTINUE_TO_SEARCH).click();
	browser.findElement(Webelements.REGUALR_fARE).click();
	Thread.sleep(1000);
	browser.findElement(Webelements.CONTINUE_BUTTON).click();
	Thread.sleep(3000);
	browser.findElement(Webelements.CHECK_OUT).click();
	browser.findElement(Webelements.OK_THANKS_POPUP).click();
	
	//PAYMENT DETAILS
    Select dropDown =  new Select(browser.findElement(Webelements.TITLE));
     dropDown.selectByVisibleText(passengarTitle);
	browser.findElement(Webelements.FIRST_NAME).sendKeys(passengarName);
	browser.findElement(Webelements.SURNAME).sendKeys(passengarLastName);
  new Select(browser.findElement(Webelements.PHONE_NUMBER_COUNTRY)).selectByVisibleText(phonenumberCountry);
	browser.findElement(Webelements.PHONE_NUM).sendKeys(phonenumber);
	browser.findElement(Webelements.CARD_NUMBER).sendKeys(cardnumber);
	 new Select(browser.findElement(Webelements.CARD_TYPE)).selectByVisibleText(cardtype);
	 new Select(browser.findElement(Webelements.EXPIRY_MONTH)).selectByVisibleText(expiryMonth);
	 new Select(browser.findElement(Webelements.EXPIRY_YEAR)).selectByVisibleText(expiryYear);
	browser.findElement(Webelements.SECURITY_CVV).sendKeys(securitycode);
	browser.findElement(Webelements.CARDHOLDER_NAME).sendKeys(cardholdersname);
	browser.findElement(Webelements.ADDRESS1).sendKeys(address1);
	browser.findElement(Webelements.CITY).sendKeys(city);
	browser.findElement(Webelements.TERMS_CHECKBOX).click();
	browser.findElement(Webelements.PAY_NOW).click();
	System.out.println(browser.findElement(Webelements.ERROR_MESSAGE).getText());
	
	}
}
