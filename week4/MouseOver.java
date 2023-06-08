package week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) {
	ChromeOptions options =new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.Ajio.com");
	WebElement mouseOver=driver.findElement(By.xpath("//a[@title='Track Your Order']"));
	Actions builder=new Actions(driver);
	builder.moveToElement(mouseOver).perform();
	mouseOver.click();
			
	
}
}
