package week4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
			
			
	Alert alert =driver.switchTo().alert();
	String alertText=alert.getText();
	System.out.println(alertText);
	System.out.println("Prompt Alert message :"+alertText);
	alert.sendKeys("Akila Krishna");
	alert.accept();
	String confrimText = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	System.out.println("Prompt Alert Result :" +confrimText);
	
	
}
}
