package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //Define before and after annotations for your driver

    public static WebDriver driver = null;

    @Before
    public static void openBrowser(){

        // Define Bridge
        WebDriverManager.chromedriver().setup();

        //Create Object from chrome driver
        driver = new ChromeDriver();

        // Maximize screen
        driver.manage().window().maximize();

        // Implicit Waits
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // Navigate to the website
        driver.navigate().to("http://www.automationpractice.com/index.php");
    }

    @After
    public static void quiteBrowser() throws InterruptedException {

        //Driver Quite
        driver.quit();
    }
}
