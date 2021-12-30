import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    1.Create a new class: VerifyTitleTest
	2.Navigate to google homepage
	3.Verify if google title is “google”
 */

public class Day02_VerifyTitleTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //Actual title of a page
        String actualTitle = driver.getTitle();
        //Expected title of a page
        String expextedTitle="Google";

        //Verification!!!

        if(actualTitle.equals(expextedTitle)){
            System.out.println("PASS");// it passed.
        } else{
            System.out.println("FAILED");
            driver.close();
        }






    }
}








//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.yahoo.com");
//
//         String actualTitle = driver.getTitle();//For ACTUAL TITLE---getTitle() call it. Do not assign anything
//         String expectedResult= "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";//For EXPECTED TITLE---Make sure to assign a value
//
//        if(actualTitle.equals(expectedResult)){
//            System.out.println("PASSED");
//        } else{
//            System.out.println("FAILED");
//        }
//


