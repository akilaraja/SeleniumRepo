package week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SnapDeal {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("https://www.snapdeal.com");
		WebElement mouseover = driver.findElement(By.xpath("//span[text()='Beauty, Health & Daily Needs']"));
				Actions builder=new Actions(driver);
		builder.moveToElement(mouseover).perform();
	}

}
