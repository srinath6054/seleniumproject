package mavenseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Individualactivity {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		Username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.className("app_logo"));
		if(logo.isDisplayed()) {
			System.out.println("logo is verified");
		}
		
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement pincode = driver.findElement(By.id("postal-code"));
		firstName.sendKeys("srinath");
		lastName.sendKeys("gopi");
		pincode.sendKeys("600001");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	
	}

}
