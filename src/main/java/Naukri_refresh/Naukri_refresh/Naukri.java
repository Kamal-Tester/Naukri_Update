package Naukri_refresh.Naukri_refresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static WebDriver driver;
	public static void main(String a[]) throws InterruptedException {

		

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sunidhi\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
	

	

	/*
	 * public static WebDriver setChromeDriver(String browser) { if
	 * (browser.equalsIgnoreCase("Chrome")) { try {
	 * 
	 * ChromeOptions chromeOptions = new ChromeOptions();
	 * WebDriverManager.chromedriver().driverVersion("129.0.6668.90").create();
	 * 
	 * driver = new ChromeDriver(chromeOptions);
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\H3TJL13.cgi\\Downloads\\chromedriver125.exe"); //WebDriver driver
	 * = new ChromeDriver();
	 * 
	 * ChromeOptions options = new ChromeOptions();
	 * options.addArguments("--remote-allow-origins=*"); ChromeDriver driver = new
	 * ChromeDriver(options);
	 * 
	 * driver = new ChromeDriver();
	 * 
	 * } catch (Exception e) { System.out.println("Chrome"); System.out.println(e);
	 * }
	 * 
	 * } // return driver; return driver; }
	 */

	

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement Login_Button = driver.findElement(By.xpath("//div/a[@id='login_Layer']"));
		Login_Button.click();
		Thread.sleep(2000);
		WebElement Username = driver
				.findElement(By.xpath("//div/input[@placeholder='Enter your active Email ID / Username']"));
		Username.sendKeys("meghani58155@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//div/input[@placeholder='Enter your password']"));
		Password.sendKeys("Kamal@123");
		WebElement Login = driver.findElement(By.xpath("//div/button[@class='btn-primary loginButton']"));
		Login.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Profile_Button = driver.findElement(By.xpath("//div/img[@class='nI-gNb-icon-img']"));
		Profile_Button.click();
		WebElement View_Update_Profile = driver
				.findElement(By.xpath("//div/a[contains(text(),'View & Update Profile')]"));
		View_Update_Profile.click();
		Thread.sleep(2000);

		// -----Edit first tab----
		WebElement Edit_FirstTab = driver
				.findElement(By.xpath("//div/em[@data-ga-track='spa-event|EditProfile|Basic Details|EditOpen']"));
		Edit_FirstTab.click();
		WebElement salary = driver.findElement(By.xpath("//div/input[@id='totalAbsCtc_id']"));
		salary.sendKeys("450000");
		WebElement Save_FirstTab = driver.findElement(By.xpath("//div/button[@id='saveBasicDetailsBtn']"));
		Save_FirstTab.click();

		// -----End first tab----

		driver.quit();
		
		System.out.println("Update is done");
	}

}
