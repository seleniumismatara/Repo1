package automation_code_16thnov_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayAround {
	public static WebDriver driver;

	@BeforeTest
	public void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void setup() {
		driver.get("https://rediff.com");
		System.out.println("The title of the page is:" + driver.getTitle());

	}

	@Test
	public void clickOnsignInlink() {
		driver.findElement(By.className("signin")).click();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
