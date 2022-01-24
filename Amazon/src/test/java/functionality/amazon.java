package functionality;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object_repo.elements;

public class amazon {
	
	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Amazon\\ChromeBrowser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fl%2F26425875031%2F%3Fpf_rd_r%3DRMEH9KYP1KE3BQ20W8M1%26pf_rd_p%3Db2ea99b8-d88a-4373-be5d-77170512e9ff%26pd_rd_r%3Db97b9ec8-d730-4e9e-833b-aa2738f663f9%26pd_rd_w%3DFOz6s%26pd_rd_wg%3D85ODM%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		elements el = new elements();
		el.email(driver).sendKeys("kanisekar99@gmail.com");
		el.continue_button(driver).click();
		el.password(driver).sendKeys("Kani01@cutiee");
		el.submit(driver).click();
		el.searchbox(driver).sendKeys("necklace");
		el.searchbox(driver).submit();
		el.item1(driver).click();
		el.addtocart1(driver).click();
		el.comeback(driver).click();
	}
	

}