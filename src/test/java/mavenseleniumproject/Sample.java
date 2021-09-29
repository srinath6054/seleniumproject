package mavenseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

//		public static void main(String[] args) throws InterruptedException {
	@Test
	public void mavenseleniumproject() throws InterruptedException {
//			System.setProperty("webdriver.gecko.driver",
//					"C:\\Users\\srinathg\\eclipse-workspace-selenium\\SeleniumProject\\drivers\\geckodriver.exe");
//			System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\srinathg\\eclipse-workspace-selenium\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement login = driver.findElement(By.name("Submit"));
		login.click();
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//body/div[@id='wrapper']/div[@id='branding']/div[@id='welcome-menu']/ul[1]/li[3]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
@Test
	public void facebook() {

		String baseUrl = "http://www.facebook.com/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		Action seriesOfAction = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello").keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername).contextClick()
				.build();
		seriesOfAction.perform();

		
		
	}

}
