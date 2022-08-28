package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomeWorkRightClick {

//	Test case 1: Right Click 

	WebDriver driver;

	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pedro\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();

	}

	public void rightClickTest() throws InterruptedException {

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions action = new Actions(driver);

		WebElement rightClickButton = driver.findElement(By.xpath("//*[contains(text(), 'right click me')]"));

		action.contextClick(rightClickButton).build().perform();

		WebElement copyButton = driver
				.findElement(By.xpath("//*[@class='context-menu-list context-menu-root']//li[3]"));

		copyButton.click();
		
		String expectedText = "clicked: copy";
		String actualText = driver.switchTo().alert().getText();
		
		System.out.println("Expected: " + expectedText);
		System.out.println("Actual: " + actualText);

		Assert.assertEquals(actualText, expectedText, "Text Verification Failed");

		driver.switchTo().alert().accept();
		
		System.out.println("Done...");

	}

}
