package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkDragAndDrop {
	
	// Test case 3: Drag and drop
	
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
	
	public void dragAndDrop() throws InterruptedException {
		
		// Navigate to http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		// Drag each capital and drop to the appropriate country field box
		// Countries 
		WebElement sweden = driver.findElement(By.xpath("//*[@id= 'box102']"));
		WebElement denmark = driver.findElement(By.xpath("//*[@id= 'box104']"));
		WebElement spain = driver.findElement(By.xpath("//*[@id= 'box107']"));
		WebElement usa = driver.findElement(By.xpath("//*[@id= 'box103']"));
		WebElement southKorea = driver.findElement(By.xpath("//*[@id= 'box105']"));
		WebElement norway = driver.findElement(By.xpath("//*[@id= 'box101']"));
		WebElement italy = driver.findElement(By.xpath("//*[@id= 'box106']"));
		
		// Capitals 
		WebElement osio = driver.findElement(By.xpath("//div[@id= 'box1']"));
		WebElement stockholm = driver.findElement(By.xpath("//div[@id= 'box2']"));
		WebElement washington = driver.findElement(By.xpath("//div[@id= 'box3']"));
		WebElement copenhagen = driver.findElement(By.xpath("//div[@id= 'box4']"));
		WebElement seoul = driver.findElement(By.xpath("//div[@id= 'box5']"));
		WebElement rome = driver.findElement(By.xpath("//div[@id= 'box6']"));
		WebElement madrid = driver.findElement(By.xpath("//div[@id= 'box7']"));
		
		Actions action = new Actions(driver);

		action.dragAndDrop(madrid, spain).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(rome, italy).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(seoul, southKorea).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(copenhagen, denmark).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(washington, usa).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(stockholm, sweden).release().build().perform();
		Thread.sleep(1000);
		
		action.dragAndDrop(osio, norway).release().build().perform();
		Thread.sleep(1000);
		
		System.out.println("Done.....");
		
	}

}
