package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceWindowHandles {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.xpath("//form[@id='login_form']/Input")).sendKeys("Leaf@1234");
	driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).click();
	driver.findElement(By.xpath("//span[text()='Learn More']")).click();
			Set<String> allWindows=driver.getWindowHandles();
	List<String>windows=new ArrayList<String>(allWindows);
	driver.switchTo().window(windows.get(1));
	driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
			String childTitle=driver.getTitle();
			System.out.println("The title of Child window is : "+childTitle);
			driver.close();
			driver.switchTo().window(windows.get(0));
			String parentTitle =driver.getTitle();
			System.out.println(parentTitle);
			driver.close();
			
	
}
}
