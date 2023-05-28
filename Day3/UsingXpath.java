package week2.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesManager");
				driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
						driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
