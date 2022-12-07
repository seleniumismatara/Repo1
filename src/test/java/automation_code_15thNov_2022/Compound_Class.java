package automation_code_15thNov_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compound_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zara.com/us/");
		driver.findElement(By.linkText("LOG IN")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//aside[@id = 'sidebar']/preceding::span[text() = 'LOG IN]/parent::*)).")).click();

	}

}
