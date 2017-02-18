package selenium;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class NewTab {
	public WebDriver getMyDriver ;
	public static void test() {

		
		WebElement link = getMyDriver
				.findElement(By.xpath("//*[@id='link']"));
		Actions newTab = new Actions(getMyDriver());
		newTab.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build()
				.perform();
		Thread.sleep(5000);

		// handle windows change
		String base = getMyDriver().getWindowHandle();
		Set<String> set = getMyDriver().getWindowHandles();

		set.remove(base);
		assert set.size() == 1;
		getMyDriver().switchTo().window((String) set.toArray()[0]);

		// close the window
		getMyDriver().close();
		getMyDriver().switchTo().window(base);

		// handle windows change and switch back to the main window
		Thread.sleep(2500);
		for (String winHandle : getMyDriver().getWindowHandles()) {
			getMyDriver().switchTo().window(winHandle);
		}
	}
	
	@Test
    public void openNewTabInFirefox(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
         
        WebElement body = driver.findElement(By.cssSelector("body"));
        String newTabAction = Keys.chord(Keys.COMMAND, "t");
        body.sendKeys(newTabAction);
         
        String chooseTab = Keys.chord(Keys.COMMAND, "2");
        body.sendKeys(chooseTab);
         
        driver.get("http://www.yahoo.com");
         
        driver.close();
    }
	@Test
    public void openNewWindowInChrome(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
         
        WebElement element = driver.findElement(By.linkText("Gmail"));
        Actions actionOpenLinkInNewTab = new Actions(driver);
        actionOpenLinkInNewTab.moveToElement(element)
                                .keyDown(Keys.SHIFT)
                                .click(element)
                                .keyUp(Keys.SHIFT)
                                .perform();
         
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://www.yahoo.com");
        driver.close();
         
        driver.switchTo().window(tabs.get(0));
        driver.get("http://www.yahoo.com");
         
        driver.close();
    }
}
