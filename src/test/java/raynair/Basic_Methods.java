package raynair;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public  class Basic_Methods {
	
	public static WebDriver driver;
	
	public Basic_Methods(WebDriver driver){
		this.driver = driver;
	}
	
/**
 * 
 * @param descriton
 * @param locator
 * @throws Exception 
 */
	public  void clickonElement(By locator) throws Exception{	
	boolean clickedOnElemnet = false ;
	try { 
		while(!clickedOnElemnet){
			System.out.println("step 1");
		WebElement menubutton =	driver.findElement(locator);
		System.out.println("step 1");
		menubutton.click();
		clickedOnElemnet = true;
		}
	} catch (Exception e) {
	        throw e;}
	}
	/**
 	 * send keys into text field
 	 * @param locator
 	 * @param value: Keys to be sent
 	 */
     public void sendKeys(By locator, String value) {
            WebElement textWebElement = driver.findElement(locator);
            textWebElement.clear();
            textWebElement.sendKeys(value);
     }
     
     
     
     public static boolean isElementVisible(final By locator)
    		    throws InterruptedException {
    		        boolean value = false;

    		        if (driver.findElement(locator).isDisplayed()) {
    		            value = true;
    		        }
    		        return value;
    		    }
     public static void waitForElementsToBeDisplayed(WebDriver driver){
   	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	  
     }
     
     /**
      * Select an element from dropdown list
      * @param locator
      * @param value
      */
     
     public static  void selectDropdownItem(By locator, String value){
    	 Select dropDownElement = new Select(driver.findElement(locator));
    	 dropDownElement.selectByVisibleText(value);
     }
}


