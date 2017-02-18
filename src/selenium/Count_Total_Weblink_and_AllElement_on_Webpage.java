package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_Total_Weblink_and_AllElement_on_Webpage {

	public static void main(String[] args) {

		// Define the Webdriver for Browser i.e. Firefox
		WebDriver driver = new FirefoxDriver();

		// Open the URL (Website)
		driver.get("http://google.com");

		// Identify the number of Link on webpage and assign into Webelement
		// List
		List<WebElement> allLinkElements = driver.findElements(By.xpath("//a"));

		// Count the total Link list on Web Page
		int linkListCount = allLinkElements.size();

		// Print the total count of links on webpage
		System.out.println("Total Number of link count on webpage = "
				+ linkListCount);

		// Identify all the elements on web page
		List<WebElement> allElements = driver.findElements(By.xpath("//*"));

		// Count the total all element on web page
		linkListCount = allElements.size();

		// Print the total count of all element on webpage
		System.out.println("Total Number of All Element on webpage = "
				+ linkListCount);

		// Print all the Tag Name and Text Name on webpage
		int i = 0;
		for (WebElement Element : allElements) {
			i = i + 1;
			System.out.println(Element.getTagName());
			System.out.println(Element.getText());
		}

		// Close the Broswer
		driver.close();

		// Quit the selenium
		driver.quit();

	}
}