package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class FacebookAdvanceXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Testkdjkfj");
driver.findElement(By.xpath("((//div[@class='_5dbb']/input)/following::input)[1]")).sendKeys("Lastusm");
driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("hjchdj@gmail.com");
driver.findElement(By.xpath("//div[text()='Re-enter email address']/following-sibling::input")).sendKeys("hjchdj@gmail.com");
driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("passpass");
driver.findElement(By.xpath("//select[@id='day']/option[text()='6']")).click();
driver.findElement(By.xpath("//select[@id='month']/option[text()='May']")).click();
driver.findElement(By.xpath("//select[@id='year']/option[text()='1990']")).click();
driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
//WebElement ab = driver.findElement(By.xpath("//select[@id='day']"));
//    Select cd = new Select(ab);
  //  cd.selectByIndex(5);
    
   // WebElement mn = driver.findElement(By.xpath("//select[@id='month']"));
   
  //  Select ef = new Select(mn);
   // ef.selectByValue("4");
    
   // WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
   // Select year = new Select(yr);
   // year.selectByVisibleText("2013");

    
    
	}
}