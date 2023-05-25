package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
	
		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
					driver.findElement(By.id("password")).sendKeys("Leaf@1234");
					driver.findElement(By.name("Login")).click();
		}		
		}

