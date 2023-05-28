package week2.Day3;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class CreateLead {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	//Maximize browser
	driver.manage().window().maximize();
	//Apply implicitwait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//open URL
	driver.get("http://leaftaps.com/opentaps/control/login");
	//Enter Username by ID
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	//Enter password by ID
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	//Click on Login button using Class locator
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//Click on CRM/SFA Link
	driver.findElement(By.xpath("//div[@id='label']/a")).click();
	//Click on Leads Button
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	//Click on create Lead Button
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	//Enter CompanyName using id Locator
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Helios");
	//Enter FirstName using id Locator
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akila");
	//Enter LastName using id Locator
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishna");
	//Enter your mail-id
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("akil.raj@gmail.com");
    //phone number 
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9884711985");
	 //Click on create Lead Button Using name Locator
	driver.findElement(By.name("submitButton")).click();
}

}

