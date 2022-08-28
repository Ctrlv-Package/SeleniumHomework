package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomeWorkAddNewJob {

	// Test case 4: Add new Job

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

	public void addNewJob() throws InterruptedException {

		// Navigate to https://opensource-demo.orangehrmlive.com
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Enter “Admin” in username field
		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("Admin");

		// Enter “admin123” in password field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");

		// Click “Login”
		WebElement login = driver.findElement(
				By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		login.click();

		// Click Admin
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		admin.click();

		// Click job
		WebElement job = driver.findElement(By.xpath("//span[contains(text(), 'Job')]"));
		job.click();

		// Click Job Titles
		WebElement jobTitle = driver.findElement(By.xpath("//a[contains(text(), 'Job Titles')]"));
		jobTitle.click();

		// Add Button
		WebElement addButton = driver
				.findElement(By.xpath("//*[@class= 'oxd-button oxd-button--medium oxd-button--secondary']"));
		addButton.click();

		// Enter “SDET” in job title field
		WebElement jobField = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
		jobField.sendKeys("SDET");

		// Enter “Software Development Engineer in Test” in job description field
		WebElement jobDescription = driver.findElement(By.xpath("//*[@placeholder='Type description here']"));
		jobDescription.sendKeys("Software Development Engineer in Test");

		// Enter “ I am qualified for SDET” in Note field
		WebElement noteField = driver.findElement(By.xpath("//*[@placeholder='Add note']"));
		noteField.sendKeys("I am qualified for SDET");

		// Click Save
		WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']"));
		saveButton.click();

		String actualText = driver.findElement(By.xpath("//*[contains(text(),'SDET')]")).getText();
		String expectedText = "SDET";
		Assert.assertEquals(actualText, expectedText, "Text Match Failed....");

		System.out.println("Done....");

	}

}
