package com.ritesh.ticketReservation.TicketReservation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketReservation {
	 public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\2000r\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.makemytrip.com/railways/");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			String url = driver.getCurrentUrl();
			
			System.out.println( title);
			System.out.println(url);
			
			
			
			driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/div[2]/div/div/label/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='From']")).click();
			Thread.sleep(2000);
			
			WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
			Thread.sleep(2000);
			from.sendKeys("NDLS");
			Thread.sleep(2000);
			from.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			from.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
//			//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("NDLS");
			driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/div[2]/div/div[2]/label/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='To']")).click();
			Thread.sleep(2000);
//			
			WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
			Thread.sleep(2000);
			to.sendKeys("LKO");
			Thread.sleep(2000);
			to.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			to.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
//			
//			
//      		driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/div[2]/div/div[4]/label/span")).click();
//			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[3]")).click();
			Thread.sleep(2000);
//			WebElement clas = driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/div[2]/div/div[4]/label/input"));
//			clas.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
//			clas.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(2000);
//			clas.
//			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div/div[2]/p/a")).click();
		}
}
