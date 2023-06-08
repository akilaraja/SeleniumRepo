package week3.day1;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateLeadSalesForceAdvXpath {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	ChromeDriver driver= new ChromeDriver();
			
			//EdgeDriver driver= new EdgeDriver();
			//2. load the URL
			driver.get("http://leaftaps.com/opentaps/control/login");
			//3. to max the screen
			driver.manage().window().maximize();
			
			//wait
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			
			driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
			driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
			
			driver.findElement(By.xpath("//div[@id='label']")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf1");
		     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("akila");
		     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("krishna");
		     driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("akil.raj@gmail.com");
		 	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9884711985");
		 	driver.findElement(By.name("submitButton")).click();
			
		}

	}


