package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends BaseTest {
    // set base url
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    // set up browser
    public void setUp(){
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Verify the text ‘Welcome, Please Sign
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Not redirected to Login page", expectedText, actualText);
    }
@Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Enter valid username
//        driver.findElement(By.id("Email")).sendKeys("chintaaan@yahoo.com");
    driver.findElement(By.xpath("//input[@class='email']")).sendKeys("chintaaan@yahoo.com");
        //Enter valid password
//        driver.findElement(By.id("Password")).sendKeys("chintz11");
    driver.findElement(By.xpath("//input[@class='password']")).sendKeys("chintz11");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Click on ‘LOGIN’ button
    driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
    //Verify the ‘Log out’ text is display
    driver.findElement(By.xpath("//a[@class='ico-logout']"));
    String expectedText = "Log out";
    String actualText = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
    Assert.assertEquals("Not redirected to Login page", expectedText, actualText);
    }
    @Test
    public void verifyTheErrorMessage(){
    //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginLink.click();
        //Enter invalid username
//        driver.findElement(By.id("Email")).sendKeys("chintaaan@yahoo.com");
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys("chintz@yahoo.com");
        //Enter invalid password
//        driver.findElement(By.id("Password")).sendKeys("chintz11");
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys("chintz123");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
        //Verify the error message ‘Login was unsuccessful.
        //Please correct the errors and try again. No customer account found’
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("No redirected to Login page ",expectedMessage,actualMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();}
}






