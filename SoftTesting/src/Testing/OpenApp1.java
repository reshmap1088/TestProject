package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","E:\\Online9thJan2023\\Software Testing\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://stageoas.scdl.net/OASAdmin/loadLogin.action");
	}

}
