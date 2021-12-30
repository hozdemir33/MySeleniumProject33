import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Navigations {

    public static void main(String[] args) throws InterruptedException {

        //Step 1: set the path and driver name
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        //Step 2: create WebDriver abject
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Step 3: now I have driver, I can use driver in automation
        //go to google
        driver.get("https:www.google.com");
        //putting 3 second wait/3 sec is a hard wait-no ideal to use it
        Thread.sleep(3000);
      //  On the same class, Navigate to amazon home page https://www.amazon.com/
      //  navigate() is also used to go to the webpages

        driver.get("https:www.amazon.com");
        Thread.sleep(3000); //wait time to open the app

        // Navigate back to google
        driver.navigate().back();
        Thread.sleep(3000);

        // Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(3000);

        // Refresh the page
        driver.navigate().refresh();
        Thread.sleep(3000);

        //  Close/Quit the browser

        driver.close();



















    }

}
