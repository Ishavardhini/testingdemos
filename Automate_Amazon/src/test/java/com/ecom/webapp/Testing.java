package com.ecom.webapp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Testing {
	WebDriver wd;
	@Test(priority = 1)
	  public void register() throws InterruptedException {
		
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 
		wd.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(5000);
	      wd.findElement(By.id("createAccountSubmit")).click();
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_customer_name")).sendKeys("Isha");
	      Thread.sleep(5000);
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_email")).sendKeys("isha@gmail.com");
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_password")).sendKeys("Hello@123");
	      Thread.sleep(5000);
	     wd.findElement(By.id("continue")).click();
	}
	
	      @Test(priority = 2)
	  public void login() throws InterruptedException {
		
		

		 wd.findElement(By.id("nav-link-accountList")).click();
		 Thread.sleep(5000);
	     wd.findElement(By.id("ap_email")).sendKeys("isha@gmail.com");
	     Thread.sleep(5000);
		  wd.findElement(By.id("continue")).click();
		  Thread.sleep(5000);
	     wd.findElement(By.id("ap_password")).sendKeys("Hello@123S");
	       


	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  
	      	
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBook Air");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		    Thread.sleep(5000);
		    wd.get("https://www.amazon.in/Apple-MacBook-Chip-13-inch-512GB/dp/B08N5WRWNW/ref=sr_1_2_sspa?crid=11B0PHJM9CJOZ&keywords=macbook+air&qid=1664698818&qu=eyJxc2MiOiIzLjgwIiwicXNhIjoiMi44MiIsInFzcCI6IjIuNDMifQ%3D%3D&sprefix=macbook+ai%2Caps%2C557&sr=8-2-spons&psc=1");
		    Thread.sleep(5000);
		    wd.findElement(By.id("add-to-cart-button")).click();
		    Thread.sleep(5000);
		   
		   
	  }
	 
	  @BeforeMethod
	    public void startbrowser()
	    {
		  WebDriverManager.chromedriver().setup();
		  	 wd=new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
	      	 wd.manage().window().maximize();
	      	   
	    }


	      @AfterMethod
	    public void closeBrowser()
	    {
	        wd.close();
	    }
	  

}