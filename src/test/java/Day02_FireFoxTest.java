import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FireFoxTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.close();



    }
}
