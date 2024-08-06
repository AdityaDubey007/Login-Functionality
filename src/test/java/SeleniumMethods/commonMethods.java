package SeleniumMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethods {
	public WebDriver driver;

	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}

	public void visitWebsite(String url) {
		driver.get(url);
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void sendKeysToElement(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	public static void clickButton(WebElement element) {
		element.click();
	}

//The password that you've entered is incorrect. 
	}

	public void closeBrowser() {
		driver.quit();
	}
}
