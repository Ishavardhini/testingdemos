import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebApplication {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("isha@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		password.sendKeys("Hello@123");
		Thread.sleep(1000);
		
		WebElement repassword = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
		repassword.sendKeys("Hello@123");
		Thread.sleep(1000);
		
		WebElement country = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));
		country.sendKeys("India");
		Thread.sleep(1000);
		
		WebElement firstname = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
		firstname.sendKeys("Isha");
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
		lastname.sendKeys("Krish");
		Thread.sleep(1000);
		
		WebElement jobTitle = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
		jobTitle.sendKeys("Software Engineer");
		Thread.sleep(1000);
		
		WebElement workPhone = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
		workPhone.sendKeys("8787576568");
		Thread.sleep(1000);
		
		WebElement companyName = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
		companyName.sendKeys("ABC Company");
		Thread.sleep(1000);
		
		WebElement address = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
		address.sendKeys("Marathahalli");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
		city.sendKeys("Bangalore");
		Thread.sleep(1000);
		
		WebElement state = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content"));
		state.sendKeys("Tamil Nadu");
		Thread.sleep(1000);
		
		WebElement pinCode = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
		pinCode.sendKeys("645891");
		
		Thread.sleep(1000);
		WebElement register= driver.findElement(By.id("sView1:r1:0:b1"));
		register.click();
	}

}