package week3.day1;

//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
			ChromeDriver driver=new ChromeDriver();
			//Maximize the window
			driver.manage().window().maximize();
			//apply implicit wait
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Open URL
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
			driver.findElement(By.xpath("//div[@id='label']/a")).click();
			
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			//Click on Phone
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			//Enter phone number
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9884711985");
			//Click find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			//Capture lead ID of First Resulting lead
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String leadID=null;
			leadID= driver.findElement(By.xpath("(//div[@class='x-panel x-grid-panel']//table)[2]//a")).getText();
			System.out.println("Lead ID is :"+leadID);
			
	
			//Click First Resulting lead
			driver.findElement(By.xpath("(//div[@class='x-panel x-grid-panel']//table)[2]//a")).click();
			//Click Delete
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			//Click Find leads
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			//Enter captured lead ID
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
			//Click find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			String expectedMessage="No records to display";
			String actualMessage=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
			if(actualMessage.equals(expectedMessage)) {
				System.out.println("The Record is deleted successfully");
				System.out.println("Then, don't do nothing");
			}else {
				System.out.println("The Record is not deleted");
			}
			//Close the browser (Do not log out)
			//driver.close();
		}

		


	}

