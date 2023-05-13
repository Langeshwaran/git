package basicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author langesh
 *
 */
public class BasicXpath {
//frist commit
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label/span[text()='Add Files']")).sendKeys("D:\\Sample.docx");
		
		/*driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("facebook");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("yDmH0d")).sendKeys("9786018640");*/
	}
										
}
