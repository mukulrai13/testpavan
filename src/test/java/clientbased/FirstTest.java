package clientbased;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
     ChromeOptions options = new ChromeOptions();
options.add_argument("--headless");
options.add_argument("window-size=1400,1500");
options.add_argument("--disable-gpu");
options.add_argument("--no-sandbox");
options.add_argument("start-maximized");
options.add_argument("enable-automation");
options.add_argument("--disable-infobars");
options.add_argument("--disable-dev-shm-usage");

driver = webdriver.Chrome(options=options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://dev.productively.app/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("clientbasedtest@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testing@13");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();

	}

//    @Test(groups = { "demo" })	
//    public void test1() {
//    	System.out.println("check group1");
//    }
//    @Test(groups = { "demo" })	
//    public void test2() {
//    	System.out.println("check group2");
//    }
//    @Test(priority=2)
//    public void test3() {
//    	System.out.println("check priority2");
//    }
//    @Test(priority=1)
//    public void test4() {
//    	System.out.println("check priority1");
//    }
//    @Test(invocationCount=5)
//    public void test5() {
//    	System.out.println("check invocation");
//    }
//    @Test(enabled=false)
//    public void test6() {
//    	System.out.println("enabled the testcase");
//    }
    
}












