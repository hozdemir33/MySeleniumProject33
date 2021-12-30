import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_02_VerifyURLTest {

    public static void main(String[] args) {

/*
Create a new class: VerifyURLTest 
Navigate to google homepage 
Verify if google homepage url is “www.google.com”
 */

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

      //getting the URL of a page
        String actualURL=driver.getCurrentUrl();
       //Expected URL
        String expectedURL="www.google.com";

       //Verification

        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        } else{
            System.out.println("FAILED");
        }

        /*
          /*
        * Test Case failed
        * FAIL
        *ACTUAL : https://www.google.com/
        *EXPECTED : www.google.com
        *
        * Then what do you do when your test case fails????
        * 1. Run script again to make sure
        * 2. Manual testing to make sure
        * 3. Now I know that expected and actual result is not the same
        * 4. Then we communicate with the BA(write acceptance criteria) or talk to developers, tech lead, test lead
        *
        * ~~~Testers do not fix a code. We reports the bugs. Developers then fix.
        *
        * 5. After verifying the there is a bug then what do you do?
        * -Follow the company procedures
        * -if they are using JIRA then open a big ticket
        *
        *
        * 6. Ticket opened, dev told you that bug is fixed.
        *-retest to make sure
        *-if all good then close the bug ticket
        *
        * */





    }

}
