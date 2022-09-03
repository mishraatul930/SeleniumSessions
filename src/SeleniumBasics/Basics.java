package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:9089/BrowserWeb/");
		Thread.sleep(3000);
		driver.findElement(By.id("signOnName")).sendKeys("INPUTT");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("sign-in")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@id,'commandV')]")).sendKeys("SAWATQ.PARAMETER");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id = 'cmdline_img']")).click();
		Thread.sleep(3000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		String childWindowId = it.next();
		System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='idbox idbox_SAWATQPARAMETER']")).sendKeys("SYSTEM");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowId);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@title='Sign off']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}
}