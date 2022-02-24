package seleniunMilestone;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prati\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.indiabookstore.net/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("searchBox")).sendKeys("“Selenium");
	    driver.findElement(By.id("searchButtonInline")).click();
	    
	   // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//img[@alt='Selenium Testing Tools Cookbook']")).click();   
        
		/*
		 * Set<String>ids=driver.getWindowHandles(); Iterator<String> it=ids.iterator();
		 * String parentid=it.next(); String childid=it.next();
		 * 
		 * driver.switchTo().window(childid);
		 */
       // driver.switchTo().alert().accept();
        //driver.switchTo().frame(By.)
		/*
		 * driver.switchTo().activeElement(); String ISBN
		 * =driver.findElement(By.xpath("//div[@class='isbnContainer']")).getText();
		 * System.out.println(ISBN);
		 */
        WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Category_Book = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://m.media-amazon.com/images/I/51Oa0cZRm6L._SL160_.jpg']")));
		Category_Book.click();
		//WebElement W1 = driver.findElement(By.className("isbnContainer"));
		String val = driver.findElement(By.xpath("//div[@class='isbnContainer']")).getText();
		System.out.println("The input value: "+ val);
		WebElement W2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.indiabookstore.net/redirect?url=https%3A%2F%2Fwww.amazon.in%2Fdp%2F1849515743%3Ftag%3Dindi08-21%26linkCode%3Dosi%26th%3D1%26psc%3D1&source=buyLinkModal&name=Amazon&ibsId=9781849515740&urlDisplay=https%3A%2F%2Fwww.amazon.in%2Fdp%2F1849515743%3Ftag%3Dindi08-21%26linkCode%3Dosi%26th%3D1%26psc%3D1&sellingPrice=2519&storeId=17&isbn13=9781849515740&rank=1&minPrice=1019&storesCount=3&searchId=\']")));
		W2.click();
	}
	

}
