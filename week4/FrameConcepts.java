package week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcepts {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[contains(text(), 'Try')]")).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	WebElement ele = driver.findElement(By.xpath("//p[@id=.;'demo']"));
	System.out.println(ele.getText());
}
}
