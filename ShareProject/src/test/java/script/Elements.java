package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	public static WebElement email(WebDriver b1) {
		return b1.findElement(By.id("email"));

	}
	public static WebElement password(WebDriver b1) {
		return b1.findElement(By.name("passwd"));


	}
	public static WebElement signin(WebDriver b1) {
		return b1.findElement(By.id("SubmitLogin"));

	}
	public static WebElement createanaccount(WebDriver b1) {
		return b1.findElement(By.id("email_create"));

	}
	public static WebElement SubmitCreate(WebDriver b1) {
		return b1.findElement(By.id("SubmitCreate"));

	}
	public static WebElement selectmrbutton (WebDriver b1) {
		return b1.findElement(By.id("id_gender1"));

	}
	public static WebElement firstname(WebDriver b1) {
		return b1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input"));
	}
	public static WebElement lastname(WebDriver b1) {
		return b1.findElement(By.name("customer_lastname"));
	}
	public  static WebElement  password1 (WebDriver b1) {
		return b1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input"));

	}
	public static WebElement day (WebDriver b1) {
		return b1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select"));
	}
	public static WebElement months (WebDriver b1) {
		return b1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select"));
	}
	public static WebElement years (WebDriver b1) {
		return b1.findElement(By.xpath("//select[@id='years']"));
	}
	public static WebElement checker (WebDriver b1) {
		return b1.findElement(By.id("newsletter"));
	}
	public static WebElement checker1 (WebDriver b1) {
		return b1.findElement(By.id("optin"));
	}
	public static WebElement company (WebDriver b1) {
		return b1.findElement(By.id("company"));
	}

	public static WebElement address (WebDriver b1) {
		return b1.findElement(By.id("address1"));
	}

	public static WebElement address2 (WebDriver b1) {
		return b1.findElement(By.name("address2"));
	}
	public static WebElement city (WebDriver b1) {
		return b1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input"));
	}
	public static WebElement state (WebDriver b1) {
		return b1.findElement(By.name("id_state"));
	}
	public static WebElement postal(WebDriver b1) {
		return b1.findElement(By.xpath("//input[@class='form-control uniform-input text']"));
	}
	public static WebElement country(WebDriver b1) {
		return b1.findElement(By.id("id_country"));
	}
	public static WebElement Additional(WebDriver b1) {
		return b1.findElement(By.id("other"));
	}
	public static WebElement homephone(WebDriver b1) {
		return b1.findElement(By.xpath("//*[@id=\"phone\"]"));
	}
	public static WebElement mobilephone(WebDriver b1) {
		return b1.findElement(By.id("phone_mobile"));
	}
	public static WebElement Assign(WebDriver b1) {
		return b1.findElement(By.id("alias"));
	}
	public static WebElement register(WebDriver b1) {
		return b1.findElement(By.id("submitAccount"));
	}
	public static WebElement itembar (WebDriver b1) {
		return b1.findElement(By.id("search_query_top"));
	}
	public static WebElement search (WebDriver b1) {
		return b1.findElement(By.name("submit_search"));
	}
	public static WebElement dress (WebDriver b1) {
		return b1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5"));
	}
public static WebElement cart (WebDriver b1) {
 return b1.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]"));
	}

}
