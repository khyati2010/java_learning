package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import Flash.FlashObjectWebDriver;

public class Flash {
	public static void main(String[] args) throws InterruptedException {
		// Open firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Under Flash jar file there is separate FlashObjectWebDriver class
		FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver,
				"myFlashMovie");
		// Pass the URL of video
		driver.get("http://demo.guru99.com/flash-testing.html");
		Thread.sleep(5000);
		flashApp.callFlashObject("Play");
		Thread.sleep(5000);
		flashApp.callFlashObject("StopPlay");
		Thread.sleep(5000);
		flashApp.callFlashObject("SetVariable", "/:message",
				"Flash testing using selenium Webdriver");
		System.out
				.println(flashApp.callFlashObject("GetVariable", "/:message"));
	}
}