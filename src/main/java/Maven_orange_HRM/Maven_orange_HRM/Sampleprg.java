package Maven_orange_HRM.Maven_orange_HRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\srinuuuu data\\Java&Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm");
	}

}
