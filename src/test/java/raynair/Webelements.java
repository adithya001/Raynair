package raynair;

import org.openqa.selenium.By;

public class Webelements {

	// Flightsearch page webelements
	public static final By LOGIN_BUTTON = By.cssSelector("#myryanair-auth-login>a");
	public static final By USER_NAME = By.cssSelector("input[name='emailAddress']");
	public static final By PASSW0RD	= By.cssSelector(".form-field.password input.core-input");
	public static final By LOGIN= By.cssSelector(".modal-form-group button-spinner");
	public static final By PlAN = By.cssSelector("li#plan-trip a");
	public static final By SEARCH_FLIGHTS = By.linkText("Search for flights");
	public static final By ONEWAYBUTTON = By.cssSelector(".flight-search-type-option.one-way label");
	public static final By DEPARTURECITY = By.cssSelector("label#label-airport-selector-from");
	public static final By DEPARTURE_AIRPOTTXTFIELD =By.xpath(".//*[@id='search-container']/div[1]/div/form/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/input");
	public static final By DESTINATIONCITY = By.cssSelector("label#label-airport-selector-to");
	public static final By DESTINATION_AIRPOTTXTFIELD =By.xpath(".//*[@id='search-container']/div[1]/div/form/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/input");
	public static final By FlYOUT_LABEL = By.xpath(".//*[@id='row-dates-pax']/div[1]/div/div[1]/div/div[2]/label");
	public static final By FlYOUT_DATE = By.xpath(".//*[@id='row-dates-pax']/div[1]/div/div[1]/div/div[2]/div[2]/div/input[1]");
	public static final By PASSENGERSCOL = By.xpath(".//*[@id='row-dates-pax']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]");
	public static final By LETSGO_BUTTON = By.cssSelector("button span[translate='common.buttons.lets_go']");
	public static final By CONTINUE_BUTTON = By.cssSelector("button#continue");
	public static final By CONTINUE_TO_SEARCH = By.cssSelector(".biz-popup-benefits>button");
	//Ticket price page webelements
	
	public static final By REGUALR_fARE = By.cssSelector("div.one-third.regular");
	public static final By LEISURE_fARE = By.cssSelector("div.one-third.leisure");
	public static final By BUSINESS_fARE = By.cssSelector("div.one-third.business");
	public static final By CHECK_OUT = By.cssSelector("div.trips-basket.trips-cnt>button");
	public static final By OK_THANKS_POPUP = By.cssSelector("button.core-btn-ghost.seat-prompt-popup-footer-btn");
	
	//PAYMENT PAGE WEBELEMNTS
	
	public static final By TITLE = By.cssSelector("div.form-field.payment-passenger-title select");
	public static final By FIRST_NAME = By.cssSelector("div.form-field.payment-passenger-first-name input");
	public static final By SURNAME = By.cssSelector("div.form-field.payment-passenger-last-name input");
	public static final By PHONE_NUMBER_COUNTRY = By.cssSelector("div.phone-number-country select");
	public static final By PHONE_NUM = By.cssSelector("input[name='phoneNumber']");
	public static final By CARD_NUMBER = By.cssSelector("input[name='cardNumber']");
	public static final By CARD_TYPE = By.cssSelector("select[name='cardType']");
	public static final By EXPIRY_MONTH = By.cssSelector("select[name='expiryMonth']");
	public static final By EXPIRY_YEAR = By.cssSelector("select[name='expiryYear']");
	public static final By SECURITY_CVV = By.cssSelector("div.card-security-code input");
	public static final By CARDHOLDER_NAME = By.cssSelector("input[name='cardHolderName']");
	public static final By ADDRESS1 = By.cssSelector("input[name='sa.nameAddressLine1']");
	public static final By ADDRESS2 = By.cssSelector("input[name='sa.nameAddressLine2']");
	public static final By CITY = By.cssSelector("input[name='sa.nameCity']");
	public static final By ZIP_CODE = By.cssSelector("input[name='cardHolderName']");
	public static final By COUNTRY = By.cssSelector("input[name='cardHolderName']");
	public static final By TERMS_CHECKBOX = By.cssSelector("input[name='acceptPolicy']");
	public static final By PAY_NOW = By.cssSelector("button.core-btn-primary.core-btn-medium");
	public static final By ERROR_MESSAGE = By.cssSelector("prompt[class='error']");
	

}
