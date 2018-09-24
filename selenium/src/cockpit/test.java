package cockpit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class test {

	public static void main(String[] args) {
		// Creating a new instance of the HTML unit driver
        
        WebDriver driver = new HtmlUnitDriver();
         
		// Navigate to URL		
        driver.get("https://www.seleniumhq.org/");
        
		// This code will print the page title		
        System.out.println("Page title is: " + driver.getTitle());		
       
        driver.quit();	
	}
}