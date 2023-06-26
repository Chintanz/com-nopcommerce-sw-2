package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    //Web driver set up
    public static WebDriver driver;
    //Base url set up
    String baseUrl = "https://demo.nopcommerce.com/";

    public void openBrowser(String baseUrl){
        //  Setup Browser
        driver = new ChromeDriver();
        //Open the url
        driver.get(baseUrl);
        //Maximise browser
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser(){
        driver.close();
    }


}
