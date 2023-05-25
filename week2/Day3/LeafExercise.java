package week2.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafExercise {
	public static void main(String[] args) throws InterruptedException {
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
				
WebElement cd =driver.findElement(By.id("createLeadForm_industryEnumId"));
Select op=new Select(cd);
op.selectByValue("IND_AEROSPACE");
Thread.sleep(2000);
WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select op1=new Select(Ownership);
op1.selectByVisibleText("Partnership");

WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select op2=new Select(State);
op2.selectByVisibleText("California");

driver.findElement(By.name("submitButton")).click();

	}
	}
	
