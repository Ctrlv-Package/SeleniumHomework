package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkDoubleClick {
	
//	Test case 2: Double Click 

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

	public void doubleClickTest() throws InterruptedException {

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions action = new Actions(driver);

		WebElement doubleClickButton = driver.findElement(By.xpath("//*[contains(text(), 'Double-Click Me To See Alert')]"));

		action.doubleClick(doubleClickButton).build().perform();

		String getText = driver.switchTo().alert().getText();

		System.out.println("Get the text: " + getText);

		driver.switchTo().alert().accept();

	}

}
