package object_repo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elements {
	
	public WebElement email(WebDriver driver){
	
		return driver.findElement(By.id("ap_email"));
	
	}
	
	public WebElement continue_button(WebDriver driver){
		return driver.findElement(By.id("continue"));
	}

	public WebElement password(WebDriver driver){
		return driver.findElement(By.name("password"));
	}
	
	public WebElement submit(WebDriver driver){
		return driver.findElement(By.id("signInSubmit"));
	}
	public WebElement searchbox(WebDriver driver){
		return driver.findElement(By.id("twotabsearchtextbox"));
	}
	public WebElement item1(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span"));
	}
	public WebElement addtocart1(WebDriver driver){
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
		return driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	}
	
	public WebElement comeback(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
	}
}
