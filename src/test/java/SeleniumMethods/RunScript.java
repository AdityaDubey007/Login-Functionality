package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RunScript extends commonMethods {
	public static String url = "https://www.facebook.com/";

	public static void main(String[] args) {
		commonMethods actions = new commonMethods();
		actions.openBrowser();
		actions.visitWebsite(url);
		actions.scrollDown();
		String title = actions.getTitle();
		System.out.println(title);
		WebElement usernameField = actions.driver
				.findElement(By.xpath("//input[@id='email']"));
		WebElement passwordField = actions.driver
				.findElement(By.xpath("//input[@id='pass']"));
		String username = "adityadubey7895@gmail.com";
		String password = "Apple@123";
		sendKeysToElement(usernameField, username);
		sendKeysToElement(passwordField, password);
		WebElement loginButton = actions.driver
				.findElement(By.xpath("//button[@name='login']"));
		clickButton(loginButton);
//		actions.closeBrowser();

	}

}
