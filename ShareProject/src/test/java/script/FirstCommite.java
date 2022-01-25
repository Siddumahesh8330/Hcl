package script;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class FirstCommite {
	@Test
	public void Registrations() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahesh.alvaru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver b1;
		b1=new ChromeDriver();
		b1.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		b1.manage().window().maximize();
		Elements e2 = new Elements();
		e2.createanaccount(b1).sendKeys("siddumahesh36@gmail.com");
		e2.SubmitCreate(b1).click();
		Thread.sleep(10000);
		e2.selectmrbutton(b1).click();
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor) b1;
		js.executeScript("scroll(0,750)");
		e2.firstname(b1).sendKeys("mahesh");
		e2.lastname(b1).sendKeys("alvaru");
		e2.password1(b1).sendKeys("MAHESh@345");
		Select var= new Select(e2.day(b1));
		var.selectByValue("14");
		Select var1 = new Select(e2.months(b1));
		var1.selectByValue("8");
		Select var2 = new Select(e2.years(b1));
		var2.selectByValue("1996");
		e2.checker(b1).click();
		e2.checker1(b1).click();
		e2.company(b1).sendKeys("HCL");
		e2.address(b1).sendKeys("8-1-9");
		e2.address2(b1).sendKeys("ramalayam steet");
		e2.city(b1).sendKeys("kovvur");
		e2.postal(b1).sendKeys("000000");
		Select var3= new Select(e2.state(b1));
		var3.selectByVisibleText("Arkansas");
		e2.Additional(b1).sendKeys("9702@mahesh");
		e2.homephone(b1).sendKeys("9704964260");
		e2.mobilephone(b1).sendKeys("8125046456");
		e2.Assign(b1).sendKeys("same my present address");
		Thread.sleep(3000);
		e2.register(b1).click();
		Robot robo2= new Robot();
		Dimension sc2_size =		Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(sc2_size);
		BufferedImage source1 = robo2.createScreenCapture(rect);
		File destination = new File("C:\\\\Users\\\\mahesh.alvaru\\\\OneDrive - HCL Technologies Ltd\\\\Pictures\\\\Screenshots\\\\screen2.jpg");
		ImageIO.write(source1, "jpg" , destination); 
}

}
