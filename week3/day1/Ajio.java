package week3.day1;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
	
		// Step 1: Instantiate the ChromeDriver
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// Loads a new web page in the current browser window
		// Maximize the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		//In the search box, type "bags" and press enter

		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//driver.findElement(By.id("Men")).click();

		// To the left  of the screen under " Gender" click "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		//Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}}



	