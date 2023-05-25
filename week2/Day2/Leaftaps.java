package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dhana Enterprises");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akila");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishna");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("akila.krishna1234@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9884711985");
				driver.findElement(By.name("submitButton")).click();
				
	}
	}
