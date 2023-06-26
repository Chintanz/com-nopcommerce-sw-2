package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    //set base url
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //set up browser
    public void setUp(){
        openBrowser(baseUrl);
    }
@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //click on the ‘Register’ link
    driver.findElement(By.xpath("//a[@class='ico-register']")).click();
      //Verify the text ‘Register’
    WebElement registerText = driver.findElement(By.xpath("//a[text()='Register']"));
    String text = registerText.getText();
    System.out.println(text);
    Assert.assertEquals("Register",text);
}
@Test
    public void userSholdRegisterAccountSuccessfully(){
    //click on the ‘Register’ link
    driver.findElement(By.xpath("//a[@class='ico-register']")).click();
    //Select gender radio button
driver.findElement(By.xpath("//input[@id='gender-male']")).click();
    //Enter First name
    driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Chintan");
    // Enter Last name
    driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Zaveri");
    //Select Day Month and Year
    driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("4");
    driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("9");
    driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1985");
    //Enter Email address
    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("chintaaan@yahoo.com");
    //Enter Password
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("chintz11");
    // Enter Confirm password
    driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("chintz11");
    //Click on REGISTER button
    driver.findElement(By.xpath("//button[@name='register-button']")).click();
    //Verify the text 'Your registration completed’
   WebElement registerCompleted = driver.findElement(By.xpath("//div[@class='page-body']//div[text()='Your registration completed']"));
    String text = registerCompleted.getText();
    System.out.println(text);
    Assert.assertEquals("Your registration completed",text);


}

}
