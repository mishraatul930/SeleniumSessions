package SeleniumBasics;

import java.util.Iterator;
import java.util.Sets;

import org.openqa.selenium.By;
import org.openqa.selenium.Webdriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	public static void main(String args[]) throws InterruptedExceptions {
		System.setProperty("webriver.chrome.driver","C:\\chromedriver.exe");
		Webdriver driver = new ChromeDriver();
		driver.get("http://localhost:9089/BrowserWeb/");
		Thread.sleep(3000);
		driver.findElement(By.id("signOnName").sendKeys("TELLAA");
		driver.findElement(By.id("password").sendKeys("123456");
		driver.findElement(By.id("sign-in").click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@id,'commandV')]").sendKeys("ENQ ECHEQUE.IHLD.LIST");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id = 'cmdline_img']").click();
		Thread.sleep(3000);
		Set<String> handler = getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window("childWindowId");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='idbox idbox_SAWATQPARAMETER']").sendKeys("SYSTEM"));
		
DEATH NOTIFICATION:
1.Open Death Notification WSDL
2.Post a request with name more than 50 characters
3.Response will be S0240000
4.Log will be created in SAWATQ.SERVICE.LOG

1. Create FV
2. Attach the FV in RF
3. in FV FLD.NAME:ROW,COLUMN,LENGHT OF THE VALUE TO BE VERIFIED
		
		



