import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelfIntro {
	public static void main(String[] args) {
		WebDriver webdriver = null;
//		System.setProperty("webdriver.chrome.driver", "E:\\jars\\chromedriver.exe");
//		webdriver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "E:\\jars\\geckodriver.exe");
//		webdriver=new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "E:\\jars\\msedgedriver.exe");
		webdriver = new EdgeDriver();
		webdriver.get("https://www.simplilearn.com");
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		webdriver.quit();
		
		
		
	}
}
