package automation_code_15thNov_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	public static WebDriver driver;
	public static ChromeOptions option;

	public static void main(String[] args) {
		option = new ChromeOptions();
		option.addArguments("--incognito");
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.out.println(driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).isEnabled());
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();

	}

}
